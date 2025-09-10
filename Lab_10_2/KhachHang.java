package Lab_10_2;

import java.util.Scanner;

public class KhachHang {
    private String name,numHome,seri;
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");name=sc.nextLine();
        System.out.print("Enter number home: ");numHome=sc.nextLine();
        System.out.print("Enter seri: ");seri=sc.nextLine();
    }
    public void show() {
        System.out.println("Name: "+name);
        System.out.println("Number home: "+numHome);
        System.out.println("Seri: "+seri);
    }
}
