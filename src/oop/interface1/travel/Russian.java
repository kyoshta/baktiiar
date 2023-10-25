package oop.interface1.travel;

import java.util.Scanner;

public class Russian extends Person implements Embassy, TravelAgency{
    private String secondC;
    Kyrgyz kyrgyz = new Kyrgyz();


    public Russian(String name, int age, String citizenship) {
        super(name, age, citizenship);

    }

    @Override
    public String toString() {
        return "Russian{" +

                "name='" + name + '\'' +
                ", age=" + age +
                ", secondC='" + secondC + '\'' +
                '}';
    }

    @Override
    public String visa() {
        Scanner scan = new Scanner(System.in);
        System.out.println("which country do you want to visit?");
        String countryR = scan.next();
        if (countryR.equalsIgnoreCase("italy") || countryR.equalsIgnoreCase("dubai")
                || countryR.equalsIgnoreCase("japan")) {
            kyrgyz.visa();
        }
        if (countryR.equalsIgnoreCase("usa")) {
            System.out.println("do u have kyrgyz citizenship?");
            boolean isKyrgyz = scan.nextBoolean();
            if (isKyrgyz) {
                kyrgyz.visa();
            } else {
                System.out.println("we are sorry!");
            }
            return "";
        }return "";
    }

    @Override
    public String tour() {
        return null;
    }
}


