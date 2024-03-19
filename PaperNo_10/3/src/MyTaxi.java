
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ADMIN
 */
public class MyTaxi implements ITaxi {

    
    public boolean checkPalindrome (String e) {
        if(e.length() == 1 || e.length() == 2 && e.split("")[0].compareTo(e.split("")[1]) == 0) {
            return true;
        }
        else {
            int n = e.length() / 2;

            String[] E = e.split("");
            for (int i = 0; i < n; i++) {
                if (E[i].compareTo( E[E.length - i - 1])!= 0) {
                    return false;
                }
            }
        }
        
        return true;
    }
    
    @Override
    public int f1(List<Taxi> list) {
        int result = 0;

        for (Taxi e : list) {
            
            if (e.getDriver().length() >= 2 && !checkPalindrome(e.getDriver())) {
                result += e.getSalary();
            }
        }

        return result;
    }

    @Override
    public void f2(List<Taxi> list) {
        for (Taxi e : list) {
            if((e.getSalary()+"").length() == 2 && ((e.getSalary() / 10) % 2 == 0 && (e.getSalary() % 10) % 2 == 0)) {
            list.remove(e);
            break;
        }
        }
    }

    @Override
    public void f3(List<Taxi> list) {
        Collections.sort(list, (Taxi s1, Taxi s2) -> {
            return -Integer.compare(s1.getSalary(), s2.getSalary());
        });
    }

}
