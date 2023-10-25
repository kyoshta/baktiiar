package oop.inheritance.relationship;

public class PersonMain {
    public static void main(String[] args) {
        Job job = new Job();
        Person ali = new Person();
        System.out.println(ali);
        System.out.println(ali.toDisplayTheName());
        System.out.println(ali.toDisplayTheSalary());
        ali.toTest();
        System.out.println(ali);
    }
}
