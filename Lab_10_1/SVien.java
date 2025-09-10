package Lab_10_1;

import java.util.Scanner;

public class SVien {
    private String name,birth,age,classroom;
    public SVien(){}
//    public SVien(String name,String birth,String age,String classroom){
//        this.name=name;
//        this.birth=birth;
//        this.age=age;
//        this.classroom=classroom;
//    }

   public void setdata()
   {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter name: ");name=sc.nextLine();
       System.out.print("Enter birth year: ");birth=sc.nextLine();
       System.out.print("Enter age: ");age=sc.nextLine();
       System.out.print("Enter classroom: ");classroom=sc.nextLine();
   }
    public String getClassroom() {
        return classroom;
    }
    public String getName() {
        return name;
    }
}
