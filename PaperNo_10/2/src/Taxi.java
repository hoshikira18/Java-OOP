/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class Taxi {
    private String driver;
    private int age;

    public String getDriver() {
        return driver;
    }

    public int getAge() {
        return age;
    }

    public Taxi() {
    }

    public Taxi(String driver, int age) {
        this.driver = driver;
        this.age = age;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return driver + "," + age;
    }
    
}
