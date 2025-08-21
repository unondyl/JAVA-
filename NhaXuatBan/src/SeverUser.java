import java.util.ArrayList;
import java.util.Scanner;

public class SeverUser {
public static void main(String[] args) {
    ArrayList<TapChi> tapchi = new ArrayList<TapChi>();
    ArrayList<Sach> sach = new ArrayList<Sach>();
    ArrayList<Bao> bao = new ArrayList<Bao>();
    System.out.println("=======CHON CHUC NANG=======");
    System.out.println("1.Nhap danh sach");
    System.out.println("2.Tim Kiem");
    System.out.println("3.Xuat danh sach");
    System.out.println("4.Thoat");
    Scanner sc = new Scanner(System.in);
    int temp = sc.nextInt();
    while (temp != 4) {
        if (temp == 1) {
            for (int i = 0; i < 3; i++) {
                System.out.println("===Nhap thong tin Sach===");
                Sach sInput = new Sach();
                sInput.input(); // Assuming Sach has an input() method to read data
                sach.add(sInput);
            }

            for (int i = 0; i < 3; i++) {
                System.out.println("===Nhap thong tin TapChi===");
                TapChi tInput = new TapChi();
                tInput.input();
                tapchi.add(tInput);
            }

            for (int i = 0; i < 3; i++) {
                System.out.println("===Nhap thong tin Bao===");
                Bao bInput = new Bao();
                bInput.input();
                bao.add(bInput);
            }
        } else if (temp == 2) {
            for (Sach tmp : sach) {
                tmp.output();
            }
            for (TapChi tmp : tapchi) {
                tmp.output();
            }
            for (Bao tmp : bao) {
                tmp.output();
            }
        }
//        else if(temp==3) {
//            System.out.print("Nhap ma tac pham: ");String tmp=sc.nextLine();
//            severUser.searchUser(tmp);
//        }
        System.out.println("=======CHON CHUC NANG=======");
        System.out.println("1.Nhap danh sach");
        System.out.println("2.Tim Kiem");
        System.out.println("3.Xuat danh sach");
        System.out.println("4.Thoat");
        temp=sc.nextInt();
    }

    }
}
