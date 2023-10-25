package oop.class_objects;

public class Dog {

    // Instance variables / fields
    public String name = "Rex";
    public int age = 3;
    public String color = "black";
    public String bread = "taksa";

    public String eat() {
        return "Omnom nom! Yummy!";
    }

    public String bark() {
        return "Gav-gav";
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", bread='" + bread + '\'' +
                '}';
    }

    public String sleep() {
        return "Zzz";

    }
}

