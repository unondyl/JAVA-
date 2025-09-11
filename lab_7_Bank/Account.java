package lab_7_Bank;

abstract class Account {
    protected double balance;
    protected int transactions=0;
    public Account(double initBalance)
    {
        this.balance=initBalance;
        this.transactions=0;
    }
    protected void deposit(double amount)
    {
        balance+=amount;
        transactions++;
    }
    protected void withdraw(double amount)
    {
        balance-=amount;
        transactions--;
    }
    abstract void endMontthChagre();

    public void endMonth(){
        System.out.println("Số tiền còn lại: " + balance);
        System.out.println("Số giao dịch thực hiện trong tháng: " + transactions);
        transactions=0;
    }

    public abstract void endMonthCharge();
}
