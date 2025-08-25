package Lab_7_TuyenSinh;

import java.util.Scanner;

public class KhoiC extends qlyTuyenSinh{
    public KhoiC(){
    }
    private double Van,Su,Dia;
    @Override
    public void input_Student() {
        super.input_Student();
        Scanner sc = new Scanner(System.in);
        System.out.print("Diem : ");Van=sc.nextDouble();
        System.out.print("Diem Su: ");Su=sc.nextDouble();
        System.out.print("Diem Dia: ");Dia =sc.nextDouble();
    }
    //@Override
    public void output_Student(){
        super.output_Student();
        System.out.println("Diem Van: "+Van);
        System.out.println("Diem Su: "+Su);
        System.out.println("Diem Dia: "+ Dia);
    }
}