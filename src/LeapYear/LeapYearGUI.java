package LeapYear;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYearGUI extends JFrame {
    private JPanel panel1;
    private JTextField tfYear;
    private JButton btnCheckYear;
    public LeapYearGUI() {
        btnCheckYear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                    String IYear = tfYear.getText();
                    int year = Integer.parseInt(IYear);
                    if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)){
                        JOptionPane.showMessageDialog(panel1, "Leap Year");
                    }
                    if (year < 0) {
                        throw new IllegalArgumentException("Years not be negative");
                    }
                    else {
                        JOptionPane.showMessageDialog(panel1, "Not a Leap Year");
                    }

            }
        });
    }
    public static void main(String[] args) {
        LeapYearGUI Zane = new LeapYearGUI();
        Zane.setTitle("Leap Year Checker");
        Zane.setContentPane(Zane.panel1);
        Zane.setSize(1280, 720);
        Zane.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Zane.setVisible(true);
    }
}
