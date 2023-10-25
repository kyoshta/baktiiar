package oop.inheritance.cars;

public class Passengers {
    public String name;
    private int age;
    // boolean payment;

    public Passengers(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Passengers{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
