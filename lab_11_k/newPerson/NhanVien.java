package lab_11_k.newPerson;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class NhanVien extends Person{
    private int luongcb,luong;
    private double thamnien, heso;
    private String phongban;
    public NhanVien(){};
    public NhanVien(String name, String birthday, String address, String sex,String phongban,double thamniem,int luongcb,double heso) {
        super(name, birthday, address, sex);
        this.phongban=phongban;
        this.thamnien=thamniem;
        this.luongcb=luongcb;
        this.heso=heso;
        this.luong = (int)(luongcb*heso*(1+(thamniem)/100));
    }

    @Override
    public ArrayList<NhanVien> FileToInput(String linkFileInput) throws IOException {
        super.FileToInput(linkFileInput);
        ArrayList<NhanVien> list= new ArrayList<>();
        File f= new File(linkFileInput);
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        String text;
        while(!((text=br.readLine()) ==null))
        {
            ArrayList<String> Txt= new ArrayList<>(Arrays.asList(text.split("\\$")));
            NhanVien p = new NhanVien(Txt.get(0),Txt.get(1),Txt.get(2),Txt.get(3),Txt.get(4),Double.valueOf(Txt.get(5)),Integer.valueOf(Txt.get(6)),Double.valueOf(Txt.get(7)));
            list.add(p);
        }
        return list;
    }

    @Override
    public void outP(NhanVien p) {
        super.outP(p);
        System.out.println("Luong: "+p.luong);
    }
}
