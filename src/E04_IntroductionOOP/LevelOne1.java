package E04_IntroductionOOP;

public class LevelOne1 {
    public static void main(String[] args){
        Car car1 = new Car("Volvo", 210.50, "Pink");
        Car car2 = new Car("Ferrari", 550.00, "Red");
        Car car3 = new Car("Peugeot", 50.00, "Baby Blue" );

        System.out.println(" ");
        System.out.println(car1);
        System.out.println(" ");

        Car franciscoCar = car1;
        Car beyonceCar = car2;

        System.out.println("Using .equals");
        System.out.println( car1.equals(car1)); // false
        System.out.println( car1.equals( null ));
        System.out.println(" ");

        System.out.println("Using == ");
        System.out.println( car1 == car1);
    }
}

class Car {
    private String modelName;
    private double dailyPrice;
    private String color;

    public Car(String modelName, double dailyPrice, String color) {
        this.modelName = modelName;
        this.dailyPrice = dailyPrice;
        this.color = color;
    }

    public String getModelName() {
        return modelName;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "The " + color +
                " " + modelName +
                ", costs " + dailyPrice +
                " SEKs per day.";
    }

    public boolean equals(Object otherObject) {
        // 4 cases.
        if ( otherObject == this ) {
            return true;
        } else if(otherObject == null) {
            return false;
        } else if(!(otherObject instanceof Car)) {
            return false;
        } else {    // cast?
            Car anotherCar = (Car) otherObject;     // Converting otherObject to "Car"
            boolean isCar =
                    this.modelName.equals(anotherCar.getModelName()) &&
                            this.color.equals(anotherCar.getColor());
            return isCar;
        }
    }
}

/*
// Can you use conditional statements inside the toString method?

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
    public void setDailyPrice(double dailyPrice) {
        this.dailyPrice = dailyPrice;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public double calculateRent(int days) {
        return (days * dailyPrice);
    }


    public double getDailyPrice() {
        return dailyPrice;
    }

 */