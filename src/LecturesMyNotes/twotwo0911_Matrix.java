/*
    Given a matrix arxc, it creates another matrix brx1 with one column. // Assuming that there is a matrix
    Each row, in this single column, has the sum of all values in the
    corresponding row of Arxc. For instance:

    input:
    1 2 3
    4 5 6
    7 8 9

    output:
    6
    15
    24
*/
    /*
        int[][] matrixA = new int[3][3];
        matrixA[0][0] = 1;
        matrixA[0][1] = 2;
        matrixA[0][2] = 3;
    */

package LecturesMyNotes;

public class twotwo0911_Matrix {
    public static void main(String[] args) {
        int[][] matrixA = { {1, 2, 3},
                            {4, 5, 6},
                            {7, 8, 9} };
        int[][] matrixB = new int[matrixA.length][1]; // initialize the matrix. In java you automatically assign value. 0 in Java

        for ( int i = 0; i < matrixA.length; i++ ) {      // Itterate the rows, down, v
            int rowSum = 0;
            for( int j = 0; j < matrixA[0].length; j++ ) {   // itterate over columns, right, ->
                rowSum = rowSum + matrixA[i][j];
            }
            System.out.println("");
            matrixB[i][0] = rowSum;
        }
        System.out.println("");
    }
}
