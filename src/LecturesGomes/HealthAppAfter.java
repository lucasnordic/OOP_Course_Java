package LecturesGomes;

import java.util.Scanner;

public class HealthAppAfter {

	// global (be cautious)
	// public static Scanner input = new Scanner(System.in);


	public static double readDouble (String messageToUser) {
		Scanner input = new Scanner(System.in);
		System.out.println( messageToUser );
		double decimalValue = input.nextDouble();
		input.nextLine();
		input.close();
		return decimalValue;
	}	// reads any double. Self contained is best solution. Not most memory safe?

	public static String readLine(String messageToUser ) {
		Scanner input = new Scanner(System.in);

		System.out.println( messageToUser );
		String sentence = input.nextLine();
		return sentence;
	}	// Reads string input.

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//Risky.
		double[] allWeights = new double[5];
		double[] allHeights = new double[5];
		String[] allNames = new String[5];
		String[] bmiCategories = new String[5]; 		
		
		for(int i = 0; i < 5; i++) {
			allWeights[i] = readDouble("Type the weight of Person n."+ (i+1) + ": ");
			allHeights[i] = readDouble("Type the weight of Person n."+ (i+1) + ": ");
			allNames[i] = readLine("Type your name: ");
		}
		
		double meanHeight = 0.0;
		for(int i = 0; i < allHeights.length; i++) {
			meanHeight = meanHeight + allHeights[i];
		}
		meanHeight = meanHeight / allHeights.length;
		
		double meanWeight = 0.0;
		for(int i = 0; i < allWeights.length; i++) {
			meanWeight = meanWeight + allWeights[i];
		}
		meanWeight = meanWeight / allWeights.length;

		for(int i = 0; i < allHeights.length; i++) {
			double currentHeight = allHeights[i];
			double currentWeight = allWeights[i]; 
			double bmi = currentWeight / (currentHeight * currentHeight);
			String classification = "";
			if(bmi < 18.5) {
				classification = "Underweight";
			}else if(bmi>=18.5 && bmi < 25) { //Check at home and reflect. Do you need bmi >= 18.5.
				classification = "Normal weight";
			}else if(bmi < 30) {
				classification = "Overweight";
			}else if(bmi > 30){
				classification = "Obese";
			}else {
				classification = "Invalid BMI";
			}
			
			bmiCategories[i] = classification;
		}
		
		System.out.println("The mean weight is: "+meanWeight);
		System.out.println("The mean height is: "+meanHeight);
		System.out.println("BMI Categories of all individuals: ");
		for (int i = 0; i < bmiCategories.length; i++) {
			System.out.println((i + 1) + ": " + bmiCategories[i]);
		}
		
		input.close();
	}
}
