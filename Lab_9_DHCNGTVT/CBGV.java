package Lab_9_DHCNGTVT;

import java.util.ArrayList;
import java.util.Scanner;

public class CBGV extends GiaoVien{
    private int luong, thuong, phat, thuc_linh;
    public CBGV(){}
    @Override
    public void nhapThongTin(){
        super.nhapThongTin();
        Scanner input = new Scanner(System.in);
        System.out.println("Luong :");luong = input.nextInt();
        System.out.println("Thuong :");thuong = input.nextInt();
        System.out.println("Phat :");phat = input.nextInt();input.nextLine();
        thuc_linh = luong+thuong-phat;
    }
    public void hienThiThongTin(){
        super.hienThiThongTin();
        System.out.println("Luong : "+luong+"\nThuong : "+thuong+"\nPhat : "+phat+"\nThuc Linh : "+thuc_linh);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        ArrayList<GiaoVien> listGV=new ArrayList<>();
        int IStmp=1;
        while(IStmp!=0){
            System.out.println("CHON:\n0.Thoat\n1.Nhap\n2.Hien Thi");
            IStmp=sc.nextInt();
            if(IStmp==1){
                GiaoVien gv=new CBGV();
                gv.nhapThongTin();
                listGV.add(gv);
            }
            if(IStmp==2){
                for(GiaoVien gv:listGV){
                    gv.hienThiThongTin();
                }
            }
        }

    }
}