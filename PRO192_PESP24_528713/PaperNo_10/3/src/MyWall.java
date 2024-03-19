
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
public class MyWall implements IWall {
    
    public boolean check (int n ) {
        for (int i = 0; i < n; i++) {
            if(i * i == n){
                return true;
            }
        }
        return false;
    }

    @Override
    public int f1(List<Wall> t) {
        int a = Integer.MAX_VALUE;
        for (Wall wall : t) {
            if(check(wall.getPlace().length())) {
                a = wall.getArea();
            }
        }
        
        return a;
        
    }

    @Override
    public void f2(List<Wall> t) {
        Collections.reverse(t.subList(3, 6));
    }

    @Override
    public void f3(List<Wall> t) {
        
        int index = 0;
        
        int max = t.get(0).getArea();
        
        for (int i = 1; i < t.size(); i++) {
            if(t.get(i).getArea() < max) {
                index = i;
            }
        }
        
        t.get(0).setPlace(t.get(index).getPlace());
        t.get(0).setArea(t.get(index).getArea());
        
    }
    
}
