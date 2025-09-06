package Lab_9_THPT;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Hocsinh extends ngQly{
    protected String hoTen;
    protected int namSinh;
    protected String queQuan;

    public Nguoi() {
    }

    public Nguoi(String hoTen, int namSinh, String queQuan) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.queQuan = queQuan;
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
        System.out.println("Quê quán: " + queQuan);
    }
}


