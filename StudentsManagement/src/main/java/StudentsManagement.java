
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author ADMIN
 */
public class StudentsManagement {

    public static void main(String[] args) { 

        DBContext db = new DBContext();
        
        Student s = new Student();
        s.setId(1);
        s.setName("Dao Thi Nu");
//        s.setMssv("HE123456");
        db.insert(s);
        
    }
}
