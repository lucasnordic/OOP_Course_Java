/*
(Process a string) Write a program that prompts the user to enter a string and displays its length and its first character.
 */

package E01_VariablesExpressions;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a word: ");
        String word = input.nextLine();
        System.out.print("The length of your word is: " + word.length() + " characters.");
    }
}
