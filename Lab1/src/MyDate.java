import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Bui Thi Nhu
 */
public class MyDate {
    int day, month, year;
    public MyDate(){
        
    }
    public MyDate(MyDate d){
      day=d.day;
      month=d.month;
      year=d.year;
    }
    public void nhap(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap ngay:");
        day=sc.nextInt();
        System.out.println("Nhap thang:");
        month=sc.nextInt();
        System.out.println("Nhap nam:");
        year=sc.nextInt();
    }
    public void xuat(){
        System.out.println("Ngay:"+ day+"\nThang:"+month);
        System.out.println("Nam:"+ year);
    }
}