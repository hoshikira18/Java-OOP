/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class Cake {
    private String maker;
    private int price;
    
    public Cake() {
        
    }

    public Cake(String maker, int price) {
        this.maker = maker;
        this.price = price;
    }

    public String getMaker() {
        
        
        String result = "";
        
        result = maker.substring(0, maker.length()-1).toLowerCase() + maker.substring(maker.length()-1).toUpperCase();
        
        return result;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}
