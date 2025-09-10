package Lab_12_C1;

import java.util.ArrayList;
import java.util.Scanner;

public class QLPTGT extends PTGT{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<PTGT> ojb=new ArrayList<>();
        PTGT pt=new PTGT();
        while(true){
            System.out.println("CHON CHUC NANG \n 1.Add\n2.Search\n3.End"); int tmpchoice=sc.nextInt();sc.nextLine();
            switch(tmpchoice){
                case 1:
                    System.out.println("!!Chon loai xe:\n1.Oto\n2.Xe May\n3.Xe Tai");int nchoice=sc.nextInt();sc.nextLine();
                    switch(nchoice){
                        case 1: pt=new Oto(); break;
                        case 2: pt=new XeMay(); break;
                        case 3: pt=new XeTai(); break;
                    }
                    pt.input();
                    ojb.add(pt);
                    break;
                case 2:
                    System.out.print("Nhap mau tim: ");String colorSearch=sc.nextLine();
                    for(PTGT tmpojb:ojb)
                    {
                        if(tmpojb.getColor().equals(colorSearch))
                        {
                            tmpojb.show();
                        }
                    }
                    break;
                case 3:
                    return;
            }
        }
    }
}
