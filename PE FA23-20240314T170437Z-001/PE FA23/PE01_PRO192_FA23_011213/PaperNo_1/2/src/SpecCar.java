/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class SpecCar extends Car {
    private int warranty;

    public SpecCar() {
    }
  

    public SpecCar(String name,double price,int warranty) {
        super(name, price);
        this.warranty = warranty;
    }

    @Override
    public String toString() {
        return super.toString()+"," +warranty ; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    public int getWarranty() {
        if(super.getName().toLowerCase().compareTo("audi") == 0) {
                    return warranty + 5;
        }
        return warranty + 2;
    }
    
    
    
}
