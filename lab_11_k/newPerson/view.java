package lab_11_k.newPerson;

import java.io.IOException;
import java.util.ArrayList;

public class view {
    public static void main(String []s) throws IOException {
        ArrayList<NhanVien> list = new ArrayList<>();
        NhanVien nv = new NhanVien();
        list=nv.FileToInput("D://actvn/JAVA/data.dat");
        for (NhanVien tmp : list ) {
            System.out.print("--------------------\n");
            tmp.outP(tmp); System.out.print("--------------------\n");
        }
    }
}
