package Lab_11_SoPhuc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phức A:");
        SoPhuc A = new SoPhuc();
        A.nhap(sc);
        System.out.println("Nhập số phức B:");
        SoPhuc B = new SoPhuc();
        B.nhap(sc);
        SoPhuc C = A.nhan(B);
        System.out.println("Tích C = A x B là:");
        C.hienThi();
        sc.close();
    }
}