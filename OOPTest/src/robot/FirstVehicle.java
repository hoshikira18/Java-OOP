/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package robot;

/**
 *
 * @author ADMIN
 */
public class FirstVehicle extends Vehicle implements IFlyable{
    public int speed;
    public FirstVehicle(int speed) {
        this.speed = speed;
    }
    
    @Override
    public void displayInfo () {
        System.out.print("speed: " + speed + " ");
        super.displayInfo();
        System.out.println("");
    }
    
    @Override
    public void up() {
        System.out.println("id:" + id + " is flying UP");
    }
    
    @Override
    public void down() {
        System.out.println("id:" + id + " is flying DOWN");
    }
    
}
