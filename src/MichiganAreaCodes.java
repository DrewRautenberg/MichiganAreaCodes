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
                    System.out.println("Northwestern Lower Michigan");
                    break;
                case 248:
                    System.out.println("Northern Metro Detroit");
                    break;
                case 269:
                    System.out.println("Southwestern Michigan");
                    break;
                case 313:
                    System.out.println("Wayne County");
                    break;
                case 517:
                    System.out.println("South Central Michigan");
                    break;
                case 586:
                    System.out.println("Northwestern Metro Detroit");
                    break;
                case 616:
                    System.out.println("Western Michigan");
                    break;
                case 734:
                    System.out.println("Western and Down River/ Southeastern Michigan Metro Detroit");
                    break;
                case 810:
                    System.out.println("Southern Flint and The Thumb");
                    break;
                case 906:
                    System.out.println("Upper Peninsula");
                    break;
                case 947:
                    System.out.println("Northern Metro Detroit");
                    break;
                case 989:
                    System.out.println("Central, Tri-Cities and Northeastern Lower Michigan");
                    break;
            }
        }
        else {
            System.out.println("Is not in Michigan");
        }

    }
}
