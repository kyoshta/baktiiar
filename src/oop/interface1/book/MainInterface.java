package oop.interface1.book;

import java.util.ArrayList;
import java.util.List;

public class MainInterface {
    public static void main(String[] args) {
        Book akKeme = new Book("Ak-keme", "Ch. Aitmatov");
        System.out.println(akKeme.print());
        System.out.println(akKeme.edition(800));
        List<String> list1 = new ArrayList<>();
        Printable pr = new Book("Harry Potter", "J.K. Rowling");
        System.out.println(pr.print());
//        System.out.println(pr.edition()); TABU
    }

}
// extends
// implements

// class Dad
// class Son,
// class -> extends -> class
// Son extends Dad


// class Animal
// interface Run
// class -> implements -> interface
// Animal implements Run

// interface Collection
// interface List
// class ArrayList
// interface -> extends -> interface
// List extends Collection

// interface      - I1();
// class          - C1
// abstract class - A1

// class C1           ->   implements  -> interface I1{}
// abstract class A1  ->   implements  -> interface I1

// class          extend  class     implements  interface1, interface2...{}
// Bishkekchanka  extend  Magazine  implements  Editional,   ......      {}