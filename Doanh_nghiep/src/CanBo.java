public class CanBo {
    private String name, birthday,sex,address;
    public CanBo(){}
    public CanBo(String name, String birthday, String sex, String address)
    {
        this.name = name;
        this.birthday = birthday;
        this.address=address;
        this.sex=sex;
    }

    public void OutPrint(){
        System.out.println("Họ và tên: "+name);
        System.out.println("Sinh ngày: "+birthday);
        System.out.println("Giới tính: "+sex);
        System.out.println("Địa chỉ: "+ address);
    };
}
