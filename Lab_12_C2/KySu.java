package Lab_12_C2;

import java.util.Scanner;

public class KySu extends CanBo{
    private String edu,iedu;
    public KySu(){}
    @Override
    public void input(){
        Scanner sc=new Scanner(System.in);
        super.input();
        System.out.print("Nganh DT: ");edu=sc.nextLine();
        System.out.print("Loai Bang: ");iedu=sc.nextLine();
    }
    public void OutPrint(){
        super.OutPrint();
        System.out.println("Nganh DT: "+edu+"\nBang: "+iedu);
    }
}
