
import controller.StudentController;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import view.StudentView;



public class ZStudentManagement {

    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        StudentView view = new StudentView();
        StudentController controller = new StudentController();

        int choice = 0;
        final int option = 6;
        while(choice != option) {
            view.showHomePage();
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    sc.nextLine();
                    System.out.print("Enter student's roll number: ");
                    String mssv = sc.nextLine();
                    System.out.print("Enter student's name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter student's age: ");
                    int age = sc.nextInt();
                    controller.addStudent(mssv, name, age);
                    break;
                case 2:
                    controller.showAllStudents();
                    break;
                case 3:
                    sc.nextLine();
                    System.out.print("Enter student's roll number: ");
                    String mssvToUpdate = sc.nextLine();
                    controller.updateStudent(mssvToUpdate);
                    break;  
                    
                case 4:
                    sc.nextLine();
                    System.out.print("Enter id: ");
                    String id = sc.nextLine();
                    controller.deteleStudent(id);
                    break;
                case 5:
                    sc.nextLine();
                    System.out.print("Enter student name: ");
                    String nameToSearch = sc.nextLine();
                    controller.searchStudent(nameToSearch);
                    break;    
                case option:
                    break;
            }
        }
        
    }
}