package LecturesGomes;

import java.util.Scanner;

public class HealthAppBefore {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//Risky.
		double[] allWeights = new double[5];
		double[] allHeights = new double[5];
		String[] bmiCategories = new String[5]; 		
		
		for(int i = 0; i < 5; i++) {			
			System.out.print("Type the weight of Person n."+ (i+1) + ": ");
			allWeights[i] = input.nextDouble();
			input.nextLine();
			
			System.out.print("Type the height of Person n."+ (i+1) + ": ");
			allHeights[i] = input.nextDouble();
			input.nextLine();			
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
