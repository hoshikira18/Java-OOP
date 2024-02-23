/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class CanBo {
    protected String hoTen;
    protected int age;
    protected String gender;
    protected String address;
    
    public CanBo(String hoTen, int age, String gender, String address) {
       this.hoTen = hoTen;
       this.age = age;
       this.gender = gender;
       this.address = address;
    }
    
    public void hienThiThongTin() {
        System.out.println("Ho va Ten: " + hoTen);
        System.out.println("Tuoi: " + age);
        System.out.println("Gioi tinh: " + gender);
        System.out.println("Dia chi: " + address);
    }
    
}
