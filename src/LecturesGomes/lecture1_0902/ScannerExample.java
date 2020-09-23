package LecturesGomes.lecture1_0902;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
    	//Part 1: Ask user.
    	Scanner input = new Scanner(System.in);

    	System.out.println("Please type your name: ");
    	//String name = input.nextLine();

    	System.out.print("Please, type your age: " );        
    	//int age = input.nextInt();
    	//input.nextLine(); //variable
    	
     	//Part 3: Show the age.
    	//System.out.println("Hello "+name+" you are "+age+" years old.");
        
    	input.close();
 
	}
}
