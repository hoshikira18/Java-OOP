/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class Table {
    private String name;
    private int leg;

    public Table() {
    }

    public Table(String name, int leg) {
        this.name = name;
        this.leg = leg;
    }

    public String getName() {
        String s = "";
        for(int i = 3; i >= 1; i--){
            if(i == 2) {
                s+=(name.charAt(name.length()-i)+"").toLowerCase();
            }
            else
                s+=name.charAt(name.length()-i);
        }
        return s;
    }

    public int getLeg() {
        return leg;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }
    
}
