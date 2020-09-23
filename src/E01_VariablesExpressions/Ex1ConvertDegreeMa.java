package E01_VariablesExpressions;

import java.util.Scanner;

public class Ex1ConvertDegreeMa {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String answer = "";
        do {
            System.out.println ("Would you like to convert temperature?(Y/N):");
            answer = input.nextLine();
            if(answer.equalsIgnoreCase("Y")) {
                System.out.println("Insert the temperature in celsius:");
                double celsius = input.nextDouble();
                input.nextLine();
                System.out.println("To show the temperature in Kelvin press 'K' and to show it in Fahrenheit press 'F':");
                String temperature = input.nextLine();
                if(temperature.equalsIgnoreCase("K")) {
                    double kelvin = celsius+273.15;
                    System.out.println("The temperature is "+kelvin+" Kelvin");
                }else if(temperature.equalsIgnoreCase("F")) {
                    double fahrenheit = (9.0 / 5) * celsius + 32;
                    System.out.println("The temperature is "+fahrenheit+" Fahrenheit");
                }
            } else if(!(answer.equalsIgnoreCase("Y") | (answer.equalsIgnoreCase("N"))))  {
                System.out.println("Insert a valid answer");
            }
        }  while(!answer.equalsIgnoreCase("N"));
        input.close();
    }
}
