package Lab_7_TuyenSinh;

import java.util.Scanner;

public class KhoiB extends qlyTuyenSinh{
    public KhoiB(){
    }
    double toan, Sinh, hoa;
    @Override
    public void input_Student() {
        super.input_Student();
        Scanner sc = new Scanner(System.in);
        System.out.print("Diem Toan: ");toan=sc.nextDouble();
        System.out.print("Diem hoa: ");hoa=sc.nextDouble();
        System.out.print("Diem Sinh: ");Sinh =sc.nextDouble();
    }
    public void output_Address(){
        super.output_Student();
        System.out.println("Diem Toan: "+toan);
        System.out.println("Diem hoa: "+hoa);
        System.out.println("Diem Sinh: "+ Sinh);
    }
}