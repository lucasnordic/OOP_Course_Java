/*
thirdLength: You are given two angles (in degrees) of a triangle.
Write a function to return the 3rd.
Note: Sum of angles of a triangle = 180.

Sample:
thirdLength(45,45)  →  90
thirdLength(60,60)  →  60
thirdLength(54,42)  →  84
 */
package E02_ConditionalsFlow;

import java.util.Scanner;

public class Ex2_twoAngles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first angle: ");
        int angleOne = input.nextInt();
        input.nextLine();
        System.out.print("Enter second angle: ");
        int angleTwo = input.nextInt();
        input.nextLine();

        System.out.println("thirdAngle(" + angleOne + "," + angleTwo + ") -> " + calculateThirdAngle(angleOne, angleTwo));
    }

    public static int calculateThirdAngle (int angleOne, int angleTwo) {
        int sumOfAngles = 180;
        int thirdAngle = sumOfAngles - (angleOne + angleTwo);
        return thirdAngle;
    }


}
