package lab_7_Bank;

class Fee extends Account{
    public Fee (double initBalance)
    {
        super(initBalance);
    }
    @Override
    void endMontthChagre() {
        balance -=5.0;
    }

    @Override
    public void endMonthCharge() {

    }
}
