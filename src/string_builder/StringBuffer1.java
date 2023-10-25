package string_builder;

import java.util.Scanner;

public class StringBuffer1 {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Clark");

        StringBuffer sb2 = new StringBuffer("Will");
        sb2.reverse();
        System.out.println(sb2);
        sb2.append(" Smith");
        System.out.println(sb2);
        System.out.println("Zadachi");

        String baseLogin = "kyoshtab@gmail.com";
        String basePassword = "kyoshta94";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your login");
        String userLogin = scanner.next();

        if (userLogin.equalsIgnoreCase(baseLogin)) {
            System.out.println("Enter your password");
            String userPassword = scanner.next();
            if (userPassword.equals(basePassword)) {
                System.out.println("Welcome Bakhtiiar!");

            } else {
                System.out.println("Invalid password");
            }
            } else {
                System.out.println("Invalid login");

            }

        }

    }


