public class CongNhan extends CanBo {
    private String level;
    public CongNhan(String name, String birthday, String sex, String address,String level) {
        super(name,birthday,sex,address);
        this.level=level;
    }
    public void OutPrint(){
        super.OutPrint();
        System.out.println("Trình độ: "+level);
    }
}
