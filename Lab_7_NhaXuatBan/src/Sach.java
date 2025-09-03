import java.util.Scanner;

public class Sach extends Manager {
    private String TenTG,soTrang;
    @Override
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("Ten Tac Gia: ");TenTG=sc.nextLine();
        System.out.print("So Trang: ");soTrang=sc.nextLine();
    }
    @Override
    public void output(){
        super.output();
        System.out.println("Tac gia: "+ TenTG);
        System.out.println("Tong so Trang: "+ soTrang+"\n");
    }
}
