package lab_11_k.newPerson;

import java.io.*;
import java.util.ArrayList;

public class Person {
    //protected Object inp;
    private String name, birthday, address, sex;
    public Person(){};
    public Person(String name,String birthday,String address, String sex)
    {
        this.name=name;
        this.birthday=birthday;
        this.address=address;
        this.sex=sex;
    }
    public ArrayList<NhanVien> FileToInput(String linkFileInput) throws IOException {
        ArrayList<NhanVien> list= new ArrayList<>();
        File f= new File(linkFileInput);
        return list;
    }
    public void outP(NhanVien p){
        Person per = (Person) p;
        System.out.println("Name: " + per.name);
        System.out.println("Nam Sinh: "+ per.birthday);
    }
}
