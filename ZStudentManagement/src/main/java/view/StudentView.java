package view;

import model.StudentModel;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ADMIN
 */
public class StudentView {

    public void showHomePage() {
        System.out.println("+-------------------------------------------------+");
        System.out.println("|                                                 |");
        System.out.println("|              Student Management System          |");
        System.out.println("|                                                 |");
        System.out.println("+-------------------------------------------------+");
        System.out.println("| 1. Add New Student                              |");
        System.out.println("| 2. View All Students                            |");
        System.out.println("| 3. Update Student Information                   |");
        System.out.println("| 4. Delete Student                               |");
        System.out.println("| 5. Search Student                               |");
        System.out.println("| 6. Exit                                         |");
        System.out.println("+-------------------------------------------------+");
        System.out.print("Please select an option (1-6):");
    }

    public void showAllStudents(List<StudentModel> students) {
        System.out.println("+---------------------------------+");
        System.out.println("|          Student Details        |");
        System.out.println("+---------------------------------+");
        for (StudentModel student : students) {
            showDetailStudent(student);
        }
    }

    public void studentNotFound() {
        System.out.println("");
        System.out.println("+---------------------------------+");
        System.out.println("|         Student Not Found!      |");
        System.out.println("+---------------------------------+");
        System.out.println("");
    }

    public void studentExist() {
        System.out.println("");
        System.out.println("+---------------------------------+");
        System.out.println("|          Student Exist!         |");
        System.out.println("+---------------------------------+");
        System.out.println("");
    }

    public void showAllStudentsFouned(List<StudentModel> studentsFouned) {
        if (studentsFouned.size() == 0) {
            studentNotFound();
        } else {
            showAllStudents(studentsFouned);
        }
    }

    public void showDetailStudent(StudentModel student) {
        System.out.println("+---------------------------------+");
        System.out.println("| ID: " + padRight(student.getId(), 28) + "|");
        System.out.println("| NAME: " + padRight(student.getName(), 26) + "|");
        System.out.println("| AGE: " + padRight(String.valueOf(student.getAge()), 27) + "|");
        System.out.println("+---------------------------------+");
    }

    // Helper method to pad strings on the right for alignment
    private String padRight(String s, int n) {
        return String.format("%-" + n + "s", s);
    }

    public void showUpdateSlections() {
        System.out.println("+-------------------------------------------------+");
        System.out.println("|                                                 |");
        System.out.println("|                  Show Update Field              |");
        System.out.println("|                                                 |");
        System.out.println("+-------------------------------------------------+");
        System.out.println("| 1. Update name                                  |");
        System.out.println("| 2. Update age                                   |");
        System.out.println("| 3. Exit                                         |");
        System.out.println("+-------------------------------------------------+");
        System.out.print("Please select an option (1-3):");
    }

    public void deleteSuccess() {
        System.out.println("");
        System.out.println("+---------------------------------+");
        System.out.println("|          Detele Success!        |");
        System.out.println("+---------------------------------+");
        System.out.println("");
    }
}
