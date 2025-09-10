package Lab_11_SoPhuc;

import java.util.Scanner;

class SoPhuc {
    private double PhanThuc;
    private double PhanAo;
    public SoPhuc() {
        this.PhanThuc = 0;
        this.PhanAo = 0;
    }
    public SoPhuc(double a, double b) {
        this.PhanThuc = a;
        this.PhanAo = b;
    }
    public void nhap(Scanner sc) {
        System.out.print("Nhập phần thực: ");
        this.PhanThuc = sc.nextDouble();
        System.out.print("Nhập phần ảo: ");
        this.PhanAo = sc.nextDouble();
    }
    public void hienThi() {
        if (PhanAo >= 0)
            System.out.println(PhanThuc + " + " + PhanAo + "i");
        else
            System.out.println(PhanThuc + " - " + Math.abs(PhanAo) + "i");
    }
    public SoPhuc cong(SoPhuc sp) {
        return new SoPhuc(this.PhanThuc + sp.PhanThuc, this.PhanAo + sp.PhanAo);
    }
    public SoPhuc nhan(SoPhuc sp) {
        double thuc = this.PhanThuc * sp.PhanThuc - this.PhanAo * sp.PhanAo;
        double ao = this.PhanThuc * sp.PhanAo + this.PhanAo * sp.PhanThuc;
        return new SoPhuc(thuc, ao);
    }
}