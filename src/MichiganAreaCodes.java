/*Project: Michigan Area Codes
 *Author: Drew Rautenberg
 *Lab: Wed at 2:30
 */
import javax.swing.*;
public class MichiganAreaCodes {
    public static void main(String[] args) {
        //Variable Declaration
        String input;
        long number;
        int areaCode;
        int prefix;
        int suffix;
        int remainder;
        boolean isMi;

        //User Input
        input = JOptionPane.showInputDialog("Enter the phone number.");
        number = Long.parseLong(input);

        //Spit Phone Number
        System.out.println(number);
        areaCode = (int) (number / 10000000);
        remainder = (int) (number % 10000000);
        prefix = remainder / 10000;
        remainder = remainder % 10000;
        suffix = remainder;

        System.out.println("(" + areaCode + ") " + prefix + " " + suffix);

        switch (areaCode){
            case 231:
            case 248:
            case 269:
            case 313:
            case 517:
            case 586:
            case 616:
            case 734:
            case 810:
            case 906:
            case 947:
            case 989:
                isMi = true;
                break;
            default:
                isMi = false;
                 break;
        }
        if (isMi){
            switch (areaCode){
                case 231:
                    System.out.println("Northwestern L");
                case 248:
                case 269:
                case 313:
                case 517:
                case 586:
                case 616:
                case 734:
                case 810:
                case 906:
                case 947:
                case 989:
            }
        }

    }
}
