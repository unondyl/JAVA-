package Lab_12_C1;

import java.util.Scanner;

public class Oto extends PTGT{
    private String styleDC;
    private int soGhe;
    public Oto() {}
    @Override
    public void input(){
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("So Ghe: ");soGhe=sc.nextInt();sc.nextLine();
        System.out.print("Kieu DC: ");styleDC=sc.nextLine();
    }
    public void show()
    {
        super.show();
        System.out.println("So Ghe: "+soGhe);
        System.out.println("Kieu DC: "+styleDC);
    }
}
