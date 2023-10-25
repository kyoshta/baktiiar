package oop.inheritance.wagroup;

import java.util.LinkedList;

public class MainWAGroup {
    public static void main(String[] args) {

        Contacts aza = new Contacts("Aza", 707451245, "male", true);
        Contacts sema = new Contacts("Sem", 555123458, "male", false);
        Contacts anya = new Contacts("Anya", 771154699, "female", true);


        LinkedList<Contacts> listOfContacts = new LinkedList<>();
        listOfContacts.add(aza);
        listOfContacts.add(sema);
        listOfContacts.add(anya);
        System.out.println(listOfContacts);

        Contacts contacts1 = new Contacts();
        contacts1.listOfMembers(listOfContacts);
        System.out.println(contacts1.listOfMembers(listOfContacts));





    }
}
