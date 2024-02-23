/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class NhanVien extends CanBo{
    private String congViec;
    
    public NhanVien(String hoTen, int age, String gender, String address, String congViec) {
        super(hoTen, age, gender, address);
        this.congViec = congViec;
    }
    
    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Cong viec: "+ congViec);
    }
}
