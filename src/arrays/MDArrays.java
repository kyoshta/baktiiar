package arrays;

import java.util.Arrays;

public class MDArrays {
    public static void main(String[] args) {
        String[][] str = {{"Anvarov", "Abyshev"}, {"Subanova", "Musaeva"}};




        // System.out.println(str.length);
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str.length; j++) {
                // System.out.println(str[i][j]);
                String sur = str [i][j];
                //String sur2 = sur.substring(sur.length()-1);
                if (sur.endsWith("a")){//(sur2.equals("a")) {
                    System.out.println(sur + " female");
                }
                else {
                    System.out.println(sur + " male");
                }
            }

        }
    }
}

