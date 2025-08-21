package lib;

public class math {
    public int gcd(int a, int b)
    {
        while(b!=0)
        {
            int tmp=a%b;
            a=b;
            b=tmp;
        }
        return a;
    }
}
