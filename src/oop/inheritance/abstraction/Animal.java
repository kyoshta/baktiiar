package oop.inheritance.abstraction;

public abstract class Animal {
    public String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void voice();
    public void run(){
        System.out.println("run");
    }


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", family='" + age + '\'' +
                '}';
    }
}
