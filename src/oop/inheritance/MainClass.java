package oop.inheritance;

public class MainClass {
    public static void main(String[] args) {
        Dad john = new Dad("John", 59, "brown", true);
        Dad chris = new Dad("Chris", 73);
        System.out.println(chris.getAge());
        System.out.println(chris);
        System.out.println(john.toDance());


        Son blake = new Son("Blake", 27, "blue", true);
        Son clark = new Son("Clark", 23);
        System.out.println(clark.getAge());
        System.out.println(blake);
        System.out.println(blake.toDance());
        blake.setMole(false);
        System.out.println(blake);

        GrandSon david = new GrandSon("David", 4, "blue", true);
        System.out.println(david.toDance());
        System.out.println(david);

        Dad will = new Son("Will", 25, "black", false);
        System.out.println(will.toDance());

        Son justin = new Son("Justin", 36, "brown", false);
        System.out.println(justin);


    }
}
