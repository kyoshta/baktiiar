package collection1.array_list1;

import java.util.ArrayList;
import java.util.Scanner;

public class Draft2 {
    public static void main(String[] args) {
        ArrayList<String> seasons = new ArrayList<>();
        seasons.add("Winter");
        seasons.add("Spring");
        seasons.add("Fall");
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        for (int i = 0; i < str.length(); i++) {
            if (str.contains("Summer")){
                seasons.add(2, str);
                System.out.println(seasons);
                break;


            }

        }

    }
}
