package arrays;

import java.util.Arrays;

public class Arrays2 {
    public static void main(String[] args) {
        String str = new String("Privet");
String reversed = "";
        char[] symbs = new char[6];
        int j = 0;
        for (int i = 5; i >= 0; --i) {

                symbs[j++] = str.charAt(i);
                reversed += str.charAt(i);
            }
            System.out.println(reversed);
        }

    }






