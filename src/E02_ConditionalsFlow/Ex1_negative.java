/*
makeNegative: In this simple assignment you are given a number and you have to make it negative.
Note that the input can also be negative.

Sample:
makeNegative(6)   → - 6
makeNegative(10)  → - 10
makeNegative(-22) → - 22
 */
package E02_ConditionalsFlow;

import java.util.Scanner;

public class Ex1_negative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a negative number: ");
        int number = input.nextInt();
        input.nextLine();

        if ( number < 0) {
            System.out.println("makeNegative(" + number + ") -> " + number);
        } else {
            int number2 = -number;
            System.out.println("makeNegative(" + number + ") -> " + number2);
        }


    }
}
