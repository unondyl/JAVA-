package Lab_12_C1;

import java.util.Scanner;

public class PTGT {
    private String hsx,nsx,gia, color;
    public PTGT(){};
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("[Nhap Thong Tin]");
        System.out.print("Hang SX: ");hsx=sc.nextLine();
        System.out.print("Nam SX: ");nsx=sc.nextLine();
        System.out.print("Gia: ");gia=sc.nextLine();
        System.out.print("Color: ");color=sc.nextLine();
    }
    public void show(){
        System.out.println("Hang SX: "+hsx);
        System.out.println("Nam SX: "+nsx);
        System.out.println("Gia: "+gia);
        System.out.println("Color: "+color);
    }
    public String getColor() {
        return color;
    }
    // Main program
}
