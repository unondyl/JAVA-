package lab_7_Bank;

import java.util.Random;

public class Gambler extends Account{
    private Random rand;

    public Gambler(double initBalance) {
        super(initBalance);
        rand = new Random();
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            double chance = rand.nextDouble(); // từ 0.0 đến 1.0
            if (chance <= 0.49) {
                System.out.println("May mắn! Không bị trừ tiền lần này.");
            } else {
                balance -= amount;
                System.out.println("Rút thành công $" + amount);
            }
            transactions++;
        } else {
            System.out.println("Rút thất bại: không đủ tiền.");
        }
    }

    @Override
    void endMontthChagre() {

    }

    @Override
    public void endMonthCharge() {
        // không có phí hàng tháng
    }

}
