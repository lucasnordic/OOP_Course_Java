package Perusall;

public class Perusall03 {
    public static void main(String[] args) {
        int[] anArray;
        anArray = new int[5];

        anArray[0] = 100;

        System.out.println("Test: " + anArray[0]);

        int[][] multDimArray =new int[2][3];
        multDimArray[0][0] = 14;
        multDimArray[0][1] = 96;
        multDimArray[0][2] = 908;
        multDimArray[1][0] = 33;
        multDimArray[1][1] = 17;
        multDimArray[1][2] = -15;

        for (int[] ints : multDimArray) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
        }
    }
}
        /* R1-Q1:As an exercise, write the code that stores 5 favourite movies of a user.
        Askthe user to type the name of their five favourite movies.
        After reading all favouritemovies, print all of them. Use an array to store it.
        R1-Q2Change  your  program  R1-Q1  to  store  any  number  of  favourite  movies.
                Being by asking the user how many movies they want to type.
                Then ask the userto type each movie title. After reading all favourite movies, print all of them.
                •R1-Q3:Write a program that asks the users the size of the array.  A
                fter that, askthe user to type each number in the array.
                Your program should then (i) find thehighest number in an array,
                (ii) calculate the sum of the elements in an array,
                and(iii) calculate the mean of the elements in an array. */