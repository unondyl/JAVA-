package Lab_11_VanBan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập văn bản
        System.out.println("Nhập văn bản:");
        String st = sc.nextLine();

        VanBan vb = new VanBan(st);

        // Hiển thị kết quả
        System.out.println("Số từ trong văn bản: " + vb.demSoTu());
        System.out.println("Số ký tự 'H' hoặc 'h': " + vb.demSoH());
        System.out.println("Văn bản chuẩn hóa: \"" + vb.chuanHoa() + "\"");

        sc.close();
    }
}

