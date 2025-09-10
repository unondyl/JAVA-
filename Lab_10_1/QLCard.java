package Lab_10_1;

import java.util.ArrayList;
import java.util.Scanner;

public class QLCard {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Card s=new Card();
    s.setdata();
    System.out.println(s.getName());
    System.out.println(s.getClassroom());
    System.out.println(s.getSeri());
}
}
