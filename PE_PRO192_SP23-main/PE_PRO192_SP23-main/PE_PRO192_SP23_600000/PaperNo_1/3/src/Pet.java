
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class Pet implements ITax {
    private String name;
    private String birthday;
    private ArrayList<Service> usedServices = new ArrayList<Service>();

    public Pet(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }
    
    public void addService(String nameService, int price) {
        Service s = new Service(name, price);
        usedServices.add(s);
    }
    
    @Override
    public String toString() {
        String result = "";
        
        result = result + this.name + "-" + getTotalMoney() + "-" + getTax();
        
        return result;
    }

    @Override
    public double getTax() {
        return VAT * getTotalMoney();
    }

    @Override
    public double getTotalMoney() {
        double result = 0;
        
        for (Service usedService : usedServices) {
            result += usedService.getPrice();
        }
        
        int month = Integer.parseInt(this.birthday.split("/")[0]);
        
        if(month >= 10 && month <= 12) {
            result *= 0.95;
        }
        
        return result;
    }
}
