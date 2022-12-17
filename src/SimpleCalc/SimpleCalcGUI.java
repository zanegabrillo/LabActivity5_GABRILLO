package SimpleCalc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalcGUI extends JFrame {
    private JPanel panel1;
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField tfNumber2;
    private JTextField lblResult;

    public static void main(String[] args) {

        SimpleCalcGUI Zane = new SimpleCalcGUI();
        Zane.setTitle("Simple Calculator");
        Zane.setContentPane(Zane.panel1);
        Zane.setSize(1280, 720);
        Zane.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Zane.setVisible(true);
        Zane.lblResult.setEditable(false);

    }
}
