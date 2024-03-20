package controller;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.StudentModel;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ADMIN
 */
public class DBContext {

    private final String dbFolderPath = "src/main/resources/students";

    protected FileInputStream fis = null;
    protected ObjectInputStream ois = null;
    protected FileOutputStream fos = null;
    protected ObjectOutputStream oos = null;

    public List<StudentModel> getAllStudent() throws FileNotFoundException, IOException, ClassNotFoundException {

        List<StudentModel> students = new ArrayList<StudentModel>();
        File folder = new File(dbFolderPath);

        for (File file : folder.listFiles()) {
            if (file.getName().compareTo("index.dat") != 0) {
                fis = new FileInputStream(dbFolderPath + "\\" + file.getName());
                ois = new ObjectInputStream(fis);
                students.add((StudentModel) ois.readObject());
            }
        }
        ois.close();
        fis.close();
        return students;
    }

    public StudentModel getStudent(String mssv) throws FileNotFoundException, IOException, ClassNotFoundException {

        fis = new FileInputStream(dbFolderPath + "\\" + mssv + ".dat");
        ois = new ObjectInputStream(fis);

        return (StudentModel) ois.readObject();
    }

    public void addStudent(StudentModel student) throws FileNotFoundException, IOException {
        fos = new FileOutputStream(dbFolderPath + "\\" + student.getId() + ".dat");
        oos = new ObjectOutputStream(fos);
        oos.writeObject(student);
        oos.close();
        fos.close();
        oos = null;
        fos = null;
        addTag(student);
    }

    
    public void updateStudent(String mssv, String option, String value) throws IOException, ClassNotFoundException {
        fis = new FileInputStream(dbFolderPath + "\\" + mssv + ".dat");
        ois = new ObjectInputStream(fis);
        StudentModel student = (StudentModel) ois.readObject();
        if (option.compareTo("name") == 0) {
            student.setName(value);
        } else if (option.compareTo("age") == 0) {
            student.setAge(Integer.parseInt(value));
        }
        ois.close();
        fis.close();
        updateTag(mssv, option, value);
        fos = new FileOutputStream(dbFolderPath + "\\" + student.getId() + ".dat");
        oos = new ObjectOutputStream(fos);
        oos.writeObject(student);
        oos.close();
        fos.close();
    }

    public List<StudentModel> searchStudentByName(String name) throws FileNotFoundException, IOException, ClassNotFoundException {
        List<StudentModel> studentsFouned = new ArrayList<>();
        fis = new FileInputStream(dbFolderPath + "\\index.dat");
        Scanner sc = new Scanner(fis);

        while (sc.hasNextLine()) {
            String[] tag = sc.nextLine().split("-");
            String nameInLine = tag[1];
            if (nameInLine.contains(name)) {
                fis = new FileInputStream(dbFolderPath + "\\" + tag[0] + ".dat");
                ois = new ObjectInputStream(fis);
                studentsFouned.add((StudentModel) ois.readObject());
                ois.close();
                fis.close();
            }
        }

        return studentsFouned;
    }

    public boolean checkStudentExistByMSSV(String mssv) throws FileNotFoundException, IOException, ClassNotFoundException {
        List<String> allLines = Files.readAllLines(Paths.get(dbFolderPath + "\\index.dat"));
        boolean isFouned = false;
        for (String line : allLines) {
            if (line.contains(mssv)) {
                isFouned = true;
                return isFouned;
            }
        }

        return isFouned;
    }

    public void addTag(StudentModel student) throws IOException{
        String tag = student.getId() + "-" + student.getName() + "\n";
        try {
            fos = new FileOutputStream(dbFolderPath + "\\index.dat", true);
            byte[] bytes = tag.getBytes();
            fos.write(bytes);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            fos.close();
        }
    }

    public void updateTag(String mssv, String option, String value) throws FileNotFoundException, IOException {
        if (option.compareTo("name") == 0) {
            String newIndex = "";

            List<String> allLines = Files.readAllLines(Paths.get(dbFolderPath + "\\index.dat"));

            for (int i = 0; i < allLines.size(); i++) {
                if (allLines.get(i).contains(mssv)) {
                    newIndex += mssv + "-" + value + "\n";
                    System.out.println("contain: " + allLines.get(i));
                } else {
                    newIndex += allLines.get(i) + "\n";
                }
            }

            fos = new FileOutputStream(dbFolderPath + "\\index.dat", false);
            byte[] bytes = newIndex.getBytes();
            fos.write(bytes);
            fos.close();
        }
    }

    public void deteleStudent(String mssv) throws IOException {
        File data = new File(dbFolderPath + "\\" + mssv + ".dat");
        data.delete();
        deleteTag(mssv);
    }
    
    public void deleteTag (String mssv) throws IOException {
        String newIndex = "";
        
        List<String> allLines = Files.readAllLines(Paths.get(dbFolderPath + "\\index.dat"));
        
        for (String line : allLines) {
            if(!line.contains(mssv)) {
                newIndex += line + "\n";
            }
        }
        fos = new FileOutputStream(dbFolderPath + "\\index.dat", false);
        byte[] bytes = newIndex.getBytes();
        fos.write(bytes);
        fos.close();
    }
}
