/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class Zebra {
    private String owner;
    private int weight;

    public Zebra() {
    }

    public Zebra(String owner, int weight) {
        this.owner = owner;
        this.weight = weight;
    }

    public String getOwner() {
        
        String result = "";
        String[] s = this.owner.split("");
        
        for (String e : s) {
            if(Character.isDigit(e.charAt(0)) && Integer.parseInt(e) % 2 ==0 ){
                result+="";
            }
            else {
                result += e;
            }
        }
        
        return result;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight - this.owner.length();
    }
    
    
}
