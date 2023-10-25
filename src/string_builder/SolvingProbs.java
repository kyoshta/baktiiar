package string_builder;

import java.util.Scanner;

public class SolvingProbs {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("give new login:");
        String newLogin = scan.next();
        System.out.println("repeat login");
        String login = scan.next();
        if (login.equals(newLogin)){
            System.out.println("give new password");
            String newPassword = scan.next();
            System.out.println("repeat password");
            String password = scan.next();
            if (password.equals(newPassword)){
                System.out.println("successful signing up!");
                System.out.println("now try to sign in");
                System.out.println("login:");
                String login2 = scan.next();
                if (login2.equals(login)){
                    System.out.println("password:");
                    String password2 = scan.next();
                    if (password2.equals(password)){
                        System.out.println("successful signing in!");
                    }else {
                        System.err.println("wrong password!");
                    }

                }else {
                    System.err.println("wrong login!");
                }
            }else {
                System.err.println("passwords don't match");
            }
        }else  {
            System.err.println("logins don't match");
        }

    }




}
