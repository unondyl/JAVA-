import java.util.Scanner;

public class cau9 {
    public static void main(String []args)
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt(), count_a=0,count_d=0;
        int a[]=new int[1000],d[]=new int[1000];
        for(int i=0;i<n;i++)
        {
            int tmp=sc.nextInt(); 
            if(tmp<0) a[count_a++]=tmp;
            else d[count_d++]=tmp;
        }
        for(int i=0;i<count_a;i++)
        System.out.print(a[i] + " ");
        System.out.println("");
        for(int i=0;i<count_d;i++)
        System.out.print(d[i] + " ");
    }
}
