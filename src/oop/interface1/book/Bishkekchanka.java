package oop.interface1.book;

public class Bishkekchanka extends Magazine implements Editional{
    @Override
    public String print() {
        return "Bishkekchanka is printing";
    }

    @Override
    public String edition(int copy) {
        return "tirage of Bishkekchanka " + copy;
    }
}
