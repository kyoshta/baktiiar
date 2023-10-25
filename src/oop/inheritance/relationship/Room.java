package oop.inheritance.relationship;

public class Room {
    private String nameOfRoom;
    private double area;
    public Room(){

    }



    public String getNameOfRoom() {
        return nameOfRoom;
    }

    public void setNameOfRoom(String nameOfRoom) {
        this.nameOfRoom = nameOfRoom;
    }

    public double getArea() {
        return area;
    }


    public double resultOfArea(double width, double length){
         this.area = width * length;
        return area;
    }

    @Override
    public String toString() {
        return "Room{" +
                "nameOfRoom='" + nameOfRoom + '\'' +
                ", area=" + area +
                '}';
    }
}
