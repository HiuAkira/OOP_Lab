import java.util.Scanner;
import javax.swing.JOptionPane;
public class InputFromKeyboard{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What's your name?");
        String strName = keyboard.nextLine();
        System.out.println("How old r u?");
        int iAge = keyboard.nextInt();
        System.out.println("How tall are u (m)?");
        double  hHeight = keyboard.nextDouble();
        System.out.println("Mrs/Ms. " + strName + "," + iAge + " years old." + " Your height is " + hHeight + ".");
        System.exit(0);
    }
}