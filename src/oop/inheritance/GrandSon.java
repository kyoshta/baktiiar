package oop.inheritance;

public class GrandSon extends Son{
    public GrandSon(String name, int age, String eyeColor, boolean mole) {
        super(name, age, eyeColor, mole);
    }

    @Override
    public String toDance() {
        return "tik tok";

    }

    @Override
    public String toString() {
        return "Grandson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", eyeColor='" + eyeColor + '\'' +
                ", mole='" + isMole() + '\'' +

                '}';
    }
}
