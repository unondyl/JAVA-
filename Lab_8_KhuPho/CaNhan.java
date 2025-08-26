package Lab_8_KhuPho;

import java.util.Scanner;

public class CaNhan {
    public String name,age,birthyear,job;
    public void genaral_input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Ho va ten: "); name=sc.nextLine();
        System.out.print("Tuoi: ");age=sc.nextLine();
        System.out.print("Nam Sinh: ");job=sc.nextLine();
        System.out.print("Nghe Nghiep: ");birthyear=sc.nextLine();
    }
    public void genaral_output()
    {
        System.out.println("Ho va ten: "+name);
        System.out.println("Tuoi: "+age);
        System.out.println("Nam Sinh: "+job);
        System.out.println("Nghe Nghiep: "+birthyear);
    }
}