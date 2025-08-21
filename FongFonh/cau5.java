import java.util.Scanner;
public class cau5 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int thang = sc.nextInt(), nam= sc.nextInt();
        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30");
                break;
            case 2:
                if (nam%4==0 && nam%100 != 0 || nam%400==0){
                    System.out.println("29");
                }else System.out.println("28");
                break;
        }
        }
    }
