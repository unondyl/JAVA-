package Lab_9_THPT;

import java.util.ArrayList;
import java.util.Scanner;

public class ngQly{
    public ngQly(){}
    private String Lop, Khoahoc, kyhoc;
    ArrayList<Hocsinh> arrHS = new ArrayList<>();
    public void input_HS()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("||   INPUT   ||");
        System.out.print("Lop hoc: "); Lop=sc.nextLine();
        System.out.print("Khoa hoc hoc: "); Khoahoc=sc.nextLine();
        System.out.print("Ky Hoc: ");kyhoc=sc.nextLine();
        System.out.print("So Thanh Vien Lop hoc: ");int tmp=sc.nextInt();sc.nextLine();
        for (int i=1;i<=tmp;i++)
        {
            Hocsinh tmpHS=new Hocsinh();
            tmpHS.input_HS();
            arrHS.add(tmpHS);
        }
    }
    public void output_List ()
    {
        System.out.println("Lop hoc: "+Lop+"\nKhoa: "+Khoahoc+"\nKy: "+kyhoc+"\n ///Danh Sach///");
        for (Hocsinh tmpHS : arrHS)
        {
            tmpHS.hienThiThongTin();
        }
    }
    public void HSshow(Hocsinh tmpHS)
    {
        tmpHS.input_HS();
        System.out.println("Lop hoc: "+Lop+"\nKhoa: "+Khoahoc+"\nKy: "+kyhoc);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int nChoose=1;
        ArrayList<ngQly> ArrHS =new ArrayList<>();
        while(nChoose!=4)
        {
            System.out.println("CHON CHUC NANG\n1.Nhap thong tin\n2.Xuat thong tin\n4. Ket Thuc\n~>Choice: ");
            nChoose=sc.nextInt();sc.nextLine();
            if(nChoose==1)
            {
                ngQly obj=new ngQly();
                obj.input_HS();
                ArrHS.add(obj);
            }
            if(nChoose==2)
            {
                for(ngQly tmpHS : ArrHS) tmpHS.output_List();
            }
            if(nChoose==3)
            {
                System.out.println("Nhap dia chi can tim: ");String isAddress =sc.nextLine();
                for(ngQly tmpHS : ArrHS){
                    for (Hocsinh tmpG : tmpHS.arrHS){
                        if (tmpG.getQueQuan().equals("isAddress")){
                            tmpHS.HSshow(tmpG);
                        }
                    }

                }
            }
        }
    }
}
