package THtrumilk;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Dictionary dic = new Dictionary();
        Scanner sc = new Scanner(System.in);
        String txt = sc.nextLine();
        System.out.println(dic.binarySearch(txt).getEn());

    }
}
