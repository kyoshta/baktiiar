package oop.inheritance;

public class Dad {
    public String name;
    protected int age;
    String eyeColor;
    private boolean mole;

    public Dad(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dad(String name, int age, String eyeColor, boolean mole) {
        this.name = name;
        this.age = age;
        this.eyeColor = eyeColor;
        this.mole = mole;
    }

    public int getAge() {
        return age;
    }

    public boolean isMole() {
        return mole;
    }

    public void setMole(boolean mole) {
        this.mole = mole;
    }

    public String toDance(){
        return "dance dance";
    }
    public String toDraw(){
        return "painting";
    }

    @Override
    public String toString() {
        return "Dad{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", eyeColor='" + eyeColor + '\'' +
                ", mole=" + mole +
                '}';
    }
}
