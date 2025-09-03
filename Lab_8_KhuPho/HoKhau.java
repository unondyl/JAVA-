package Lab_8_KhuPho;

//import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;

public class HoKhau{
    private int soTV;
    private String soNha;
    //private CaNhan obj=new CaNhan();
    ArrayList<CaNhan> TV =  new ArrayList<CaNhan>();
    public void general_input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap So Nha: "); soNha=sc.nextLine();
        System.out.print("So Thanh Vien: "); soTV=sc.nextInt();sc.nextLine();
        for(int i=0;i<soTV;i++)
        {
            System.out.print("\n ----Thanh vien thu "+(i+1)+"----\n");
            CaNhan tmp=new CaNhan();
            tmp.genaral_input();
            TV.add(tmp);
        }
    }
    public void general_output()
    {
        System.out.println("So Nha: "+soNha);
        for (CaNhan tmp:TV)
        {
            tmp.genaral_output();
            System.out.println("-------------------------------------");
        }
        System.out.println("\n:::::::::::::::::::::::::::::::::::::");
    }
}