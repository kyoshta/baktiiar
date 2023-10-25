package oop.interface1.seat;

import java.util.Scanner;

public interface CarSeats {
    public static final int FIRST_POSITION = 1;
    public static final int SECOND_POSITION = 2;
    public static final int THIRD_POSITION = 3;

    default void getPosition(int position){
        if (position == FIRST_POSITION){
            System.out.println("dad's position");
        }
        else if (position == SECOND_POSITION){
            System.out.println("mom's position");
        }
        else if (position == THIRD_POSITION){
            System.out.println("please set the THIRD POSITION");
            Scanner scan = new Scanner(System.in);
            System.out.println("set up now");
            System.out.println("[YES]   [NO]");
            String answer1 = "YES";
            String answer2 = "NO";
            String userAnswer = scan.next();
            boolean answer = (userAnswer.equalsIgnoreCase(answer1)) ? true : false;
            if (answer){

            }


            String name = scan.next();

        }
    }


}
