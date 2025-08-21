import java.sql.SQLOutput;
import java.util.Scanner;
public class PS{
    public int tu, mau;
    public PS(){

    }
     public PS(int tu, int mau)
    {
        this.tu=tu;
        this.mau=mau;
    }

    public PS tinhTong(PS a,PS b)
    {
        PS temp=new PS();
        temp.tu=a.tu*b.mau+b.tu*a.mau;
        temp.mau=a.mau*b.mau;
        return temp;
    }
    public static void main(String args[])
    {
        PS a,b,c = null;
        Scanner sc=new Scanner(System.in);
        a= new PS(2,4);
        b= new PS(4,5);
        c=c.tinhTong(a,b);
        System.out.println(c.tu+"/"+c.mau);
    }
}