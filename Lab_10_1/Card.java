package Lab_10_1;

import java.util.Scanner;

public class Card extends SVien{
    private String seri,dayMuon,dayTra,bookNum;
    public Card(){
    }
    @Override
    public void setdata(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter  so phieu: ");seri=sc.nextLine();
        System.out.print("Enter  Ngay muon: ");dayMuon=sc.nextLine();
        System.out.print("Enter  Ngay tra: ");dayTra=sc.nextLine();
        System.out.print("Ma Sach: "); bookNum=sc.nextLine();
        super.setdata();
    }

    public String getSeri() {
        return seri;
    }
    public String getBookNum() {
        return bookNum;
    }

}
