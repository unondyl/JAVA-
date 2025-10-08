package Steam_Student;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public  class Sinhvien_co  extends JFrame{
    private JPanel JPview;
    private JTable view;
    public Sinhvien_co() throws IOException{
        int index = 0;
        setContentPane(JPview);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("View");
        setSize(900,500);
        setVisible(true);
        DefaultTableModel model = new DefaultTableModel();
        //model.addColumn("STT");
        model.addColumn("Name");
        model.addColumn("ID");
        model.addColumn("Sex");
        model.addColumn("Address");
        model.addColumn("Email");
        model.addColumn("GPA");
        FileReader fr = new FileReader(new File("D://inpSinhVien.dat"));
        BufferedReader ois = new BufferedReader(fr);

        String str;
        //System.out.println(String.valueOf(ois.readLine())==null);
        while(!((str = String.valueOf(ois.readLine())).equals("null"))) {
            //System.out.println("s"+str);
            ArrayList<String> txt = new ArrayList<>(Arrays.asList(str.split("\\$")));
            //if(txt.getLast()==null) txt.removeLast();
            model.addRow(new Object[]{++index,txt.get(0),txt.get(1),txt.get(2),txt.get(3),txt.get(4),txt.get(5)});
        }
        ois.close();
        view.setModel(model);
        }
    public static void main(String[] args) throws IOException {
        new Sinhvien_co();
    }
}
