package Steam_Student;

import java.io.BufferedWriter;
import java.io.IOException;

public class NhanVien extends Person{
    private String Phongban;
    private int HsLuong,luongcb,thamnien;
    public NhanVien(String name, String birth,String address, String sex,String Phongban, int HsLuong, int luongcb,int thamnien){
        super(name, birth, address, sex);
        this.Phongban=Phongban;
        this.HsLuong=HsLuong;
        this.luongcb = luongcb;
        this.thamnien= thamnien;
    }
    public int luong(){
        return luongcb*HsLuong*(1+(thamnien/100));
    }
    public NhanVien(BufferedWriter dos) throws IOException {
        super(dos);
        dos.write(Phongban+"\t|"+luongcb+"\t|"+HsLuong+"\t|"+thamnien+"\t|"+luong());
    }
}
