package E01_VariablesExpressions;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ex1ConvertDegree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String tempScaleFrom = "";
        String tempScaleTo = "";
        String yesNo = "";
        double celsius = 0.0;
        double kelvin = 0.0;
        double fahrenheit = 0.0;
        double degree = 0.0;
        List<String> validScales = Arrays.asList("K", "k", "F", "f", "C", "c"); // Creates a list that I will check with input later

        do {
            tempScaleFrom = getValueFromInput(
                    "Enter the scale you want to convert from. C(Celsius), K(Kelvin) or F(Fahrenheit): ",
                    input
            );
            while (!validScales.contains(tempScaleFrom)) {  // ONLY A WHILE
                System.out.print("Please enter a valid scale( C, K or F ): ");
                tempScaleFrom = input.nextLine();
            }   // Checks if it's the right input

            System.out.print("Enter a degree in the chosen scale: ");
            degree = input.nextDouble();
            input.nextLine();
            boolean isDigit = Character.isDigit((char) degree);
            while ( isDigit = false) {
                System.out.println("This is not a valid number");
                degree = input.nextDouble();
                isDigit = true;
                input.nextLine();
            }   // Checks if it's the right input

            System.out.print("Enter the scale you want to convert to C(Celcius) K(Kelvin) or F(Fahrenheit): ");
            tempScaleTo = input.nextLine();
            while (!validScales.contains(tempScaleTo)) {  // This could call a method instead?
                System.out.print("Please enter a valid scale( C, K or F ): ");
                tempScaleTo = input.nextLine();
            }   // Checks if it's the right input
            // switch state
            if (tempScaleFrom.equalsIgnoreCase("k")) {
                if (tempScaleTo.equalsIgnoreCase("f")) {
                    fahrenheit = (kelvin * 9/5.0) - 459.67;
                    System.out.println(degree + " Kelvin to Fahrenheit: " + fahrenheit);
                } else if (tempScaleTo.equalsIgnoreCase("c")) {
                    celsius = kelvin - 273.15;
                    System.out.println(degree + " Kelvin to Celsius: " + celsius);
                } else {
                    System.out.println(" Kelvin to Kelvin: Invalid");
                }
            } else if (tempScaleFrom.equalsIgnoreCase("f")) {
                if (tempScaleTo.equalsIgnoreCase("c")) {
                    celsius = (fahrenheit - 32) * (5/9.0);
                    System.out.println(degree + " Fahrenheit to Celsius: " + celsius);
                } else if (tempScaleTo.equalsIgnoreCase("k")){
                    kelvin = (fahrenheit + 459.67) * (5/9.0);
                    System.out.println(degree + " Fahrenheit to Kelvin: " + kelvin);
                } else {
                    System.out.println(" Fahrenheit to Fahrenheit: Invalid");
                }
            } else {                // if it is Celcius
                if (tempScaleTo.equalsIgnoreCase("f")) {
                    fahrenheit = celsius * 9/5.0 + 32;
                    System.out.println(degree + " Celsius to Fahrenheit: " + fahrenheit);
                } else if (tempScaleTo.equalsIgnoreCase("k")) {
                    kelvin = celsius + 273.15;
                    System.out.println(degree + " Celsius to Kelvin: " + kelvin);
                } else {
                    System.out.println("Celsius to Celsius: Invalid");
                }
            }
            System.out.print("Do you want to exit the program (Yes or No): ");
            yesNo = input.nextLine();
            while (!(yesNo.equalsIgnoreCase("yes") || yesNo.equalsIgnoreCase("no"))) {  // This could call a method instead?
                System.out.print("Please enter a valid answer(Yes or No): ");
                yesNo = input.nextLine();
            }   // Checks if it's the right input
            System.out.println("Program is restarting... ");
            System.out.println("");
        } while(yesNo.equalsIgnoreCase("no") || !(yesNo.equalsIgnoreCase("yes")));
        System.out.println("Program is shutting down... ");
        System.out.println("");
        input.close();
    }

    // This method is being run when i call "getValueFromInput"
    public static String getValueFromInput(String label, Scanner inputLocal) {
        System.out.print(label);
        return inputLocal.nextLine();
    }
}












//do {      // old code. Instead of While loop
//    System.out.println("Please enter a valid scale( K or F ): ");
//    tempScale = input.nextLine();
// } while (!(tempScale.equalsIgnoreCase("K") || tempScale.equalsIgnoreCase("F")));

/*
Dojo Session 1 - 2020-09-04

Goal of the Session: Our goal is to create a program to convert between temperature scales (Celsius, Fahrenheit and Kelvin).

Level 1 - Exploring the basics
Your program should ask the user to provide a temperature value in Celsius.
After reading the temperature value, the program should ask the user which scale they want to convert the temperature to.
Users can type “F” for Fahrenheit and “K” for Kelvin.
Your program should then convert the Celsius temperature to the scale provided by the user.

The conversion formulas are:
TF = (TC * 9 / 5) + 32
TK = TC + 273.15
Where:
TC: Temperature in Celsius;
TF: Temperature in Fahrenheit;
TK: Temperature in Kelvin.

If the user provides an invalid scale, your program should show them the message: “Invalid scale, please type K or F.”.


Level 2 - Modifying your program
So far, your program only reads one temperature.
Modify your program to allow users to convert temperatures several times.
After reading a celsius temperature at least once, your program should ask the user if they want to continue converting temperatures.
If the user types yes, you should repeat the conversion steps. If they type “No”, your program should finish.


Level 3 - An advanced challenge
For a Challenge, modify your program to allow users to convert between any temperature by:
1. Providing a temperature scale (F, K or C);
2. Providing a temperature value; and
3. Provide the target scale. zoom
 */