package oop.class_objects;

public class Book {
    public String name;
    public String author;
    public int year;
    public int pages;
    public String changesLives(){
        return "impacts";
    }
    public int cost;


    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", pages=" + pages +
                '}';
    }
}
