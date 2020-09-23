package E01_VariablesExpressions;/*
(Sum the digits in an integer) Write a program that reads an integer between 0 and
1000 and adds all the digits in an integer.
For example, if an integer is 932 , the sum of all its digits is 14 .

Hint: Use the % operator to extract digits, and use the / operator to remove the
extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93 .

Here is a sample run:
Enter a number between 0 and 1000: 999
The sum of the digits is 27
 */

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter a number between 0 and 1000: ");
        int number = input.nextInt();
        input.nextLine();

        int one = number / 100;
        int two = (number % 100) / 10;
        int three = (number-(one*100)) % 10;       // 759-(7*100)
        int sum = one + two + three;

        System.out.println("The sum of the digits is " + sum);

    }
}
