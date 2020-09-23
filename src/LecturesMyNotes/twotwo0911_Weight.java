/*
• Read the weight and height of 5 individuals.
• Calculate the mean weight of the sampled individuals.
• Calculate the mean height of the sampled individuals.
• Calculate the Body Mass Index (BMI) and classify the individuals as underweight, healthy, overweight or obese.
• Print the results of both means and the BMI of each individual.
*/

package LecturesMyNotes;

import java.util.Scanner;

public class twotwo0911_Weight {

    public static double readDouble(Scanner scanner, String messageToUser) {
            System.out.print( messageToUser );
            double decimalValue = scanner.nextDouble();
            scanner.nextLine();

            return decimalValue;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // risky? VVVV
        double[] allWeights = new double[5];
        double[] allHeights = new double[5];
        double[] bmiCategories = new double[5];

        for (int i = 0; i < allHeights.length; i++) {
            allWeights[i] = readDouble( input, "Type the weight of Person n."+ (i+1) + ": ");
            allHeights[i] = readDouble( input, "Type the weight of Person n."+ (i+1) + ": ");
        }

        double meanHeight = 0.0;
        for (int i = 0; i < allWeights.length; i++) {
            System.out.println();
        }

        for(int i = 0; i < allHeights.length; i++) {
            double currentHeight = allHeights[i];
            double currentWeight = allWeights[i];
            double bmi = currentWeight / (currentHeight * currentHeight);
            String classification = "";

            if(bmi < 18.5) {
                classification = "Underweight";
            } else if(bmi >= 18.5 && bmi < 25) {                  // do we need to do this?
                classification = "Normal weight";
            } else if(bmi < 30) {
                classification = "Overweight";
            } else if(bmi > 30){
                classification = "Obese";
            } else {
                classification = "Invalid BMI";
            }
        // bmiCategories[i] = classification;
}


        System.out.println("What is your name: ");
        System.out.println("What is your weight: ");
        System.out.println("What is your height: ");

        // array for each individual
        // separate arrays for height and weight.
    }
}
