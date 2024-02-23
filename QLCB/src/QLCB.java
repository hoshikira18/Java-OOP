/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class QLCB {
    public int n = 0;
    public CanBo[] danhSachCanBo = new CanBo[10000];
    
    public void addCanBo(CanBo canBo) {
        n = n+1;
        danhSachCanBo[n-1] = canBo;
    }
    
    public void searchCanBo(String hoTen) {
        int isExist = 0;
        for (CanBo canBo : danhSachCanBo) {
            if (canBo != null && canBo.hoTen.contains(hoTen)) {
                canBo.hienThiThongTin();
                isExist++;
            }
        }
        if(isExist == 0) {
            System.out.println("Khong tim thay can bo!");
        }
    }
    
    public void printAllCAnBo() {
        for(int i = 0; i < n; i++) {
            System.out.println("=======================");
            danhSachCanBo[i].hienThiThongTin();
        }
    }
}
