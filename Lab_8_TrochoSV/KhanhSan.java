package Lab_8_TrochoSV;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Scanner;

public class KhanhSan{
    private int typerT;
    private int price_T;
    private LocalDate dayT=LocalDate.now() ;
    private DateTimeFormatter fomat_today=DateTimeFormatter.ofPattern("dd/MM/yyyy"); private String fomat_dayT;
    private ArrayList<Person> people= new ArrayList<>();
    public KhanhSan(){ }
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap loai phong : "); typerT=sc.nextInt();
        System.out.print("Nhap gia Phong : "); price_T=sc.nextInt();
        System.out.print("Nhap so nguoi: "); int isPer=sc.nextInt();sc.nextLine();
        for(int i=0;i<isPer;i++){
            Person p=new Person();
            p.input_Person();
            people.add(p);
        }
    }
    public void show(){
        fomat_dayT=dayT.format(fomat_today);
        System.out.println("Ngay Thue: "+fomat_dayT+"\nLoai Phong: "+typerT+"\nGia Phong: "+price_T+"\nSo nguoi: "+people.size()+"\n ////Danh Sach///");
        for(Person p:people){
            p.output_Person();
        }

    }
}
