package E01_VariablesExpressions;

import java.util.Scanner;

public class Ex2Gratuity {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the subtotal: ");
        double subTotal = input.nextDouble();

        System.out.print("Enter the gratuity rate(in %): ");
        double gratuityRate = input.nextDouble();

        double gratuity = subTotal * gratuityRate / 100;
        double total = subTotal + gratuity;

        System.out.println("The gratuity is $" + gratuity + " and total is" + " $" + total);
    }
}
