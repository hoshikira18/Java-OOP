/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class Square extends Rectangle {

    private String unit;

    public Square(int side) {
        super(side, side);
        this.unit = "cm";
    }

    public void setSquare(int side) {
        if (side >= 0) {
            super.setLength(side);
            super.setWidth(side);
        }
    }

    public int getPerimeter() {
        int p = 0;
        p+= 4*super.getLength();
        return p;
    }

    public void output() {
        System.out.println("the side of the square="+super.getLength()+"("+this.unit+")");
        System.out.println("the perimeter of the square="+this.getPerimeter()+"("+this.unit+")");
    }

}
