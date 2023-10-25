package oop.interface1.cook;

import oop.interface1.cook.Cook;

public class Person implements Cook {
    public String name;
    protected int age;
    boolean isChief;

    public Person(String name, int age, boolean isChief) {
        this.name = name;
        this.age = age;
        this.isChief = isChief;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isChief=" + isChief +
                '}';
    }

    @Override
    public String cookSushi() {
        return "phila";
    }

    @Override
    public String cookFastFood(String nameFood) {
        return Cook.super.cookFastFood(nameFood);
    }

    @Override
    public String cookFastFood() {
        return "hamburger";
    }

}
