/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class Wall {
    private String place;
    private int area;

    public Wall() {
    }

    public Wall(String place, int area) {
        this.place = place;
        this.area = area;
    }

    public String getPlace() {
        return place;
    }

    public int getArea() {
        return area;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return this.place + "," + this.area;
    }
    
    
}
