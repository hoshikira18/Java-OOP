package controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.StudentView;
import model.StudentModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ADMIN
 */
public class StudentController {

    Scanner sc = new Scanner(System.in);
    private DBContext db = new DBContext();
    private StudentView view = new StudentView();

    public void showDetail(StudentModel student) {
        view.showDetailStudent(student);
    }

    public void showAllStudents() throws IOException, FileNotFoundException, ClassNotFoundException {
        List<StudentModel> students = db.getAllStudent();
        view.showAllStudents(students);
    }

    public void addStudent(String id, String name, int age) throws IOException {
        StudentModel student = new StudentModel(id, name, age);

        db.addStudent(student);
    }

    public void searchStudent(String name) throws IOException, FileNotFoundException, FileNotFoundException {
        try {
            List<StudentModel> studentsFouned = db.searchStudentByName(name);
            view.showAllStudentsFouned(studentsFouned);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StudentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void checkStudentExistByMSSV(String mssv) throws IOException {
        try {
            if(db.checkStudentExistByMSSV(mssv)) {
                view.studentExist();
            }
        } catch (FileNotFoundException ex) {
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StudentController.class.getName()).log(Level.SEVERE, null, ex);
        }
  
    }

    public void updateStudent(String mssv) throws IOException, FileNotFoundException, ClassNotFoundException {
        view.showDetailStudent(db.getStudent(mssv));
        if (!db.checkStudentExistByMSSV(mssv)) {
//            view.studentNotFound();
        } else {
            int choice2 = 0;
            final int option2 = 3;
            while (choice2 != option2) {
                try {
                    view.showUpdateSlections();
                    choice2 = sc.nextInt();
                    switch (choice2) {
                        case 1:
                            sc.nextLine();
                            System.out.print("Enter name: ");
                            String name = sc.nextLine();
                            db.updateStudent(mssv, "name", name);
                            break;
                        case 2:
                            System.out.print("Enter age: ");
                            int age = sc.nextInt();
                            db.updateStudent(mssv, "age", Integer.toString(age));
                            break;
                        case option2:
                            break;
                    }
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(StudentController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
