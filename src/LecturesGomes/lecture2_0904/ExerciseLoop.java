package LecturesGomes.lecture2_0904;

import java.util.Scanner;

public class ExerciseLoop {

	/* The specification
	 * For three different students:
	 * 1. Read the name of student from the console
	 * 2. Read student’s points (between 0 – 100)
	 * 3. Print the student’s course grade. The course grades are:
	 * U = between 0 and 49,
	 * G = between 50 and 84,
	 * VG = between 85 and 100.
	*/
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//iteration
		//control = control + 1; control++; control += 3
		for(int control = 0; control < 5 ; control++ ) {
			
			System.out.println("Control: " + control);
			
		}
		
		
		
		
		
		
		
		/*
		System.out.println("Please type the student's name: ");
		String studentName = input.nextLine(); // declaring the variable, assign, input		
		
		System.out.println("Type the score: ");
		double studentScore = input.nextDouble(); 
		
		System.out.println("Name: " + studentName + " Score: " + studentScore); //printing in Java		
		
		// U, G or VG?
		String courseGrade;		
		if( studentScore >= 0 && studentScore <= 49) {
			//System.out.println("Your grade is U.");
			courseGrade = "U";
			
		}else if(studentScore >= 50 && studentScore <= 84 ) { 
			//System.out.println("Your grade is a G.");
			courseGrade = "G";
				
		}else if(studentScore >= 85 && studentScore <= 100) {
			courseGrade = "VG";			
		
		}else {
			courseGrade = "Invalid score";
		}
		
		System.out.println("Your grade is: " + courseGrade);*/

		input.close();		
	}
}
