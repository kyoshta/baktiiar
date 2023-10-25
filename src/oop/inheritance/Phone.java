package oop.inheritance;

public class Phone {
    public String telefon;
    public int yp;
    public String color;
    private int balance;
    private boolean abon;

    public Phone(String telefon, int yp, String color, int balance, boolean abon) {
        this.telefon = telefon;
        this.yp = yp;
        this.color = color;
        this.balance = balance;
        this.abon = abon;
    }

    public String call(){
        return "allo";
    }
}
