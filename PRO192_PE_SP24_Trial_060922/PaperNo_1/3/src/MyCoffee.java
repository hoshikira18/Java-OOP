
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class MyCoffee implements ICoffee {
    
    public static int getdv(int a) {
        int x;
        String s = a + "";
        StringBuilder s1 = new StringBuilder();
        s1.append(s.charAt(s.length()-1));
        s=s1.toString();
        x=Integer.parseInt(s);
        return x;
    }
    
    @Override
    public int f1 (List<Coffee>t) {
        
        int count = 0;
        
        for (Coffee coffee : t) {
            if(coffee.getName().contains("A") || coffee.getName().contains("B")) {
                count+=0;
            }
            else {
                count++;
            }
        }
        
        return count;
        
    }
    
    @Override
    public void f2 (List<Coffee>t) {
        int max = t.get(0).getSize();
        int vt = 0;
        
        for (int i = 1; i < t.size(); i++) {
            if(max < t.get(i).getSize()) {
                max = t.get(i).getSize();
            }
        }
        
        for (int i = 0; i < t.size(); i++) {
            if(t.get(i).getSize() == max) {
                vt = i;
                break;
            }
        }
        t.remove(vt);
        
        
    }
    
    @Override
    public void f3 (List<Coffee>t) {
                Coffee A = new Coffee();
        Coffee B = new Coffee();
Coffee tg = new Coffee();

        for (int i = 0; i < 3; i++) {
            int a = getdv(t.get(i).getSize());
            A = t.get(i);
            for(int j = i + 1; j < 3; j++ ){
                int b = getdv(t.get(j).getSize());
                B = t.get(j);
                if(a<b) {
                    tg=A;A=B;B=tg;
                    t.set(i, A);
                    t.set(j, B);
                }
            }
        }

    }
}
