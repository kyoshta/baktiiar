package oop.interface1.travel;

public class American extends Person implements Embassy, TravelAgency{
    public American(String name, int age, String citizenship) {
        super(name, age, citizenship);
    }

    @Override
    public String visa() {
        return null;
    }

    @Override
    public String tour() {
        return null;
    }
}
