package oop.encapsulation;

public class Car {
    public String model;
    public String type;
    public int year;
    public int volume;
    public int budget;
    public int petrol;

    public Car(String model, String type, int year, int volume, int budget, int petrol) {
        this.model = model;
        this.type = type;
        this.year = year;
        this.volume = volume;
        this.budget = budget;
        this.petrol = petrol;
    }

    public String drive(){
        return "here we go!";
    }
}
