package oop.class_objects;

public class BookMain {
    public static void main(String[] args) {
        Book oppenheimer = new Book();
        oppenheimer.name = "Oppenheimer";
        oppenheimer.author = "R. Oppenheimer";
        oppenheimer.cost = 450;
        oppenheimer.year = 1950;
        oppenheimer.pages = 377;

        for (int i = 0; i < oppenheimer.name.length(); i++){
            System.out.print(oppenheimer.name.charAt(i));

        }

    }
}
