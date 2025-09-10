package Lab_12_C2;

import java.util.ArrayList;
import java.util.Scanner;

public class QLCB extends CanBo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<CanBo>arrCB=new ArrayList<>();
        CanBo ojb=new CanBo();
        while(true){
            System.out.print("1.Add\n2.Search\n3.Show\n4.Exit\n~> Enter your choice: ");int  choice=sc.nextInt();sc.nextLine();
            switch(choice)
            {
                case 1:
                    System.out.println("Enter the name of the job:\n1.KySu\n2.Cong Nhan\n3.Nha Vien \n ~~>  ");int tmpchoice=sc.nextInt();sc.nextLine();
                    if (tmpchoice==1) ojb=new KySu();
                    else if (tmpchoice==2) ojb=new CongNhan();
                    else ojb=new NhanVien();
                    ojb.input();
                    arrCB.add(ojb);
                    break;
                case 2:
                    System.out.print("Nhap ten muon tim: "); String nameSearch=sc.nextLine();
                    for (CanBo c:arrCB){
                        if(c.getName().equals(nameSearch)){
                            c.OutPrint();
                        }
                    }
                    break;
                case 3:
                    for(CanBo c:arrCB){
                        c.OutPrint();
                    }
                    break;
                case 4:
                    return;

            }
        }
    }
}
