package lab_7_Bank;

class NickeNDime extends Account {
    private int withdrawCount;

    public NickeNDime(double initBalance) {
        super(initBalance);
        this.withdrawCount = 0;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            transactions++;
            withdrawCount++;
        } else {
            System.out.println("Rút thất bại: không đủ tiền.");
        }
    }

    @Override
    void endMontthChagre() {
        balance -= withdrawCount * 0.50;
        withdrawCount = 0;
    }

    @Override
    public void endMonthCharge() {

    }
}