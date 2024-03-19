/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ADMIN
 */
public class Doctor extends Person implements IStudy {
    
    private int level;

    public int getLevel() {
        return this.level;
    }
    
    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public void study(String sub) {
        System.out.println(this.getName() + " Level:" + this.level + " is Learning " + sub);
    }
    
}
