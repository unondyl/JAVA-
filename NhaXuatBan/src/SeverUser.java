import java.util.ArrayList;

public class SeverUser {
    public static void main(String[] args) {
        
        ArrayList<Sach> sach = new ArrayList <Sach>();
        // Thong tin Class Sach
        for(int i = 0; i < 3; i++) {
            System.out.println("===Nhap thong tin Sach===");
            Sach sInput = new Sach();
            sInput.input(); // Assuming Sach has an input() method to read data
            sach.add(sInput);
        }
        for(Sach tmp:sach)
        {
            tmp.output();
        }
        //Class Bao
        ArrayList<Bao> bao= new ArrayList<Bao>();
        for(int i = 0; i < 3; i++) {
            System.out.println("===Nhap thong tin Bao===");
            Bao bInput = new Bao();
            bInput.input();
            bao.add(bInput);
        }
        for(Sach tmp:sach)
        {
            tmp.output();
        }
        //Class TapChi
        ArrayList<TapChi> tapchi=new ArrayList<TapChi>();
        for(int i = 0; i < 3; i++) {
            System.out.println("===Nhap thong tin TapChi===");
            TapChi tInput = new TapChi();
            tInput.input();
            tapchi.add(tInput);
        }
        for(Sach tmp:sach)
        {
            tmp.output();
        }
    }
}
