package FoodOrdering;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrderGUI extends JFrame{
    private JPanel panel1;
    private JCheckBox cPizza;
    private JRadioButton rbNone;
    private JButton btnOrder;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;

    public FoodOrderGUI(){
        btnOrder.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    ButtonGroup GR = new ButtonGroup();
                    GR.add(rbNone);
                    GR.add(rb5);
                    GR.add(rb10);
                    GR.add(rb15);

                    boolean selectbox = false;
                    double price = 0;


                    if (cPizza.isSelected()) {
                        selectbox= true;
                        price += 100;

                    }
                    if (cBurger.isSelected()) {
                        selectbox = true;
                        price += 80;

                    }
                    if (cFries.isSelected()) {
                        selectbox = true;
                        price += 65;
                    }
                    if (cSoftDrinks.isSelected()) {
                        selectbox= true;
                        price += 55;

                    }
                    if (cTea.isSelected()) {
                        selectbox = true;
                        price += 50;

                    }
                    if (cSundae.isSelected()) {
                        selectbox = true;
                        price += 40;

                    }

                    if (rbNone.isSelected()) {
                        selectbox = true;
                        price = price;

                    }
                    if (rb5.isSelected()) {
                        selectbox = true;
                        double disprice = price * 0.05;
                        price = price - disprice;

                    }
                    if (rb10.isSelected()) {
                        selectbox = true;
                        double disprice = price * 0.10;
                        price = price - disprice;

                    }
                    if (rb15.isSelected()) {
                        selectbox = true;
                        double  disprice = price * 0.15;
                        price = price - disprice;

                    }

                    if(selectbox == false) {
                        throw new Exception("Input Something");
                    }
                    JOptionPane.showMessageDialog(panel1, "The total price is Php " + String.format("%.2f", price));
                }
                catch (Exception g) {
                    JOptionPane.showMessageDialog(null,g.getMessage());
                }
            }
        });
    }
    public static void main(String[] args) {
        FoodOrderGUI Zane = new FoodOrderGUI();
        Zane.setTitle("Food Ordering System");
        Zane.setContentPane(Zane.panel1);
        Zane.setSize(1300, 800);
        Zane.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Zane.setVisible(true);
    }
}
