package oop.inheritance.abstraction;

public class Lion extends FelineFamily{
    public Lion(String name, int age, String type) {
        super(name, age, type);
    }

    @Override
    public void voice() {
        super.voice();
    }

    @Override
    public void run() {
        super.run();
    }
}
