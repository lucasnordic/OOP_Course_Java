package LecturesGomes.lecture1_0902;

import java.util.Scanner;

public class AgeCalculator { 
    
    public static void main(String[] args){
        
    	
    	// Ask their user for their birth year
    	// Show their age based on the current year.
    	
    	//input: Scanner
    	// variables: birth year, current year, age.
    	// printing:
    	
    	//Part 1: Ask user.
    	Scanner input = new Scanner(System.in);
    	
    	System.out.print("Please, type your birth year: " );        
    	int birthYear = input.nextInt();
    	
    	//Part 2: calculate age
    	// ask the user for current year.
    	// print plz enter the current year.
    	System.out.print("Please type the current year: ");
    	int currentYear = input.nextInt();

    	
    	int age = currentYear - birthYear;
    	
    	//Part 3: Show the age.
    	System.out.println(" Your age is: " + age);
        
    	input.close();
        
    }
}