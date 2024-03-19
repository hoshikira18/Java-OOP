/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class House {

    private String type;
    private int area;

    public House() {
    }

    public House(String type, int area) {
        this.type = type;
        this.area = area;
    }

    public String getType() {
        String s = type.substring(type.length() - 3);

        StringBuilder result = new StringBuilder();

        result.append(s);

        return result.reverse()+"";
    }

    public int getArea() {
        return this.area;
    }

    public void setArea(int area) {
        this.area = area*3;
    }

}
