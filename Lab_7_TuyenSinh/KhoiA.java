package Lab_7_TuyenSinh;

import java.util.Scanner;

public class KhoiA extends qlyTuyenSinh{
    public KhoiA(){
    }
    double toan, ly, hoa;
    @Override
    public void input_Student() {
        super.input_Student();
        Scanner sc = new Scanner(System.in);
        System.out.print("Diem Toan: ");toan=sc.nextDouble();
        System.out.print("Diem Ly: ");ly=sc.nextDouble();
        System.out.print("Diem hoa: ");hoa=sc.nextDouble();
    }
    public void output_Address(){
        super.output_Student();
        System.out.println("Diem Toan: "+toan);
        System.out.println("Diem Ly: "+ly);
        System.out.println("Diem hoa: "+hoa);
    }
}