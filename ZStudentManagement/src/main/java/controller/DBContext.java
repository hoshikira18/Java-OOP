package controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
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
        fis.close();
        updateTag(mssv, option, value);
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
            }
        }

        return studentsFouned;
    }

    public boolean checkStudentExistByMSSV(String mssv) throws FileNotFoundException, IOException, ClassNotFoundException {
        fis = new FileInputStream(dbFolderPath + "\\index.dat");
        Scanner sc = new Scanner(fis);
        boolean isFouned = false;
        while (sc.hasNextLine()) {
            String[] tag = sc.nextLine().split("-");
            String mssvInLine = tag[0];
            if (mssvInLine.compareTo(mssv) == 0) {
                isFouned = true;
                return isFouned;
            }
        }
        fis.close();

        return isFouned;
    }

    public void addTag(StudentModel student) throws FileNotFoundException, IOException {
        String tag = student.getId() + "-" + student.getName() + "\n";
        fos = new FileOutputStream(dbFolderPath + "\\index.dat", true);
        byte[] bytes =  tag.getBytes();
        fos.write(bytes);
        fos.close();
    }

    public void updateTag(String mssv, String option, String value) throws FileNotFoundException, IOException {
        if (option.compareTo("name") == 0) {
            String newIndex = "";
            
            List<String> allLines = Files.readAllLines(Paths.get(dbFolderPath + "\\index.dat"));
            
            for (int i = 0; i < allLines.size(); i++) {
                if(allLines.get(i).contains(mssv)) {
                    newIndex += mssv + "-" + value + "\n";
                    System.out.println("contain: " + allLines.get(i));
                }
                else{
                    newIndex += allLines.get(i) + "\n";
                }
            }
            
            System.out.println(newIndex);

            fos = new FileOutputStream(dbFolderPath + "\\index.dat", false);
            byte[] bytes = newIndex.getBytes();
            fos.write(bytes);
            fos.close();
        }
    }

}
