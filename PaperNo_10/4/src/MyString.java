/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class MyString implements IString {

    public boolean checkPalindrome(String e) {
        if(e.trim().length() < 2) {
            return false;
        }
        else if (e.trim().length() == 2 && e.trim().split("")[0].compareTo(e.trim().split("")[1]) == 0) {
            return true;
        } else {
            int n = e.trim().length() / 2;

            String[] E = e.trim().split("");
            for (int i = 0; i < n; i++) {
                if (E[i].compareTo( E[E.length - i - 1])!= 0) {
                    return false;
                }
            }
        }

        return true;
    }

    @Override
    public int f1(String s) {
        int count = 0;
        String[] string = s.split(" ");
        for (String string1 : string) {
            if(string1.trim().length() >= 2 && checkPalindrome(string1.trim())) {
            count++;
        }
        }
        
        return count;
    }

    @Override
    public String f2(String string) {
        String[] s = string.split(" ");
        
        String a = "";
        
        for (int i = 1; i < s.length; i++) {
            if(s[i].trim().length() > a.length()) {
                a = s[i].trim();
            }
        }
        return a;
    }

}
