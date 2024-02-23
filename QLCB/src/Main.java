/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QLCB qlcb = new QLCB();
        
        int choice = 0;
        
        do {
            System.out.println("======= Menu =======");
            System.out.println("1. Them moi can bo");
            System.out.println("2. Tim kiem theo ho ten");
            System.out.println("3. Hien thi thong tin ve danh sach can bo");
            System.out.println("4. Thoat khoi chuong trinh");
            System.out.println("====================");
            
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("Chon kieu can bo:");
                    System.out.println("1. Cong nhan");
                    System.out.println("2. Ky su");
                    System.out.println("3. Nhan vien");
                    System.out.println("====================");
                    
                    int type = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.print("Nhap Ho ten: ");
                    String hoTen = scanner.nextLine();
                    
                    System.out.print("Nhap tuoi: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.println("Nhap gioi tinh: ");
                    String gender = scanner.nextLine();
                    
                    System.out.println("Nhap dia chi: ");
                    String address = scanner.nextLine();
                    
                    switch (type) {
                        case 1:
                            System.out.println("Nhap bac");
                            int bac = scanner.nextInt();
                            CongNhan congNhan = new CongNhan(hoTen, age, gender, address, bac);
                            qlcb.addCanBo(congNhan);
                            break;
                        case 2:
                            System.out.println("Nhap nganh dao tao: ");
                            String nganhDaoTao = scanner.nextLine();
                            KySu kySu = new KySu(hoTen, age, gender, address, nganhDaoTao);
                            qlcb.addCanBo(kySu);
                            break;
                        case 3:
                            System.out.println("Nhap cong viec: ");
                            String congViec = scanner.nextLine();
                            NhanVien nhanVien = new NhanVien(hoTen, age, gender, address, congViec);
                            qlcb.addCanBo(nhanVien);
                            break;
                        default:
                            System.out.println("Khong hop le");
                    }
                    break;
                case 2:
                    System.out.print("Nhap ten can bo can tim kiem: ");
                    scanner.nextLine();
                    String nameA = scanner.nextLine();
                    qlcb.searchCanBo(nameA);
                    break;
                case 3:
                    qlcb.printAllCAnBo();
                    break;    
                case 4:
                    break;    
                default:
                    System.out.println("Hay nhap lai lua chon cua ban (1 - 4)");
            }
        }
        while (choice != 4);
        
        System.out.println("Ban da thoat!");
    }
    
}
