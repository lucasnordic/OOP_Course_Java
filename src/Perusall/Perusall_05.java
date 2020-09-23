package Perusall;
public class Perusall_05 {
    public static void main(String[] args) {

        AcousticGuitar testOne = new AcousticGuitar();
        System.out.println(testOne.brand + " " + testOne.isItAvailable + " " + testOne.bumOfPurchases);

        GoodDog dogOne = new GoodDog();
        dogOne.setSize(70);
        System.out.println("Dog one: " + dogOne.getSize());
        dogOne.bark();

        GoodDog[] pets;
        pets = new GoodDog[7];

        pets[0] = new GoodDog();

        pets[0].setSize(30);
        int x = pets[0].getSize();

        int height;
        int width;
    }

}

class GoodDog {

    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int s) {
        size = s;
    }

    void bark() {
        if (size > 60) {
            System.out.println("Woof! Woof!");
        } else if (size > 14) {
            System.out.println("Ruff! Ruff!");
        } else {
            System.out.println("Yip! Yip!");
        }
    }
}

class AcousticGuitar {

    String brand;
    int bumOfPurchases;
    boolean isItAvailable;

    String getBrand() {
        return brand = "Gibson";
    }

    void setBrand(String aBrand) {
        brand = aBrand;
    }

    int getBumOfPurchases() {
        return bumOfPurchases;
    }

    void setBumOfPurchases(int num) {
        bumOfPurchases = num;
    }

    boolean getisItAvailable(boolean yesOrNo) {
        isItAvailable = yesOrNo;
        return yesOrNo;
    }

}

class XCopy {
    static int a;
    static int b = 12;
    public static void main(String[] args) {
        int foo = 7;
        int bar = 3;
        XCopy.takeTwo(foo, bar);
        System.out.println(foo + " " + bar);

        int total = a + b;
        System.out.println(total);

        String[] test = {"gaga"};
        System.out.println(test[0]);
        fillString(test);
        System.out.println(test[0] + " " + test[0]);

        byte aa = (byte) calcArea(2,13);
        System.out.println(aa);

    }
    public static int calcArea(int height, int width) {
        return height * width;
    }

    public static void fillString(String[] text) {
        text[0] = "hello";
    }

    public static void takeTwo(int z, int yyy) {
        int sum = z + yyy;
        System.out.println(z + " " + sum + " " + yyy);
    }

    public static void takeThree(String ding) {
        System.out.println(ding);
    }

}
