package Lab_9_DHCNGTVT;

import java.util.ArrayList;
import java.util.Scanner;

public class GiaoVien {
    protected String hoTen;
    protected int namSinh;
    protected String queQuan;

    public GiaoVien() {
    }


    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập họ và tên: ");
        this.hoTen = scanner.nextLine();
        System.out.print("Nhập năm sinh: ");
        this.namSinh = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng trống sau khi nhập số
        System.out.print("Nhập quê quán: ");
        this.queQuan = scanner.nextLine();
    }

    public void hienThiThongTin() {
        System.out.println("Họ và tên: " + hoTen);
        System.out.println("Năm sinh: " + namSinh);
        //System.out.println("Quê quán: " + queQuan);
    }
}
