package lab_7_Bank;

public class BankTest {public static void main(String[] args) {
    System.out.println("=== Tài khoản Fee ===");
    Account feeAcc = new Fee(100);
    feeAcc.deposit(50);
    feeAcc.withdraw(30);
    feeAcc.endMonth();

    System.out.println("\n=== Tài khoản NickelNDime ===");
    Account nickelAcc = new NickeNDime(100);
    nickelAcc.deposit(20);
    nickelAcc.withdraw(10);
    nickelAcc.withdraw(5);
    nickelAcc.endMonth();

    System.out.println("\n=== Tài khoản Gambler ===");
    Account gamblerAcc = new Gambler(100);
    gamblerAcc.deposit(40);
    gamblerAcc.withdraw(10);
    gamblerAcc.withdraw(20);
    gamblerAcc.endMonth();
}
}
