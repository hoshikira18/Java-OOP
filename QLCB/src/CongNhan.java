/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class CongNhan extends CanBo {
    private int bac;
    
    public CongNhan(String hoTen, int age, String gender, String address, int bac) {
        super(hoTen, age, gender, address);
        this.bac = bac;
    }
    
    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Bac: "+ bac);
    }
}
