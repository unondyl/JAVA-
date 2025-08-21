import java.util.Scanner;

public class Manager {
    private String maTL, NhaXB, SoBanPH;
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ma TaL: ");
        maTL = sc.nextLine();
        System.out.print("Nha XB: ");
        NhaXB = sc.nextLine();
        System.out.print("SoBanPH: ");
        SoBanPH = sc.nextLine();
    }
    public void output(){
        System.out.println("Mã tài Liệu: "+ maTL);
        System.out.println("Nhà xuất bản: "+NhaXB);
    }
}
