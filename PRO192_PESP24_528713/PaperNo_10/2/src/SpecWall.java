/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class SpecWall extends Wall {
    private String color;

    public SpecWall() {
    }

    public SpecWall(String color) {
        this.color = color;
    }

    public SpecWall(String place, int area, String color) {
        super(place, area);
        this.color = color;
    }

    @Override
    public String toString() {
        return super.getPlace() + "," + this.color + "," + super.getArea();
    }
    
    public void setData() {
        String s = super.getPlace().replaceAll("[^a-zA-Z]", "");
        super.setPlace(s);
    }
    
    public String getValue () {
        
        if(super.getArea() % super.getPlace().length() != 0) {
            return this.color;
        }
        
        return this.color + super.getArea() / super.getPlace().length();
    }
}
