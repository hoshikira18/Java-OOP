/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class MyClass implements IProcess {

    @Override
    public int countWords(String str1, String str2) {
        String[] s = str1.split(" ");
        
        int count = 0;
        for (String string : s) {
            if(string.toLowerCase().compareTo(str2.toLowerCase()) == 0) {
                count++;
            }
        }
        
        return count;
    }

    @Override
    public String getLastWord(String str) {
        String[] result = str.split(" ");
        String s = result[result.length - 1];
        s = s.substring(0, 1).toUpperCase() + s.substring(1);
        
        return s;
    }
    
    
    
}
