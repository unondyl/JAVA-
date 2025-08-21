import java.util.Scanner;

public class phS {
    private int tu,mau;
    public int phTa,phTb,phMa,phMb;
    public phS(){
    }
    public phS(phS p)
    {
        this.phTa=p.phTa;
        this.phMa=p.phMa;
        this.phTb=p.phTb;
        this.phMb=p.phMb;
    }
    public void PrAns(int a,int b){
        ucln gcd=new ucln();
        int tmp=gcd.gcd(a, b);
        a=a/tmp;b=b/tmp;
        if (a==0) System.out.println("Ans : 0");
        else if(b==1) System.out.println("Ans : "+a);
        else System.out.println("Ans : " + a +"/" + b);
    }

    public void inputPhS()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Add PS 1: ");
        phTa=sc.nextInt(); phMa=sc.nextInt();
        System.out.println("Add PS 2: ");
        phTb=sc.nextInt(); phMb=sc.nextInt();
    }
    public void congPS()
    {
        tu=(phTa*phMb+phTb*phMa);
        mau=(phMa*phMb);
        PrAns( tu , mau );
    }
    public void truPS()
    {
        tu=(phTa*phMb-phTb*phMa);
        mau=(phMa*phMb);
        PrAns( tu , mau );
    }
    public void nhanPS()
    {
        tu=(phTa*phTb);
        mau=(phMa*phMb);
        PrAns( tu , mau );
    }
    public void chiaPS()
    {
        tu=(phTa*phMb);
        mau=(phMa*phTb);
        PrAns( tu , mau );
    }
}
