package Lab_12_C1;

import java.util.Scanner;

public class XeTai extends PTGT{
    private String strong;
    public XeTai(){}
    @Override
    public void input(){
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Trong tai: ");strong=sc.nextLine();
    }
    public void show(){
        super.show();
        System.out.println("Trong tai: "+strong);
    }
}
