package oop.encapsulation;

public class Actor {
    public String name;
    public String movie;
    private int age;

    public Actor(String name, String movie, int age) {
        this.name = name;
        this.movie = movie;
        this.age = age;
    }
    public String toPlayRole(){
        return "acting...";

    }
}
