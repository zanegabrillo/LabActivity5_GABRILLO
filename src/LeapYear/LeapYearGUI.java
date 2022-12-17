package LeapYear;

import javax.swing.*;

public class LeapYearGUI extends JFrame {
    private JPanel panel1;
    private JTextField tfYear;
    private JButton btnCheckYear;

    public static void main(String[] args) {
        LeapYearGUI Zane = new LeapYearGUI();
        Zane.setTitle("Leap Year Checker");
        Zane.setContentPane(Zane.panel1);
        Zane.setSize(1280, 720);
        Zane.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Zane.setVisible(true);
    }
}
