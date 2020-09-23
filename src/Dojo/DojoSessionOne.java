package Dojo;/*

The following file will run a converter between the temperatures Celsius, Fahrenheit and Kelvin.
Jensah - 20200910

*/

import java.util.*;

public class DojoSessionOne {
    
    public static void main(String[] args) {
        boolean quitApp = true;

        while(quitApp) {
        quitApp = TempConvert();
        }

    }

    public static boolean TempConvert() {
        Scanner sc = new Scanner(System.in);
        String executeAgain = "";

        int[] tempChoice = { 0, 0, 0 };
        double[] tempVal = new double[1];
        tempChoice[0] = 0;
        tempChoice[1] = 0;
        tempChoice[2] = 0;

            while (tempChoice[0] <= 0 || tempChoice[0] > 3 || tempChoice[1] <= 0 || tempChoice[1] > 3) {
                System.out.println(
                        "Please write the temperature you wish to convert from: \n 1 = Celsius \n 2 = Fahrenheit \n 3 = Kelvin");
                tempChoice[0] = sc.nextInt();
                System.out.println(
                        "Please write the temperature you wish to convert to: \n 1 = Celsius \n 2 = Fahrenheit \n 3 = Kelvin");
                tempChoice[1] = sc.nextInt();

                System.out.println("Please write the temperature value for " + tempChoice[0]);
                tempVal[0] = sc.nextDouble();
                sc.nextLine();
            }

            if (tempChoice[0] == 1) {
                TempConvertFromC(tempChoice[1], tempVal[0]);
            } else if (tempChoice[0] == 2) {
                TempConvertFromF(tempChoice[1], tempVal[0]);
            } else if (tempChoice[0] == 3) {
                TempConvertFromK(tempChoice[1], tempVal[0]);
            }
            do {
            System.out.println("Would you like to convert something else? ( Yes / No )");
            executeAgain = sc.nextLine();
            } while (!executeAgain.equals("Yes") && !executeAgain.equals("No"));

            if (executeAgain.equals("Yes")) {  
                return true;
            } else {
                sc.close();
                return false;
            }

    }

    public static void TempConvertFromC(int tempChoice, double tempValue) {
        if (tempChoice == 2) {
            tempValue = (tempValue * (9.0 / 5.0)) + 32.0;
            System.out.println("That is the same as " + tempValue + "F");
        } else if (tempChoice == 3) {
            tempValue = (tempValue + 273.15);
            System.out.println("That is the same as " + tempValue + "K");
        } else {
            System.out.println("Error: Something went wrong");
        }
    }

    public static void TempConvertFromF(int tempChoice, double tempValue) {
        if (tempChoice == 1) {
            tempValue = ((tempValue * (9.0 / 5.0)) + 32.0);
            System.out.println("That is the same as " + tempValue + "C");
        } else if (tempChoice == 3) {
            tempValue = (tempValue + 459.67) * (5.0 / 9.5);
            System.out.println("That is the same as " + tempValue + "K");
        } else {
            System.out.println("Error: Something went wrong");
        }
    }

    public static void TempConvertFromK(int tempChoice, double tempValue) {
        if (tempChoice == 1) {
            tempValue = (tempValue - 273.15);
            System.out.println("That is the same as " + tempValue + "C");
        } else if (tempChoice == 2) {
            tempValue = ((9.0 / 5.0) * tempValue) - 459.67;
            System.out.println("That is the same as " + tempValue + "F");
        } else {
            System.out.println("Error: Something went wrong");
        }
    }

}
