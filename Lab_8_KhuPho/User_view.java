package Lab_8_KhuPho;

import java.util.ArrayList;
import java.util.Scanner;

public class User_view
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList <HoKhau> hokhau=new ArrayList<HoKhau>();
        System.out.print("Nhap so ho dan ");int n=sc.nextInt();
        for(int tmp=0;tmp<n;tmp++)
        {
            System.out.println("====HO DAN THU "+(tmp+1)+"====");
            HoKhau temp=new HoKhau();
            temp.general_input();
            hokhau.add(temp);
        }

        for(HoKhau temp:hokhau)
        {
            temp.general_output();
        }
    }
}