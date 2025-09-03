package Lab_8_TrochoSV;

import java.util.ArrayList;
import java.util.Scanner;

public class ngQly extends KhanhSan{
    public static void main(String[] args) {
        ArrayList<KhanhSan> khanhSan = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int isChoise=0;
        while(isChoise!=3)
        {
            System.out.print("\n\n\n\n\n\n/// ENTER YOUR CHOICE ///\n 1.Nhap thong tin\n 2.Hien thi Danh Sach\n \n Your choice :");
            isChoise = sc.nextInt();
            if (isChoise==1)
            {
                KhanhSan CSKH= new  KhanhSan();
                CSKH.input();
                khanhSan.add(CSKH);
            }
            else if(isChoise==2)
            {
                for (KhanhSan tmp : khanhSan) tmp.show();
            }
            else if(isChoise>3) System.out.println("|| VUI LONG CHON LAI ||");
        }
    }
}
