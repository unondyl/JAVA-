import java.util.Scanner;

import javax.security.sasl.SaslException;

public class Cau6 {
    public static void main( String [] args)
    {
        int count_a=0,count_d=0,n;
        int a[]=new int[1000], d[]=new int[1000];
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int tmp=sc.nextInt();
            if(tmp>0)
                d[++count_d]=d[count_d-1]+tmp;
            else 
                a[++count_a]=a[count_a-1]+tmp;
        }
        System.out.println((float)(d[count_d]/(count_d)));
        System.out.println((float)(a[count_a]/(count_a)));
    }    
}
