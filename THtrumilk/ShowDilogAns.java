package THtrumilk;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShowDilogAns extends JOptionPane {
    private JTextField enBT;
    private JTextField viBT;
    private JButton addB;
    private JPanel add;
    private String vi;

    public ShowDilogAns() {
        add(add);
        setSize(300,200);
        setVisible(true);
    }
    public static void showMessageDialog(Component parentComponent, Object message) throws HeadlessException {
        showMessageDialog(parentComponent, message, UIManager.getString("OptionPane.messageDialogTitle"), INFORMATION_MESSAGE);

    }
}
