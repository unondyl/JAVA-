package Lab_7_TuyenSinh;

import java.util.ArrayList;
import java.util.Scanner;



public class TuyenSinh extends qlyTuyenSinh{
    Scanner sc = new Scanner(System.in);
    private int choose(int n)
    {
        System.out.println("Enter Your Choice: ");
        System.out.println("1. Nhap Thong Tin");
        System.out.println("2. Xuat Thong Tin");
        System.out.println("3. Tim Kiem");
        System.out.println("4. Return ");
        n=sc.nextInt();sc.nextLine();
        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<qlyTuyenSinh> TyS = new ArrayList<qlyTuyenSinh>();
        qlyTuyenSinh ts=new qlyTuyenSinh();
        TuyenSinh t=new TuyenSinh();
        int n=0;;
        while(n!=4){
            n=t.choose(n);
            if(n==1){

                System.out.print("Loai Thi Sinh: "); String st = sc.nextLine();
                if(st.equals("A") || st.equals("a")) ts = new KhoiA();
                if(st.equals("B") || st.equals("b")) ts = new KhoiB();
                if(st.equals("C") || st.equals("c")) ts = new KhoiC();
                ts.input_Student();
                TyS.add(ts);
            }
            else if (n==2){
                for(qlyTuyenSinh tmpArr : TyS)
                {
                    tmpArr.output_Student();
                }
            }
            else if (n==3){
                System.out.print("Nhap SBD thi sinh :"); String isID = sc.nextLine();
                for(qlyTuyenSinh tmpArr : TyS)
                    if (tmpArr.getId().equals(isID))
                    {
                        ts.output_Student();
                    }
                else System.out.println("!! Khong tim thay ket qua !!");
                }
            else if (n==4){}
        }
        System.out.println("\n \n!!!!   CHUONG TRINH DA KET THUC  !!!!");
    }
}
