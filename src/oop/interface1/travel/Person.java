package oop.interface1.travel;

public abstract class Person {

    public String name;
    public int age;
    private String citizenship;
    public Person(String name, int age, String citizenship) {
        this.name = name;
        this.age = age;
        this.citizenship = citizenship;
    }
    public Person(){

    }
    public String getCitizenship() {
        return citizenship;
    }
    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", citizenship='" + citizenship + '\'' +
                '}';
    }
}
















