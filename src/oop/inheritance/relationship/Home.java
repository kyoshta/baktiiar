package oop.inheritance.relationship;

public class Home {

    public String address;
    public Room room;

    public Home(String address) {
        this.address = address;
        this.room = new Room();
        room.setNameOfRoom("living room");
        room.resultOfArea(4.5, 5.5);


    }
    public double showTheArea(){
        return room.getArea();

    }
    public String showTheName(){
        return room.getNameOfRoom();

    }

    @Override
    public String toString() {
        return "Home{" +
                "address='" + address + '\'' +
                ", room=" + room +
                '}';
    }
}
