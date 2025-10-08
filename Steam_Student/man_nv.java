package Steam_Student;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;

public class man_nv extends JFrame {
    private JPanel JPmain;
    private JButton inputBT;
    private JButton saveBT;
    private JButton viewBT;
    private JTextField name;
    private JButton addBt;
    private JTextField birth;
    private JCheckBox boy;
    private JCheckBox girl;
    private JComboBox phongban;
    private JTextField luongcb;
    private JTextField hsluong;
    private JTextField thamnien;
    private JPanel JPmenu;
    private JPanel JPadd;
    private JPanel JPview;
    private JTextField address;
    private JTable view;
    private static ArrayList<Person> list = new ArrayList<>();

    public man_nv(){
        setContentPane(JPmain);
        setTitle("Nhan Vien");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(750,600);
        setVisible(true);
        phongban.setSelectedIndex(-1);
        ButtonGroup sex= new ButtonGroup();
        sex.add(boy);sex.add(girl);
        sex.clearSelection();
        JPadd.setVisible(false);
        JPadd.setSize(151,600);
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("STT");
        model.addColumn("Ho Ten");
        model.addColumn("Gioi tinh");
        model.addColumn("Tham nien");
        model.addColumn("Luong");
        view.setModel(model);
        JPmenu.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
                JPmenu.setSize(150,600);
                //System.out.println(1);
                inputBT.setBounds(20,30,110,30);
                saveBT.setBounds(20,90,110,30);
                viewBT.setBounds(20,150,110,30);
            }
        });
        inputBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPview.setVisible(false);
                JPadd.setVisible(true);
            }
        });

        addBt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Person p = new NhanVien(name.getText(),
                        birth.getText(),address.getText(),
                        getSelectedText(sex),
                        phongban.getSelectedItem()+"",
                        Integer.parseInt(hsluong.getText()),
                        Integer.parseInt(luongcb.getText()),
                        Integer.parseInt(thamnien.getText())
                );
                list.add(p);
                model.addRow(new Object[]{"",name.getText(),getSelectedText(sex),thamnien.getText(),((NhanVien) p).luong()});
                view.setModel(model);
                name.setText(null);
                sex.clearSelection();
                birth.setText(null);
                address.setText(null);
                phongban.setSelectedIndex(-1);
                thamnien.setText("");
                luongcb.setText("");
                hsluong.setText("");
            }
        });
        viewBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPadd.setVisible(false);
                JPview.setVisible(true);
            }
        });
        saveBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPadd.setVisible(false);
                JPview.setVisible(true);
                try {
                    toFile(new File("NhanVien.dat"));
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                JOptionPane.showMessageDialog(
                        null,"Luu thanh cong", "Thong bao",1
                );
            }
        });
    }

    public static void main(String[] args) {
        new man_nv();
    }

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
}
