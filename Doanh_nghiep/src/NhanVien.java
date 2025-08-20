//import java.util.Scanner;

public class NhanVien extends CanBo{
    private String job;
    public NhanVien(String name, String birthday, String sex, String address,String job){
        super(name,birthday,sex,address);
        this.job=job;
    }

    @Override
    public void OutPrint() {
        super.OutPrint();
        System.out.println("Công việc: "+job);
    }
}
