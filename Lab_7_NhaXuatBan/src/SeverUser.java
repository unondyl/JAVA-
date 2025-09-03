import java.util.ArrayList;
import java.util.Scanner;



public class SeverUser extends Manager{
    private int choose(int n)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Choice: ");
        System.out.println("1. Nhap Thong Tin");
        System.out.println("2. Xuat Thong Tin");
        System.out.println("3. Tim Kiem");
        System.out.println("4. Return ");
        n=sc.nextInt();sc.nextLine();
        return n;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in); int n=0;
        SeverUser user = new SeverUser();
        ArrayList<Manager> Doc = new ArrayList<Manager>();
        Manager doc = new Manager();
        while(n!=4){
            n=user.choose(n);
            if (n==1)
            {
                System.out.print("\n NHAP THONG TIN \n  1. Sach \n  2. Bao \n  3.Tap Chi\nNhap ma tai lieu:");
                int chTmp= sc.nextInt();
                if (chTmp==1) doc=new Sach();
                else if (chTmp==2) doc=new Bao();
                else if (chTmp==3) doc=new TapChi();
                else System.out.println("\n\n!   Chon sai ma!\n");
                Doc.add(doc);
            }
            else if (n==2)
            {
                for(Manager tmpDoc : Doc)
                {
                    tmpDoc.output();
                }
            }
            else if (n==3){
                System.out.print("\n TIM KIEM TAI LIEU \n Nhap ma tai lieu:"); String isID=sc.nextLine();
                for (Manager tmpDoc : Doc)
                    if (tmpDoc.getMaTL().equals(isID)) {
                        tmpDoc.output();
                    }
                else System.out.println("\n !! Tai Lieu Khong Ton Tai !!");
            }
        }
        System.out.println("\n \n!!!!   CHUONG TRINH DA KET THUC  !!!!");
    }
}