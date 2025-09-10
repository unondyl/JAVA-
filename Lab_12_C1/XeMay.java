package Lab_12_C1;

import java.util.Scanner;

public class XeMay extends PTGT{
    private String congsuat;
    public XeMay(){}
    @Override
    public void input(){
        Scanner sc=new Scanner(System.in);
        super.input();
        System.out.print("Cong suat: ");congsuat=sc.nextLine();
    }
    @Override
    public void show(){
        super.show();
        System.out.println("Cong suat: "+congsuat);
    }
}
