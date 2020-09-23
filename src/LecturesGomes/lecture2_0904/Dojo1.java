package LecturesGomes.lecture2_0904;

import java.util.Scanner; //what now?

public class Dojo1 {

	// Your program should ask the user to provide a temperature value in Celsius.
	// After reading the temperature value, the program should ask the user which
	// scale they want to convert the temperature to. Users can type “F” for
	// Farenheit and “K” for Kelvin. Your program should then convert the Celsius
	// temperature to the scale provided by the user. The conversion formulas are:
	
	public static void main(String[] args) {
		//Creating the scanner.
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter temperature in celsius: ");
		double temperatureCelsius = input.nextDouble();
		input.nextLine(); //why? explain a bit please. =)
	}
	
}
