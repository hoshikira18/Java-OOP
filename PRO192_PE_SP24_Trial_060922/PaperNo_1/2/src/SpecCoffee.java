/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class SpecCoffee extends Coffee {
    private int price;
    public SpecCoffee () {
        
    }

    public SpecCoffee(String name,int size,int price) {
        super(name, size);
        this.price = price;
    }
    
    @Override
    public String toString() {
        return getName() + "," + getSize() + "," + price;
    }
    
    public void setData () {
        super.setName("CF" + super.getName());
    }
    
    public int getValue () {
        if(super.getSize() > 10) {
            return price;
        }
        else {
            return price + 5;
        }
        
    }
    
    
}
