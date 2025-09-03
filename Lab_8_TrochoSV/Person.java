package Lab_8_TrochoSV;

import java.time.LocalDate;
import java.util.Scanner;

public class Person extends KhanhSan{
    private String name,idCCCD;
    int birthYear,age;
    public Person(){}
    public void input_Person(){
        Scanner sc = new Scanner(System.in);
        LocalDate today=LocalDate.now();
        System.out.print("Nhap ma CC: "); idCCCD=sc.nextLine();
        System.out.print("Nhap ho va ten: "); name=sc.nextLine();
        //System.out.print("Nhap ma age: ");age=sc.nextLine();
        System.out.print("Nhap ma nam sinh: "); birthYear=sc.nextInt();sc.nextLine();
        age= today.getYear() - birthYear;
    }
    public void output_Person(){
        System.out.println("\n   CCCD: "+idCCCD+"\n   Ho va ten: "+name+"\n   Tuoi: "+age);
    }

}
