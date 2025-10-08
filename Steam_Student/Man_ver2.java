package Steam_Student;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Enumeration;

public class Man_ver2 extends JFrame{
    //Zone Var
    private JPanel JPmain;
    private JPanel JPmenu;
    private JPanel JPadd;
    private JPanel JPtable;
    private JButton inputBT;
    private JButton saveBT;
    private JButton viewBT;
    private JTextField name;
    private JButton addBT;
    private JButton closeBT;
    private JTextField id;
    private JTextField birth;
    private JTextField address;
    private JTextField email;
    private JTextField gpa;
    private JCheckBox boyCheckBox;
    private JCheckBox girlCheckBox;
    private JTable Jtable;
    private JPanel Space;
    // private ButtonGroup sexBG;
    private int index=0;
    private static ArrayList<Person> list = new ArrayList<>();
    //Zone construct
    public Man_ver2() throws Exception{
        //Set Default
        setContentPane(JPmain);
        setSize(870,600);
        setTitle("Sinh Vien");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        JPadd.setVisible(false);
        JPtable.setVisible(false);
        ButtonGroup sexBG= new ButtonGroup();
        sexBG.add(boyCheckBox);
        sexBG.add(girlCheckBox); sexBG.clearSelection();
        // set Zone Menu
        JPmenu.setSize(150,600);
        JPadd.setBounds(160,0,650-160,600);
        //System.out.println(0);
        DefaultTableModel model  = new DefaultTableModel();
        model.addColumn("STT");
        model.addColumn("Name");
        model.addColumn("ID");
        model.addColumn("Sex");
        model.addColumn("Address");
        model.addColumn("Email");
        model.addColumn("GPA");
        Jtable.setModel(model);
        //Set Zone Menu
        JPmenu.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
                JPmenu.setSize(150,600);
                //System.out.println(1);
                inputBT.setBounds(20,30,110,30);
                saveBT.setBounds(20,90,110,30);
                viewBT.setBounds(20,150,110,30);
                Space.setSize(155,600);
            }
        });
        JPadd.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
                JPadd.setBounds(160,0,650-160,600);
                addBT.setBounds(35+20,600-100,150,30);
                closeBT.setBounds(65+20+150,600-100,150,30);
            }
        });
        inputBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPtable.setVisible(false);
                JPadd.setVisible(true);
            }
        });

        addBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Person p = new Student(name.getText(), birth.getText(),address.getText(),getSelectedText(sexBG),email.getText(),id.getText(),gpa.getText());
                model.addRow(new Object[]{(++index),name.getText(),id.getText(),getSelectedText(sexBG),address.getText(),email.getText(),gpa.getText()});
                name.setText(null);sexBG.clearSelection();id.setText(null);address.setText(null);email.setText("");gpa.setText("");birth.setText("");
                list.add(p);
            }
        });
        closeBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPadd.setVisible(false);
            }
        });

        saveBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPtable.setVisible(false);
                JPadd.setVisible(false);
                System.out.println(list.size()==0);
                if(list.isEmpty())
                {
                    JOptionPane.showMessageDialog(
                            null,"Danh sach trong khong the luu", "Thong bao", JOptionPane.ERROR_MESSAGE
                    );
                } else {
                    try {
                        toFile(new File("sinhviet.dat"));
                        ObjectToFile();
                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }
                    JOptionPane.showMessageDialog(
                            null, "Luu thanh cong!", "Thong bao", JOptionPane.INFORMATION_MESSAGE
                    );
                }
            }
        });
        viewBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPadd.setVisible(false);
                JPtable.setVisible(true);
            }
        });
    }

    //Zome
    private static String getSelectedText(ButtonGroup g) {
        for (Enumeration<AbstractButton> buttons = g.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();
            if (button.isSelected()) {
                return button.getText();
            }
        }
        return null;
    }
    private static void toFile(File f) throws IOException {
        FileWriter fw = new FileWriter(f);
        BufferedWriter bw= new BufferedWriter(fw);
        for (Person p : list) p.out(bw);
        bw.close();fw.close();
    }
    private static void ObjectToFile() throws IOException{
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(new File("Oblect_NhanVien.dat")));
        for(Person p:list) oos.writeObject(p);
        oos.close();
    }
    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    static void main(String[] args) throws Exception {
        new Man_ver2();
    }
}
