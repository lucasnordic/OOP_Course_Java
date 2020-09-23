package Perusall;

/*
String textInput(String message)
{
    Scanner input =newScanner(System.in);
    System.out.println(message);
    String returnValue = input.nextLine();
    returnreturnValue;
}

public static void main(String[] args) {
    System.out.println("Your name is "+textInput("Please enter your name :"));
}
Output:
Please enter your name :
Francisco Gomes
Your name is Francisco Gomes
 */
//String stringDing = "Lucas";
  //      String dingDong = stringDing;
    //    dingDong = dingDong + " Nordgren";
// int[] array2 = {23, 43, 55, 12, 15, 12, 17, 12, 17, 57};


import java.util.Arrays;

public class Perusall04 {
    public static void main(String[] args) {
        int[] array = {23, 43, 55, 12, 15, 12, 17, 12, 17, 57};
        System.out.println(Arrays.toString(reverse(array)));
    }
    public static int[] reverse(int[] inputArray) {
        int[] reversedArray = inputArray;
        for(int i = 0; i< reversedArray.length / 2; i++){
            int temp = reversedArray[i];
            reversedArray[i] = reversedArray[reversedArray.length - i - 1];         // example. Length is 10
            reversedArray[reversedArray.length -i -1] = temp;
        }
        return reversedArray;
    }
}