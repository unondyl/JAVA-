package Steam_Student;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Manager{

    public static int E_choice(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter choice: \n 1.Add\n 2.Save file ane Return");
        int tmp = sc.nextInt();sc.nextLine();
        return tmp;
    }

    public static void main(String[] args) throws IOException {
        File f = new File("D:\\actvn\\JAVA\\data.dat");
        FileOutputStream fos= new FileOutputStream(f);
        DataOutputStream dos = new DataOutputStream(fos);
        Person stu;int inter=1;
        while(true){
            switch (E_choice()){
                case 1:
                    stu = new Student();
                    stu.inp();
                    stu.out(dos,inter++);
                    break;
                case 2:
                    dos.close();
                    return;
            }
        }
    }
}
