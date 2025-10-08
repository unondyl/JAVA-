package BTdenhin;

public class Canbo extends Person{
    private String phongban;
    private double hesoluong,luongcoban,thuong,phat;
    public double luong;
    public Canbo(String name, String birth,String address, String sex,String phongban, double hesoluong,double luongcoban, double thuong , double phat){
        super(name,birth,address,sex);
        this.hesoluong=hesoluong;
        this.phongban=phongban;
        this.phat=phat;
        this.thuong=thuong;
        this.luongcoban=luongcoban;
        this.luong=luongcoban*hesoluong+thuong-phat;
    }
}
