import javax.swing.*;

/*Project: Michigan Area Codes
 *Author: Drew Rautenberg
 *Lab: Wed at 2:30
 */
public class MichiganAreaCodes {
    public static void main(String[] args) {
        //Variable Declaration
        String input;
        long number;
        int areaCode;
        int prefix;
        int suffix;
        int remainder;

        //User Input
        input = JOptionPane.showInputDialog("Enter the phone number.");
        number = Long.valueOf(input);

        //Spit Phone Number
        areaCode = (int)number / 1000;
        remainder
        System.out.println(areaCode);
        prefix =(int) (number % 1000) / 1000;
        System.out.println(prefix);
        suffix = (int) (number % 1000000);
        System.out.println(suffix);
    }
}
