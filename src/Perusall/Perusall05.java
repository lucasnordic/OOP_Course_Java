package Perusall;

public class Perusall05 {

    // stores name
    // birthyear
    // nationality of three individuals

    public static void main(String[] args) {
        String[] allNames = new String[3];
        String[] allNationalities = new String[3];
        int[] allBirthYears = new int[3];

        allNames[0] = "Harvey Milk";
        allNationalities[0] = "United States";
        allBirthYears[0] = 1930;

        allNames[1] = "Daisy Loop";
        allNationalities[1] = "Sweden";
        allBirthYears[1] = 1930;

        allNames[0] = "Harvey Milk";
        allNationalities[0] = "United States";
        allBirthYears[0] = 1930;

        int currentYear = 2020;
        for (int i = 0; i < allBirthYears.length; i++) {
            int age = currentYear - allBirthYears[i];
            System.out.println(allNames[i] + " is " + age + " years old.");
        }
    }


}
