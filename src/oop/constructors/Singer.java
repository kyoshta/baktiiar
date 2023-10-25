package oop.constructors;

public class Singer {
    public String name;
    public int age;
    public String genre;
    public String songName;

    // special methods
    // constructor
    public Singer(String name1, int age1, String genre1, String songName1){
        name = name1;
        age = age1;
        genre = genre1;
        songName = songName1;


    }

    public String sing(){
        return "Ououuuoo...";
    }
    public String sign(){
        return "signing";
    }
}
