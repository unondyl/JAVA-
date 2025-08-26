import java.util.ArrayList;
import java.util.Scanner;

public class SeverUser {
    public static void main(String[] args) {
        ArrayList<TapChi> tapchi = new ArrayList<TapChi>();
        ArrayList<Sach> sach = new ArrayList<Sach>();
        ArrayList<Bao> bao = new ArrayList<Bao>();
        Scanner sc = new Scanner(System.in);
        int temp = 0;
        opp:
        while (temp != 4) {
            System.out.println("=======CHON CHUC NANG=======");
            System.out.println("1.Nhap danh sach");
            System.out.println("2.Tim Kiem");
            System.out.println("3.Xuat danh sach");
            System.out.println("4.Thoat");
            temp=sc.nextInt();
            if (temp == 1) {
                System.out.print("Nhap so luong sach: ");int tmp_Sach = sc.nextInt();
                for (int i = 0; i < tmp_Sach; i++) {
                    System.out.println("===Nhap thong tin Sach so"+(i+1)+"===");
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
        else if(temp==3)  {
            sc.nextLine();
                System.out.print("Nhap ma TL can tim: ");String tmpTL= sc.nextLine();
                System.out.println("\n KET QUA TIM KIEM: ");
                for (Sach tmp : sach) {
                    if (tmp.getMaTL().equals(tmpTL)) {
                        tmp.output();
                        continue opp;
                    }
                }
                for (TapChi tmpe : tapchi) {
                    if (tmpe.getMaTL().equals(tmpTL)) {
                            tmpe.output();
                            continue opp;
                        }
                    }
                    for (Bao tmep : bao) {
                        if (tmep.getMaTL().equals(tmpTL)) {
                            tmep.output();
                            continue opp;
                        }
                    }
                    System.out.println("Khong tim thay tai lieu");
                }
        }
        }

    }