
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ADMIN
 */
public class TaskList extends ArrayList<String> implements ITask {

    @Override
    public double getWorkingHours(String place) {

        double wh = 0;
        for (String task : this) {
            if (place.compareTo("HCM") == 0 || place.compareTo("hcm") == 0) {
                wh += 5;
            } else {
                wh += 2;
            }
        }

        return wh;
    }

    @Override
    public String getTaskName(String place) {
        
        String s = "";
        
        for (String task : this) {
            String t = task.split("@")[0];
            String p = task.split("@")[1].toLowerCase();
            
            if(p.contains(place.toLowerCase())) {
                s = s + t + ";";
            }
            
        }
        
        
        return s;
    }

    public void addTask(String task) {
        this.add(task);
    }

}
