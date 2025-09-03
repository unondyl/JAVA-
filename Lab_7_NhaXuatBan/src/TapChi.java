import java.util.Scanner;

public class TapChi extends Manager {
    String SoPH,thangPH;
    @Override
    public void input()
    {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("So Phat Hanh: ");SoPH=sc.nextLine();
        System.out.print("Thang Phan Hanh: ");thangPH=sc.nextLine();
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Ngay PH: " + SoPH);
        System.out.println("Thang PH: " + thangPH+"\n");
    }
}
