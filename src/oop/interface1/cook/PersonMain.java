package oop.interface1.cook;

import oop.interface1.cook.Cook;
import oop.interface1.cook.Person;

public class PersonMain {
    public static void main(String[] args) {
        Person jacob = new Person("Jacob", 25, false);
//        System.out.println(jacob.cookSushi());
//        System.out.println(jacob.cookFastFood("omelette"));
        System.out.println(Cook.cookItalianFood("pasta"));
    }
}
