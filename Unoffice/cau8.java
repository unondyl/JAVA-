import java.util.Scanner;

public class cau8{
    public static void main(String[] args) {
        int d;double ans = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        d = 1;
        for (int i = 1; i <= n; i++) {
            d = d * i;
            ans = ans + (1.0 / d);
        }
        System.out.printf("Ans = %.2f\n", ans);
    }
}