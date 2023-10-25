package oop.interface1.book;

public class Book implements Printable, Editional {
    public String name;
    public String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public String edition(int copy) {
        return "Edition " + copy;
    }

    @Override
    public String print() {
        return "Printing of " + this.name;
    }
}
