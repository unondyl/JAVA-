package Lab_7_TuyenSinh;

import java.util.Scanner;

public class qlyTuyenSinh {
    private String id,name,address, UT;
    public qlyTuyenSinh() {}
    private Scanner sc = new Scanner(System.in);
    public void input_Student()
    {
        System.out.println("==THONG TIN CO BAN==");
        System.out.print("Nhap SBD "); id=sc.nextLine();
        System.out.print("Nhap Ho va ten: "); name=sc.nextLine();
        System.out.print("Nhap Dia chi: "); address=sc.nextLine();
        System.out.print("Nhap Uu tien: ");UT=sc.nextLine();
        System.out.println("\n===NHAP DIEM CUA THI SINH===");
    }
    public void output_Student()
    {
        System.out.println("SBD: "+id);
        System.out.println("Ho va ten: "+name);
        System.out.println("Dia chi: "+address);
        System.out.println("Uu tien: "+UT);
    }
}
