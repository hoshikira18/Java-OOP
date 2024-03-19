/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class SpecTaxi extends Taxi {
    private int salary;

    public SpecTaxi() {
    }

    public SpecTaxi(int salary) {
        this.salary = salary;
    }

    public SpecTaxi( String driver, int age,int salary) {
        super(driver, age);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "," + salary;
    }
    
    public void setData() {
        String driver = super.getDriver().replaceFirst((super.getDriver().charAt(1)+""), super.getAge()+"");
        super.setDriver(driver);
    }
    
    public int getValue() {
        if((super.getAge() % 10) % 2 == 0) {
            return salary;
        }
        
        return salary + super.getAge();
    }
    
    
}
