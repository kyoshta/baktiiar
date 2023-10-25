package oop.inheritance.cars;

public class Car {
    public String brand;
    protected String model;
    String color;
    private int yp;
    Passengers passenger;


    public Car(String brand, String model, String color, int yp, Passengers passenger) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.yp = yp;
        this.passenger = passenger;
    }

    public int getYp() {
        return yp;
    }

    public String toDrive(boolean press) {
        if (press == true){
            return "vroom vroom";
        }
        return "won't drive";
    }
    public String toBrake(boolean press){
        if (press == true){
            return "brake...";
        }
        return "won't stop";
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", yp=" + yp +
                ", passenger=" + passenger +
                "\nPassengers{" +
                "name='" + passenger.name + '\'' +
                ", age=" + passenger.getAge() +
                '}';
    }
}

