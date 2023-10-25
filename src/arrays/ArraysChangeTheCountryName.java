package arrays;

import java.util.Arrays;

public class ArraysChangeTheCountryName {
    public static void main(String[] args) {
        String [] countries = new String[3];
        countries [0] = "america";
        countries [1] = "england";
        countries [2] = "kyrgyzstan";
        System.out.println(countries[2]);
        countries [0] = "USA";
//        System.out.println(Arrays.toString(countries));

        for (String i : countries){
            if (i == "england"){
                i  = "UK";
            }
            System.out.println(i);
        }

    }

}
