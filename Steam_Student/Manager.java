package Steam_Student;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;

import static java.awt.BorderLayout.*;

public class Manager extends JFrame {

    private JTextField name;
     private JTextField birth;
    private JTextField address;
    private JTextField id;
    private JTextField GPA;
    private JTextField email;
    //private JButton addButton;
    private JPanel JPmanager;
    private JPanel JPmenu;
    private JButton Add;
    private JButton save;
    private JComboBox sex;
    private JPanel JPadd;
    private JButton viewTableButton;
    private JButton Close;
    private JButton btnew;
    //private JList<Person> Llist;
    private JPanel JPtable;
    private JTable tbList;
    private JScrollPane JScoll;
    //private JButton Save;
    private static ArrayList<Person> list= new ArrayList<>();
    public Manager() throws IOException {
        //Defaul
        setContentPane(JPmanager);
        setTitle("Maneger");
//        ImageIcon icon= new ImageIcon("\"D:\\dbclkt.actvn\\actvn.ico\"");
//        JPmanager.setIconImage(icon);
        setSize(400, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        //messenger.set(S100,50);
        sex.setSelectedIndex(-1);
        //messenger.setVisible(false);
        JPtable.setVisible(false);
        JPmenu.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
                JPmenu.setSize(100, 600);
                btnew.setBounds(15, 20, 70, 20);
                save.setBounds(15, 60, 70, 20);
                viewTableButton.setBounds(15, 100, 70, 20);
                tbList.setBounds(12, 30, 600, 600);
                JScoll.setBounds(12, 30, 600, 600);
                JPtable.setBounds(120, 0, 700, 500);
                JPadd.setBounds(125, 0, 350, 600);

            }
        });
        //Set Save
        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPadd.setVisible(false);
                JPtable.setVisible(false);
                try {
                    toFile();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                JOptionPane.showMessageDialog(
                        null, "Đã lưu", "Thông báo", JOptionPane.WARNING_MESSAGE
                );
            }
        });

        //Set Add
        JPadd.setVisible(false);
        JPadd.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentHidden(ComponentEvent e) {
                setSize(400, 600);
                super.componentHidden(e);
                //JPadd.setBounds(0,0,600,600);
                //name.setBounds(50,50,20,400);
            }
        });
        Add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Person per = new Student(name.getText(), birth.getText(), address.getText(), sex.getSelectedItem() + "", email.getText(), id.getText(), GPA.getText());
                list.add(per);
                System.out.println(sex.getSelectedItem() + "");
                name.setText("");
                birth.setText("");
                address.setText("");
                email.setText("");
                id.setText("");
                GPA.setText("");
                sex.setSelectedIndex(-1);
            }
        });

        Close.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPadd.setVisible(false);
            }
        });
        btnew.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPtable.setVisible(false);
                JPadd.setVisible(true);
                setSize(400, 600);
                name.setText("");name.setBackground(Color.WHITE);
                birth.setText("");birth.setBackground(Color.WHITE);
                address.setText("");address.setBackground(Color.WHITE);
                email.setText("");email.setBackground(Color.WHITE);
                id.setText("");id.setBackground(Color.WHITE);
                GPA.setText("");GPA.setBackground(Color.WHITE);
                sex.setSelectedIndex(-1);
            }
        });
        // Set View Table

        viewTableButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setSize(800, 600);
                JPadd.setVisible(false);
                JPtable.setVisible(true);
                DefaultTableModel model = new DefaultTableModel();
                model.addColumn("ID");
                model.addColumn("Name");
                model.addColumn("BirthDay");
                model.addColumn("Address");
                model.addColumn("Sex");
                model.addColumn("Email");
                for (Person p : list) {
                    Student stu = (Student) p;
                    model.addRow(new Object[]{stu.getId(), stu.getName(), stu.getBirth(), stu.getAddress(), stu.getSex(), stu.getEmail()});
                }

                //JScrollPane JSC = new JScrollPane();
                //JSC.setViewportView(tbList);
                tbList.setModel(model);
                setSize(800, 600);
            }
        });
        focus(name);focus(id);focus(address);focus(birth);focus(email);focus(GPA);
    }
    private static void toFile() throws IOException{
        File f = new File("D:\\actvn\\JAVA\\SinhVien.dat");
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        for(Person p : list){
            p.out(oos);
        }
        oos.close();
        fos.close();
    }
    private static void focus(JTextField var){
        var.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                //super.focusLost(e);
                if(var.getText().trim().isEmpty())
                {
                   var.setBackground(Color.RED);
                   //var.requestFocus();
                }
                else var.setBackground(Color.WHITE);
            }
        });
    }




// Main
    public static void main(String[] args) throws IOException {
        new Manager();
    }
}
