package E02_ConditionalsFlow;
import java.util.Scanner;
public class Ex4_IsDivisable {
    public static void main(String[] args) {
        Dividation newDivision = new Dividation();
        newDivision.setIntegers();
        newDivision.getDivisable();
    }
}
class Dividation {
    private static final Scanner input = new Scanner(System.in);
    private int x;
    private int y;
    private int n;

    public Dividation() {
        this.x = 0;
        this.y = 0;
        this.n = 0;
    }
    public void setIntegers() {
        System.out.print("Enter a number and check if it is divisable by two other numbers: ");
        n = input.nextInt();
        input.nextLine();
        System.out.print("Enter a second number: ");
        x = input.nextInt();
        input.nextLine();
        System.out.print("Enter a number: ");
        y = input.nextInt();
        input.nextLine();
    }
    public void getDivisable() {
        if ( n % x == 0 && n % y == 0) {
            System.out.format("true because %d is divisible by %d and %d.%n",n,x,y);
        } else if (n % x != 0 && n % y != 0){
            System.out.format("false because %d is not divisible by neither %d nor %d.%n",n,x,y);
        } else if ( n % x != 0 ) {
            System.out.format("false because %d is not divisible by %d.%n",n,x);
        } else if ( n % y != 0 ) {
            System.out.format("false because %d is not divisible by %d.%n",n,y);
        }
    }
}