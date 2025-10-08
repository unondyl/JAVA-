package Steam_Student;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;

public class QL_nhanvien extends JFrame {
    private JTable view;
    private JTextField name;
    private JButton add;
    private JButton save;
    private JCheckBox boy;
    private JCheckBox girl;
    private JTextField birth;
    private JTextField address;
    private JTextField hsluong;
    private JTextField thamnien;
    private JTextField luongcb;
    private JPanel JPadd;
    private JPanel JPview;
    private JPanel JPmain;
    private JComboBox phongban;
    private static ArrayList<Person> list = new ArrayList<>();

    private int index;
    //
    public QL_nhanvien() throws IOException{
        setContentPane(JPmain);
        setTitle("Quán Lý Nhân Viên 1.0.2");
        setDefaultCloseOperation(3);
        setSize(600,800);
        setVisible(true);
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("STT");model.addColumn("Họ và Tên");model.addColumn("Địa Chỉ");
        model.addColumn("Phòng ban");model.addColumn("Lương Thực Lĩnh");
        view.setModel(model);
        ButtonGroup sex = new ButtonGroup();
        sex.add(boy);sex.add(girl);
        phongban.setSelectedIndex(-1);

        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Person p = new NhanVien(
                        name.getText(),
                        birth.getText(),
                        address.getText(),
                        getSelectedText(sex),
                        phongban.getSelectedItem()+"",
                        Integer.parseInt(hsluong.getText()),
                        Integer.parseInt(luongcb.getText()),
                        Integer.parseInt(thamnien.getText())
                );
                list.add(p);
                model.addRow(new Object[]{++index,name.getText(),address.getText(),phongban.getSelectedItem(),((NhanVien)p).luong()});
                name.setText("");
                birth.setText("");
                address.setText("");
                sex.clearSelection();
                phongban.setSelectedIndex(-1);
                hsluong.setText("");
                luongcb.setText("");
                thamnien.setText("");
            }
        });
    }
    //


    public static void main(String[] args) throws IOException {
        new QL_nhanvien();
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
}
