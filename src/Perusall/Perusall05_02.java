package Perusall;

public class Perusall05_02 {
    public static void main(String[] args) {
        Person worker = new Person();

        worker.name = "Harvey Dodo";
        worker.birthYear = 1992;
        worker.nationality = "Sweden";

        Person teacher;
        teacher = new Person(
                "Bengt",
                1992,
                "Sweden"
        );
        System.out.println(teacher);

        teacher = worker;
        System.out.println(teacher);

        Person student = new Person();

        Person bengt;
        bengt = new Person();

    }
}

class Table {

}

class Person {
    String name;
    int birthYear;
    String nationality;

    public Person() {

    }

    public Person(String name, int birthYear, String nationality) {
        this.name = name;
        this.birthYear = birthYear;
        this.nationality = nationality;
    }

    public String toString() {
        return this.name;
    }

    public int getAge() {
        int currentYear = 2020;
        return currentYear - birthYear;
    }
}