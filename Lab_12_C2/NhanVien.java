package Lab_12_C2;

import java.util.Scanner;

public class NhanVien extends CanBo{
    private String job;
    @Override
    public void input(){
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Cong Viec: ");job=sc.nextLine();
    }
    public void OutPrint(){
        super.OutPrint();
        System.out.println("Cong Viec: "+job);
    }
}
