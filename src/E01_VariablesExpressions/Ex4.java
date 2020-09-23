/*
(Cost of driving) Write a program that prompts the user to enter the distance to drive,
the fuel efficiency of the car in miles per gallon, and the price per gallon, and displays the cost of the trip.

Here is a sample run:
Enter the driving distance: 900.5
Enter miles per gallon: 25.5
Enter price per gallon: 3.55
The cost of driving is $125.36

 */
package E01_VariablesExpressions;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter how far you will be driving in Km: ");
        double driveDist = input.nextDouble();

        System.out.print("Enter Kilometers per litre: ");
        double kmLitre = input.nextDouble();

        System.out.print("Enter the price per litre: ");
        double priceLitre = input.nextDouble();

        double drivingCost = (driveDist/kmLitre) * priceLitre;
        System.out.println("The cost of driving is " + drivingCost + ":-" );
    }
}
