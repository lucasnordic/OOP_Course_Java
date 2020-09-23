package Dojo;

import java.util.Scanner;

public class ExerciseE43 {

    // * Read 5 grades. 0 - 10
    // * Calculate the mean between all grades.
    // * Print the smallest and highest grade.
    // Reason for array and not 5 variables:
    // Size of the code, readability.
    // Because of the mean calculation.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] grades = new int[5];
        // int gradeHighest = 0;
        // int gradeLowest = 0;

        for ( int i = 0; i < grades.length; i++) {
            System.out.print("Type a grade: ");
            grades[i] = input.nextInt();
            input.nextLine();
        }

        for ( int i = grades.length -1; i >= 0; i--) {
            System.out.println( grades[i] + " ");
        }
        System.out.println();

        int sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum = sum + grades[i];
        }
        double mean = ((double)sum) / ((double)grades.length);      // to make sure it's double.
        System.out.println("The sum is: " + sum);
        System.out.println("The mean is: " + mean);

        System.out.println("The lowest grade is: ");
        System.out.println("The highest grade is: ");

        input.close();
    }
}
