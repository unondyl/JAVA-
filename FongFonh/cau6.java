import java.util.Scanner;
public class cau6{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int a[] = new int [n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        } 
        int sum_a=0,sum_d=0, count_a=0,count_d=0;
        for(int i=0;i<n;i++)
        {
            if (a[i]<0) {sum_a=sum_a+a[i]; count_a++;}
            else { sum_d=sum_d+a[i];count_d++;}
        }
        System.out.println((double)(sum_a/count_a));
        System.out.println((double)(sum_d/count_d));
    }
}