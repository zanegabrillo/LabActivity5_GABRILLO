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

    public SimpleCalcGUI(){

        btnCompute.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                try {

                    String one = tfNumber1.getText();
                    int iNumOne = Integer.parseInt(one);

                    String two = tfNumber2.getText();
                    int iNumTwo = Integer.parseInt(two);
                    int equation = 0;
                    String operator = (String) cbOperations.getSelectedItem();


                    switch (operator) {
                        case "+":
                            equation = iNumOne + iNumTwo;
                            break;
                        case "-":
                            equation = iNumOne - iNumTwo;
                            break;
                        case "*":
                            equation = iNumOne * iNumTwo;
                            break;
                        case "/":
                            equation = iNumOne / iNumTwo;
                            break;
                    }
                    lblResult.setText(Integer.toString(equation));
                }catch(NumberFormatException f){
                    JOptionPane.showMessageDialog(null, "Wrong input!");
                }catch(NullPointerException h) {
                    JOptionPane.showMessageDialog(null, "Wrong input!");
                }catch(ArithmeticException g){
                    JOptionPane.showMessageDialog(null, "Cannot divide zero!");
                }
            }
        });
    }
    public static void main(String[] args) {

        SimpleCalcGUI Zane = new SimpleCalcGUI();
        Zane.setTitle("Simple Calculator");
        Zane.setContentPane(Zane.panel1);
        Zane.setSize(1300, 800);
        Zane.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Zane.setVisible(true);
        Zane.lblResult.setEditable(false);

    }
}
