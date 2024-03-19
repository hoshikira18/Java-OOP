
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
public class MyLift implements ILift {
    
    public boolean isPrime (int n) {
        for (int i = 2; i < n; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int f1(List<Lift> t) {
        int result = 0;
        
        for (Lift e : t) {
            if(e.getLoad() > result && isPrime(e.getLabel().length())) {
                result = e.getLoad();
            }
        }
        return result;
    }

    @Override
    public void f2(List<Lift> t) {
        Collections.reverse(t.subList(0, 5));
    }

    @Override
    public void f3(List<Lift> t) {
        int count = 0;
        
        for (int i = 0; i < t.size(); i++) {
            if(t.get(i).getLoad()< 20) {
                count++;
                if(count == 2) {
                    t.remove(i);
                }
                
            }
        }
    }
    
}
