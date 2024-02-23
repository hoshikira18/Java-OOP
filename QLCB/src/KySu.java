/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class KySu extends CanBo {
    private String nganhDaoTao;
    
    public KySu(String hoTen, int age, String gender, String address, String nganhDaoTao) {
        super(hoTen, age, gender, address);
        this.nganhDaoTao = nganhDaoTao;
    }
    
    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Nganh dao tao: "+ nganhDaoTao);
    }
}
