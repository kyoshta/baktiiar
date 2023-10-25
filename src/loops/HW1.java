package loops;

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        System.out.println("create your login:");
        Scanner scan = new Scanner(System.in);
        String login1 = scan.next();
        System.out.println("repeat your login:");
        String login2 = scan.next();
        String result = (login2.equalsIgnoreCase(login1)) ? "now create your password:" : "error, logins don't match!";
        System.out.println(result);
            String key = scan.next();
            System.out.println("retype your password:");
            String key2 = scan.next();
            String result2 = (key2.equals(key)) ? "success, try to sign in" : "error, passwords don't match!";
            System.out.println(result2);

                System.out.println("enter your login");

                    for (int i = 0; i < 3; i++){
                        String login3 = scan.next();
                        System.out.println("enter your password:");
                        String key3 = scan.next();
                        if (login3.equals(login2) && (key3.equals(key2))){
                            System.out.println("success");
                            break;
                        }
                        else if (i < 2){
                            System.out.println("try again");
                        }
                        else {
                            System.out.println("your tries over");
                        }

                    }
        }

    }

