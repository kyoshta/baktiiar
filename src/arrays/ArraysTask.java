package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the digit among 1 - 5:");

        for (int j = 0; j < 3; j++){
            int num = scan.nextInt();
        if (num >= 1 && num <=5){
            String [] fruits = new String[num];
            for (int i = 0; i < num; i++){
                System.out.print("give " + (i+1) + "-fruit:");
                fruits [i] = scan.next();
            }
            System.out.println(Arrays.toString(fruits));
            break;
        }
        else if (j < 2){
            System.out.println("try again");

        }
        else {
            System.out.println("tries are over");
        }
        }
    }
}
