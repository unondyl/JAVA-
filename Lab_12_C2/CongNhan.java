package Lab_12_C2;

import java.util.Scanner;

public class CongNhan extends CanBo{
    private String level;
    @Override
    public void input(){
        super.input();
        Scanner sc=new Scanner(System.in);
        level=sc.nextLine();
        System.out.print("Bac :");level=sc.nextLine();
    }
    public void OutPrint()
        {
        super.OutPrint();
        System.out.println("Bac :"+level);
        }
}
