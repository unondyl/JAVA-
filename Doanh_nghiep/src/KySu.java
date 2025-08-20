public class KySu extends CanBo {
    private String edu;
    public KySu(String name, String birthday, String sex, String address,String edu) {
        super(name,birthday,sex,address);
        this.edu=edu;
    }

    @Override
    public void OutPrint(){
        super.OutPrint();
        System.out.println("Ngành đào tạo: "+edu);
    }
}

