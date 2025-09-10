package Lab_10_2;

import java.util.ArrayList;
import java.util.Scanner;

public class BienLai extends KhachHang {

    private int munNew,munOld;
    @Override
    public void input(){
        super.input();
        Scanner sc=new Scanner(System.in);
        System.out.print("Chi so moi: ");
        munNew=sc.nextInt();
        System.out.print("Chi so cu: ");
        munOld=sc.nextInt();sc.nextLine();
    }
    public void show(){
        super.show();

        System.out.println("So tien phai tra: "+((munNew-munOld)*750)+"VND");
    }

    //Main
    public static void main(String[] args) {
        ArrayList<KhachHang> khachHang=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.print("So KH: ");int n=sc.nextInt();sc.nextLine();
        for(int i=0;i<n;i++){
            BienLai bienLai=new BienLai();
            bienLai.input();
            khachHang.add(bienLai);
        }

        System.out.println("\n\n!!!!LIST");
        for(KhachHang tmp:khachHang){
            tmp.show();
        }
    }
}
