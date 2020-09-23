package LecturesGomes.lecture3_0909;

import java.util.Scanner;

public class ExerciseE43 {

	/*
	 * Read 5 grades ( values between 0 and 10)
	 * Calculate the mean between all grades.
	 * Print the smallest and highest grade ((at home)
	 
	 Constructs: Input (Scanner), Array (why?), 3 variables
		
	*/
	
	public static void main(String[] args) {
		
		// Why arrays and not 5 variables?
		//Reason 1: size of the code, readability.		
		//Reason 2: Because of the mean calculation
		Scanner input = new Scanner(System.in);
		
		int[] grades = new int[3];
		
		//index++ == index = index + 1 == index += 1 
		//modularity and reuse.
		for( int index = 0; index <  grades.length ; index++ ) {
			System.out.print("Type a grade: ");
			grades[ index ] = input.nextInt();
			input.nextLine();			
		}
		

		for(int i = grades.length -1 ; i >= 0; i--) {
			System.out.print( grades[i] + " ");			
		}
		System.out.println();
		
		for(int i = 0; i < grades.length; i++) {
			System.out.print( grades[i] + " ");			
		}
		System.out.println();
		
		int sum = 0; //resets.
		for(int i = 0; i < grades.length ; i++) {			
			sum = sum + grades[i];
		}
		double mean = ((double) sum) / ((double) grades.length); //Cast the types!!!!
		
		//mean value.
		System.out.println("The sum is " + sum);
		System.out.println("The mean is " + mean);

		
		/*
		System.out.println("Type a grade: ");
		grades[0] = input.nextInt();
		input.nextLine();
		
		System.out.println("Type a grade: ");
		grades[1] = input.nextInt();
		input.nextLine();

		System.out.println("Type a grade: ");
		grades[2] = input.nextInt();
		input.nextLine();

		System.out.println("Type a grade: ");
		grades[3] = input.nextInt();
		input.nextLine();

		System.out.println("Type a grade: ");
		grades[4] = input.nextInt();
		input.nextLine();		
		
		System.out.print(grades[0]+ " ");
		System.out.print(grades[1]+ " ");
		System.out.print(grades[2]+ " ");
		System.out.print(grades[3]+ " ");
		System.out.println(grades[4]);
		*/

		
	}
	
}
