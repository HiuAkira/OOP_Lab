import java.util.Scanner;
import javax.swing.JOptionPane;
public class ShowTwoNumbers{
    public static void main(String[] args) {
        String strN1, strN2;
        String strNof = "U're just entered: ";
        strN1 = JOptionPane.showInputDialog(null, "Please input the first number: ","12",JOptionPane.INFORMATION_MESSAGE);
        strNof += strN1 + " and ";
        strN2 = JOptionPane.showInputDialog(null, "Please input the second number: ","14",JOptionPane.INFORMATION_MESSAGE);
        strNof += strN2;
        JOptionPane.showMessageDialog(null, "Show two numbers ", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}