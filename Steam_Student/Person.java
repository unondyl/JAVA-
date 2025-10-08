package Steam_Student;

import javax.swing.*;
import java.io.*;

public class Person extends JFrame {
    private String name,birth,address,sex;
    public Person(BufferedWriter dos){};
    public Person(String name, String birth,String address, String sex)
    {
        this.name=name;
        this.birth=birth;
        this.address=address;
        this.sex=sex;
    }
    public void inp() throws IOException {
        BufferedReader bur = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Name: ");
        name = bur.readLine();
        System.out.print("Birth: "); birth=bur.readLine();
        System.out.print("Address: "); address = bur.readLine();
        System.out.print("Sex: "); sex =  bur.readLine();


    }

    //Get
    public void out(ObjectOutputStream dos) throws IOException {

        dos.writeObject(name+" \t|"+birth+" \t|"+address+" \t|"+sex+" \t|");
    }
    public void out(BufferedWriter dos) throws IOException {

        dos.write(name+" \t|"+birth+" \t|"+address+" \t|"+sex+" \t|");
    }
    public void out2(){

    }

    public String getAddress() {
        return address;
    }

    public String getBirth() {
        return birth;
    }
    public String getName() {
        return this.name;
    }

    public String getSex() {
        return sex;
    }
}
