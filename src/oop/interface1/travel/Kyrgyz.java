package oop.interface1.travel;

import java.util.Scanner;

public class Kyrgyz extends Person implements Embassy,TravelAgency {
    public Kyrgyz(String name, int age, String citizenship) {
        super(name, age, citizenship);
    }

    public Kyrgyz() {

    }

    @Override
    public String visa() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Where do you want to go?");
        String country = scan.next();
        if (country.equalsIgnoreCase("Dubai")) {
            System.out.println("Price of visa to Dubai is $80\nPlease, enter the cash");
            int cash = scan.nextInt();
            if (cash == 80) {
                System.out.println("Visa to Dubai is approved!");
                return "Visa to Dubai is approved!";
            } else {
                System.out.println("Visa denied");
                return "Visa denied";
            }
        }
        if (country.equalsIgnoreCase("Italy")) {
            System.out.println("Criminal record");
            int criminal = scan.nextInt();
            if (criminal == 0) {
                System.out.println("Annual income");
                int income = scan.nextInt();
                if (income >= 8000) {
                    System.out.println("Visa to Italy is approved!");
                    return "Visa to Italy is approved!";
                } else {
                    System.out.println("Visa denied");
                    return "Visa denied";
                }
            }
        }
        if (country.equalsIgnoreCase("Japan")) {
            System.out.println("Enter purpose of your trip");
            String purpose = scan.next();
            if (purpose.equalsIgnoreCase("Medicine") || purpose.equalsIgnoreCase("Study")
                    || purpose.equalsIgnoreCase("Work")) {
                System.out.println("Please show your contract");
                boolean contract = scan.nextBoolean();
                if (contract) {
                    System.out.println("Visa to Japan is approved!");
                    return "Visa to Japan is approved!";
                } else {
                    System.out.println("Visa denied");
                    return "Visa denied";
                }
            }
        }
        if (country.equalsIgnoreCase("USA")) {
            System.out.println("Tell us truth");
            boolean isTruth = scan.nextBoolean();
            if (isTruth == true) {
                System.out.println("Welcome to USA!");
            } else {
                System.out.println("Visa denied!");
            }

        }return "";
    }



    @Override
    public String tour() {System.out.println("Which country do you want to visit?");
            Scanner scan2 = new Scanner(System.in);
            String travelTo = scan2.next();
            if (travelTo.equalsIgnoreCase(DUBAI)) {
                if (visa().contains("Dubai is approved")) {
                    System.out.println("Please, pay $600");
                    int payment1 = scan2.nextInt();
                    if (payment1 == 600) {
                        return "Arividerchi!";
                    }
                    return "Invalid payment";
                }
                return "Get visa first";
            }
            if (travelTo.equalsIgnoreCase(ITALY)) {
                if (visa().contains("Italy is approved")) {
                    System.out.println("Please, pay $800");
                    int payment1 = scan2.nextInt();
                    if (payment1 == 800) {
                        return "Arividerchi!";
                    }
                    return "Invalid payment";
                }
                return "Get visa first";
            }
            if (travelTo.equalsIgnoreCase(JAPAN)) {
                if (visa().contains("Japan is approved")) {
                    System.out.println("Please, pay $2000");
                    int payment1 = scan2.nextInt();
                    if (payment1 == 2000) {
                        return "Arividerchi!";
                    }
                    return "Invalid payment";
                }
                return "Get visa first";
            }
            return "I SAID COUNTRY!";
        }


}
