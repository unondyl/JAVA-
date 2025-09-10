package Lab_12_C2;

import java.util.Scanner;

public class CanBo {
    private String name, birthday,sex,address;
    public CanBo(){}
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("NHAP THONG TIN");
        System.out.print("Ho va ten: ");name=sc.nextLine();
        System.out.print("Nam Sinh ");birthday=sc.nextLine();
        System.out.print("Gioi Tinh: ");sex=sc.nextLine();
        System.out.print("Dia chi: ");address = sc.nextLine();
    }
    public void OutPrint(){
        System.out.println("Họ và tên: "+name);
        System.out.println("Sinh ngày: "+birthday);
        System.out.println("Giới tính: "+sex);
        //System.out.println("Đchỉ: "+ address);
    };
    public String getName(){
        return name;
    }
}
