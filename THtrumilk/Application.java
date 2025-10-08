package THtrumilk;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.JOptionPane.OK_CANCEL_OPTION;

public class Application extends JFrame{
    private JTextField key;
    private JButton searchBT;
    private JPanel mainPan;

    public Application() {
        setContentPane(mainPan);
        setSize(400,300);
        setTitle("Search Word");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        Dictionary dic = new Dictionary();
        searchBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Word w;
                System.out.println(dic.binarySearch(key.getText()));
                if((w = dic.binarySearch(key.getText()))==(null)){
                    //System.out.println(key.getText());
                    String viBT = JOptionPane.showInputDialog(
                            mainPan,
                            "Dịnh nghia -"+key.getText()+"- dang vi: " ,
                            "Nhập dữ liệu",
                            JOptionPane.QUESTION_MESSAGE
                    );
                    w= new Word(dic.length()+1,key.getText(),viBT);
                    System.out.println("ww= "+w.getId());
                    dic.add(w);
                }
                else{
                    //new ShowDilogAns(key.getText());
                    System.out.println(w.getId());
                    JOptionPane.showMessageDialog(
                            mainPan,
                            w.getEn()+" : "+w.getVi()
                    );
                }
                key.setText("");
            }
        });
    }
    public static void main(String[] args) {
        new Application();
    }
}
