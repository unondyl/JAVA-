package PhS_2.src;

import lib.math;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PS {
    private int t1,m1,t2,m2;
    public PS(){}
    public PS(PS p){
        this.t1=p.t1;
        this.t2=p.t1;
        this.m1=p.m1;
        this.m2=p.m2;
    }
    public void inP(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap Phs 1 :");
        System.out.print("Tu  PhS 1: ");t1=sc.nextInt();
        System.out.print("Mau Phs 1: ");m1=sc.nextInt();
        System.out.print("Tu  PhS 2: ");t2=sc.nextInt();
        System.out.print("Mau Phs 2: ");m2=sc.nextInt();
        System.out.println();
    }
    public void outP(int a,int b)
    {
        System.out.print(" Ans : ");
        math m=new math();
        int tmp=m.gcd(a, b);
        a/=tmp;b/=tmp; 
        if (a==0) System.out.println(0);
        else if(b==1) System.out.println(a);
        else System.out.println(a+"/"+b);
    }
    protected void addPS(){
        outP(t1*m2+t2*m1, m1*m2);
    }
    protected void minusPS(){
        outP(t1*m2-t2*m1, m1*m2);
    }
    protected void corePS(){
        outP(t1*t2,m1*m2);
    }
    protected void dividePS(){
        outP(t1*m2,m1*t2);
    }
}
