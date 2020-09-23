package E02_ConditionalsFlow;
import java.util.Scanner;

public class Ex5RideyBoy {
    public static void main(String[] args) {
        Scooter Voi = new Scooter();
    }
}

class Scooter {
    private static final Scanner input = new Scanner(System.in);
    private int travelDist;
    private boolean chargingDone;
    private String membership;
    private int cost;

    Scooter() {
        this.travelDist = 10;
        this.chargingDone = true;
        this.membership = "";
        this.cost = 0;
    }

    public void getRideCost() {
        System.out.format("calculateRide(%d,%b,%s)%n",travelDist,chargingDone,membership);

        // Distance:
//        if (travelDist < 5) {
//
//        } else if () {
//
//        }

        // Charging:


        // Membership:


    }

}