/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package robot;

/**
 *
 * @author ADMIN
 */
public class Vehicle {
    int id;
    String name;
    
    public void setId(int id) {
        this.id = id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void displayInfo () {
        System.out.print("id: " + id + " ");
        System.out.print("name: " + name + " ");
    }
}
