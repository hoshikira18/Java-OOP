/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class MyString implements IString {

    public boolean isPanlindrom(String s) {
        StringBuilder s1 = new StringBuilder(s);

        if (s.equals(s1.reverse().toString())) {
            return true;
        }
        return false;
    }

    
    public int check(String s) {
        
        String[] a = s.split("");
        int count = 0;
        for (String e : a) {
            if(Character.isDigit(e.charAt(0))) {
                count++;
            }
        }
        return count;
    }
    @Override
    public int f1(String string) {
        String[] s = string.split(" ");
        
        int count = 0;
        for (String e : s) {
            if (isPanlindrom(e.trim()) && check(e.trim()) >= 3) {
                count++;
            }
        }
        return count;

    }

    @Override
    public String f2(String string) {
        
    }

}
