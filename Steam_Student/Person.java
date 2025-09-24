package Steam_Student;

import javax.xml.crypto.Data;
import java.awt.image.SampleModel;
import java.io.*;
import java.util.Scanner;

public class Person {
    private String name,birth,address,sex;
    public Person(){};
    public void inp() throws IOException {
        BufferedReader bur = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Name: ");
        name = bur.readLine();
        System.out.print("Birth: "); birth=bur.readLine();
        System.out.print("Address: "); address = bur.readLine();
        System.out.print("Sex: "); sex =  bur.readLine();


    }
    public void out(DataOutputStream dos,int inter) throws IOException {
        dos.writeUTF(inter+"\t|"+name+"\t|");
    }

}
