
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class MyString implements IString {

    public boolean check (String s) {
        String[] a = s.split("");
        for (String e : a) {
            if(!e.trim().isEmpty() && !Character.isDigit(e.trim().charAt(0))){
                        

                return false;
            }
        }
        return true;
    }
    
    @Override
    public int f1(String string) {
        int count = 0;
        
        String[] s = string.split(" ");
        
        for (String e : s) {
            if(Character.isLetter(e.charAt(0)) && Character.isLetter(e.charAt(e.length() - 1))&& check(e.trim().substring(1, e.trim().length() - 1))) {
                count++;
            }
        }
        
        return count;
    }

    @Override
    public String f2(String string) {
        
        String[] s = string.split("");
        
        int[] arr = new int[s.length];
        
        
        for (int i = 0; i < s.length; i++) {
            if(Character.isDigit(s[i].charAt(0)) && Integer.parseInt(s[i]) % 2 != 0){
                arr[i]++;
            }
        }
        
        int count = 0;
        String result = "";
        
        for (int i = 0; i < arr.length; i++) {
            
            if(arr[i] > 0) {
                count = i;
                break;
            }
        }
        
        String ss = "";
        
        for (int i = count+1; i < arr.length; i++) {
            if(arr[i] <= 1 && s[i].compareTo(s[count]) != 0) {
                ss += s[i];
            }
        }
        
        result = string.substring(0, count+1) + ss;
            

    return result;
    }
    
}
