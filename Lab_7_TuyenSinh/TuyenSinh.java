package Lab_7_TuyenSinh;

import java.util.ArrayList;
import java.util.Scanner;



public class TuyenSinh {
    Scanner sc = new Scanner(System.in);
    private int choose(int n)
    {
        System.out.println("Enter Your Choice: ");
        System.out.println("1. Nhap Thong Tin");
        System.out.println("2. Xuat Thong Tin");
        System.out.println("3. Tim Kiem");
        System.out.println("4. Return ");
        n=sc.nextInt();
        return n;
    }
    public static void main(String[] args) {
        ArrayList<KhoiA> arrKhoiA= new  ArrayList<KhoiA>();
        ArrayList<KhoiB> arrKhoiB= new  ArrayList<KhoiB>();
        ArrayList<KhoiC> arrKhoiC= new  ArrayList<KhoiC>();
        qlyTuyenSinh objTS = new qlyTuyenSinh();
        int nChoose=0;Scanner sc = new Scanner(System.in);
        TuyenSinh obj = new TuyenSinh();
        opp:
        while(nChoose!=4)
        {
            nChoose=obj.choose(nChoose);
            if (nChoose==1)
            {
                System.out.print("So thi Sinh khoi A: ");
                int nTmp=sc.nextInt();

                for(int i=0;i<nTmp;i++)
                {
                    System.out.println("Thi Sinh thu "+(i+1));
                    KhoiA objKhoiA= new KhoiA();
                    objKhoiA.input_Student(); //System.out.println(objKhoiA.getId());
                    arrKhoiA.add(objKhoiA); //System.out.println(arrKhoiA.size());
                }
                System.out.print("So thi Sinh khoi B: ");
                nTmp=sc.nextInt();
                for(int i=0;i<nTmp;i++)
                {
                    System.out.println("Thi Sinh thu "+(i+1));
                    KhoiB objKhoiB= new KhoiB();
                    objKhoiB.input_Student();
                    arrKhoiB.add(objKhoiB);
                }
                System.out.print("So thi Sinh khoi C: ");
                nTmp=sc.nextInt();
                for(int i=0;i<nTmp;i++)
                {
                    System.out.println("Thi Sinh thu "+(i+1));
                    KhoiC objKhoiC= new KhoiC();
                    objKhoiC.input_Student();
                    arrKhoiC.add(objKhoiC);
                }
            }
            else if (nChoose==2)
            {
                System.out.println("\n\n");
                for (KhoiA tmpKhoiA : arrKhoiA){
                    tmpKhoiA.output_Student();
                }
                System.out.println("=========================");
                for (KhoiB tmpKhoiB : arrKhoiB){
                    tmpKhoiB.output_Student();
                }
                System.out.println("=========================");
                for (KhoiC tmpKhoiC : arrKhoiC){
                    tmpKhoiC.output_Student();
                }
            }
            else if(nChoose==3)
            {
                sc.nextLine();
                System.out.print("Nhap SBD can tim: "); String Find_id=sc.nextLine();
                for (KhoiA tmpKhoiA : arrKhoiA){
                    if(tmpKhoiA.getId().equals(Find_id)){
                        tmpKhoiA.output_Student();
                        continue opp;
                    }
                }
                //System.out.println("=========================");
                for (KhoiB tmpKhoiB : arrKhoiB){
                    if(tmpKhoiB.getId().equals(Find_id)){
                        tmpKhoiB.output_Student();
                        continue opp;
                    }
                }
                //System.out.println("=========================");
                for (KhoiC tmpKhoiC : arrKhoiC){
                    if(tmpKhoiC.getId().equals(Find_id)){
                        tmpKhoiC.output_Student();
                        continue opp;
                    }
                }
                System.out.println("Unvar");
                }
            }
        }
}
