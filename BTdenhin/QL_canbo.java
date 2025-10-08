package BTdenhin;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Enumeration;

public class QL_canbo extends JFrame{
    private JPanel PanAdd;
    private JPanel Panview;
    private JTextField name;
    private JButton addBT;
    private JRadioButton boy;
    private JRadioButton girl;
    private JComboBox phongban;
    private JTextField birth;
    private JTextField ress;
    private JTextField lcb;
    private JTextField hsl;
    private JTextField thuong;
    private JTextField phat;
    private JPanel Panelmain;
    private JTable table1;
    private JButton saveBT;
    private int index=1;
    private ArrayList<Person> list = new ArrayList<>();

    public QL_canbo(){
        setContentPane(Panelmain);
        setTitle("QL");
        setSize(300,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        //
        ButtonGroup gender = new ButtonGroup();
        gender.add(boy); gender.add(girl);
        phongban.setSelectedIndex(-1);
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("STT");
        model.addColumn("Ho Ten");
        model.addColumn("Phong Ban");
        model.addColumn("Luong");
        table1.setModel(model);
         //

        addBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Person p = new Canbo(
                        name.getText(),
                        birth.getText(),
                        ress.getText(),
                        toStringBut(gender),
                        phongban.getSelectedItem()+"",
                        Double.parseDouble(hsl.getText()),
                        Double.parseDouble(lcb.getText()),
                        Double.parseDouble(thuong.getText()),
                        Double.parseDouble(phat.getText())
                );
                list.add(p);
                Canbo b = (Canbo)p;
                model.addRow(new Object[]{index++,name.getText(),phongban.getSelectedItem(),b.luong});
                table1.setModel(model);
                name.setText("");
                birth.setText("");
                gender.clearSelection();
                ress.setText("");
                phongban.setSelectedIndex(-1);
                hsl.setText("");
                lcb.setText("");
                thuong.setText("");
                phat.setText("");
            }
        });
        saveBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    toFile();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                JOptionPane.showMessageDialog(
                        Panelmain,"Luu thanh cong"
                );
            }
        });
    }
    public static void main(String[] args) {
        new QL_canbo();
    }

    private String toStringBut(ButtonGroup g){
        for(Enumeration<AbstractButton> buttons=g.getElements();buttons.hasMoreElements();){
            AbstractButton button = buttons.nextElement();
            if(button.isSelected()){
                return button.getText();
            }

        }
        return null;
    }
    private void toFile() throws IOException{
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("canbo.dat")));
        oos.writeObject(list);
        oos.close();
    }
}
