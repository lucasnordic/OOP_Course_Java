package E02_ConditionalsFlow;
import java.util.Scanner;

public class Ex3_setAlarm {
    public static void main(String[] args) {
        Alarm newAlarm = new Alarm();
        newAlarm.askUser();
        newAlarm.getAlarm();
    }
}
class Alarm {
    private static final Scanner input = new Scanner(System.in);
    private boolean employed;
    private boolean vacation;
    // constructor
    public Alarm() {
        this.employed = false;
        this.vacation = false;
    }
    public void askUser() {
        System.out.print("Are you employed (y/n): ");
        if (input.nextLine().equalsIgnoreCase("y")) {
            employed = true;
        }
        System.out.print("Are you on vacation (y/n): ");
        if (input.nextLine().equalsIgnoreCase("y")) {
            vacation = true;
        }
    }
    public void getAlarm() {
        if (setAlarm()) {
            System.out.println("Alarm is on");
        } else {
            System.out.println("Your tan is quite magnificent sir");
        }
    }
    private boolean setAlarm() {
        return employed && !vacation;
    }
}