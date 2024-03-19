
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class ItemList extends ArrayList<Item> {
    
    public void addItem (Item item) {
        this.add(item);
    }
    
    public void printItemByQuantity(int value) {
        for (Item item : this) {
            if(item.getQuantity() == value) {
                System.out.println(item.getName() +  "," + item.getQuantity());
            }
        }
    }
    
    public int getTotalQuantity() {
        int result = 0;
        for (Item item : this) {
            result+=item.getQuantity();
        }
        return result;
    }
}
