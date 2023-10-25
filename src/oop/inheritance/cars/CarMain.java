package oop.inheritance.cars;

public class CarMain {
    public static void main(String[] args) {
        Passengers jim = new Passengers("Jim", 26);

        Car merc = new Car("mercedes", "221", "black", 2023, jim);
        System.out.println(merc);
    }
}
