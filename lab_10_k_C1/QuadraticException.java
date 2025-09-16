package lab_10_k_C1;

public class QuadraticException extends Exception{
    private int a,b,c;
    public QuadraticException(){
        super("Khong phai phuong trinh bac 2");
    }
    public QuadraticException(int a, int b, int c){
        super("Không phải phương trình bậc 2: a = " + a + ", b = " + b + ", c = " + c);
    }
    public void slove() throws Exception{
        if (a == 0) {
            throw new QuadraticException(); // ném ngoại lệ
        } else {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm");
            } else if (delta == 0) {
                double x = -b / (2.0 * a);
                System.out.println("Phương trình có nghiệm kép: x = " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
                System.out.println("Nghiệm 1: " + x1);
                System.out.println("Nghiệm 2: " + x2);
            }
        }
    }
}
