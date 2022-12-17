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
                try {
                    String IYear = tfYear.getText();
                    int Tuig = Integer.parseInt(IYear);
                    if (((Tuig % 4 == 0) && (Tuig % 100!= 0)) || (Tuig%400 == 0)){
                        JOptionPane.showMessageDialog(panel1, "Leap Year");
                    }
                    if (Tuig < 0) {
                        throw new IllegalArgumentException("Years not be negative");
                    }
                    else {
                        JOptionPane.showMessageDialog(panel1, "Not a Leap Year");
                    }
                } catch (NullPointerException | NumberFormatException error) {
                    JOptionPane.showMessageDialog(null, "Please enter a correct year");
                } catch(IllegalArgumentException error2){
                    JOptionPane.showMessageDialog(null, error2.getMessage());
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
