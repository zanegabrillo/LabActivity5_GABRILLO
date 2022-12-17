package FoodOrdering;

import javax.swing.*;


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


    public static void main(String[] args) {
        FoodOrderGUI Zane = new FoodOrderGUI();
        Zane.setTitle("Food Ordering System");
        Zane.setContentPane(Zane.panel1);
        Zane.setSize(1300, 800);
        Zane.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Zane.setVisible(true);
    }
}
