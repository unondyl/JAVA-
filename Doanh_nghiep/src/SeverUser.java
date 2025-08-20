//*****         ***
//******       ***
//***  ***    ***
//***   ***  ***
//***    ******
//***     ***code
//***    *** by
//***   **** dyl
// *** *****************
//*******************

public class SeverUser
{
    public static void main(String[] args)
    {
        CongNhan cn = new CongNhan("Nguyễn Văn A", "1985", "Nam", "Hà Nội", "3/7");
        KySu ks = new KySu("Trần Thị B", "1990", "Nữ", "Đà Nẵng", "Công nghệ thông tin");
        NhanVien nv = new NhanVien("Lê Văn C", "1995", "Nam", "HCM", "Kế toán");

        System.out.println("=== Thông tin công nhân ===");
        cn.OutPrint();

        System.out.println("\n=== Thông tin kỹ sư ===");
        ks.OutPrint();

        System.out.println("\n=== Thông tin nhân viên ===");
        nv.OutPrint();
    }
}