import java.util.Scanner;
public class cau10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[]= new int [n];
        for (int i=0;i<n; i++){
            a[i]= sc.nextInt();}
        for(int i=0; i<n ;i++)
        if (a[i]<0) System.out.print(+a[i]+" ");System.out.println();
        for(int i=0;i!=n;i++) if (a[i]>0) System.out.print(+a[i]+" ");
        }
    }

