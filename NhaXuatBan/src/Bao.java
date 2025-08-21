import java.util.Scanner;

public class Bao extends Manager {
    private String dayPH;
    @Override
    public void input()
    {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ngay PH: ");
        dayPH = sc.nextLine();
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Ngay PH: " + dayPH+"\n");
    }
}
