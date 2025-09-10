package Lab_11_VanBan;

import java.util.Scanner;

class VanBan {
    private String noiDung;

    // Constructor mặc định
    public VanBan() {
        this.noiDung = "";
    }

    // Constructor có tham số
    public VanBan(String st) {
        this.noiDung = st;
    }

    // Getter, Setter
    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    // Đếm số từ trong văn bản
    public int demSoTu() {
        // chuẩn hóa trước rồi đếm
        String chuan = chuanHoa();
        if (chuan.isEmpty()) return 0;
        String[] words = chuan.split(" ");
        return words.length;
    }

    // Đếm số ký tự 'H' hoặc 'h'
    public int demSoH() {
        int count = 0;
        for (int i = 0; i < noiDung.length(); i++) {
            char c = noiDung.charAt(i);
            if (c == 'H' || c == 'h') {
                count++;
            }
        }
        return count;
    }

    // Chuẩn hóa văn bản
    public String chuanHoa() {
        // Bỏ khoảng trắng đầu/cuối và thay thế nhiều khoảng trắng liên tiếp bằng 1 khoảng trắng
        return noiDung.trim().replaceAll("\\s+", " ");
    }
}
