package oop.inheritance;

public class Son extends Dad{

    public Son(String name, int age, String eyeColor, boolean mole) {
        super(name, age, eyeColor, mole);
    }

    public Son(String name, int age) {
        super(name, age);
    }

    @Override
    public String toDance() {
        return "brake dance";
    }

    @Override
    public String toString() {
        return "Son{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", eyeColor='" + eyeColor + '\'' +
                ", mole='" + isMole() + '\'' +

                '}';
    }
}
