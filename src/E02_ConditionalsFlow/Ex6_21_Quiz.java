package E02_ConditionalsFlow;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

//

public class Ex6_21_Quiz {
    public static void main(String[] args) {
        Quiz startQuiz = new Quiz("", "");
        startQuiz.quiz("Are you ready for a quiz? (y/n)",
                "Q1) What is the capital of Albania?\n" +
                        "\t1) Tirana\n" +
                        "\t2) Sofia\n" +
                        "\t3) Budapest \n"
        );

        startQuiz.quiz("Q2) Can you store the value \"dog\" in a variable of type int?\n",
                "\t1) no\n" +
                "\t2) yes\n"
        );

        startQuiz.quiz("Q3) What is the result of 6+4/2?\n",
                "\t1) 8\n" +
                "\t2) 5\n" +
                "\t3) 4\n"
        );
    }
}

class Quiz {
    private static final Scanner input = new Scanner(System.in);
    private int rightAnsCount;
    private String firstText;
    private String secondText;
    private String rightText;
    private String wrongText;
    private String answer;

    Quiz(String firstText, String secondText) {
        this.rightAnsCount = 0;
        this.firstText = firstText;
        this.secondText = "";
        answer = "";
    }

    public void quiz(String firstText, String secondText) {
        System.out.print(firstText);
        answer = input.nextLine();
        if( answer.equalsIgnoreCase("y")) {
            System.out.println("Okey, here it comes!\n");
            //Thread.sleep(1000);
            System.out.println(secondText);
            input.nextLine();
        } else if (answer.equalsIgnoreCase("1")) {
            System.out.println("\nThat's right!\n");
            rightAnsCount++;
        } else {
            System.out.println("Rip");
            //System.out;
        }
    }

//    Quiz() {
//        rightAnswers = 0;
//    }


}


/*
Problem 1 (Interactive quiz)
Write an interactive quiz.
It should ask the user three multiple-choice or true/false questions about something.
It must keep track of how many they get right, and print out a "score" at the end.

Sample:
Are you ready for a quiz? Y
Okay, here it comes!

Q1) What is the capital of Albania?
	1) Sofia
	2) Tirana
	3) Budapest
2

That's right!

Q2) Can you store the value "dog" in a variable of type int?
	1) yes
	2) no
1

Sorry, "dog" is a string. ints can only store numbers.

Q3) What is the result of 6+4/2?
	1) 5
	2) 8
	3) 4
2

That's correct!


Thanks for playing!

 */