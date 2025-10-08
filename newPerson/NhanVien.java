package newPerson;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class NhanVien implements Person {
    private int luongcb,luong;
    private double thamnien, heso;
    private String phongban,name,birthday,address,sex;
    public NhanVien(){};
    public NhanVien(String name, String birthday, String address, String sex,String phongban,double thamniem,int luongcb,double heso) {
        this.name= name;
        this.address=address;
        this.birthday=birthday;
        this.sex=sex;
        this.phongban=phongban;
        this.thamnien=thamniem;
        this.luongcb=luongcb;
        this.heso=heso;
        this.luong = (int)(luongcb*heso*(1+(thamniem)/100));
    }
    private static NhanVien sloveText(String text){
        ArrayList<String> Txt= new ArrayList<>(Arrays.asList(text.split("\\$")));
        NhanVien p = new NhanVien(Txt.get(0),Txt.get(1),Txt.get(2),Txt.get(3),Txt.get(4),Double.valueOf(Txt.get(5)),Integer.valueOf(Txt.get(6)),Double.valueOf(Txt.get(7)));
        return p;
    }
    @Override
    public ArrayList<NhanVien> FileToInput(String linkFileInput) throws IOException {
        ArrayList<NhanVien> list = new ArrayList<>();
        try {
            File f = new File(linkFileInput);
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String text;
            while(!((text=br.readLine()) ==null)) list.add(sloveText(text));
            br.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

    @Override
    public void outP(NhanVien p) {
        System.out.println("Name: "+p.name);
        System.out.println("Sexo: "+p.sex);
        System.out.println("Luong: "+p.luong);
    }
}
