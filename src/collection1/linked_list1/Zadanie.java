package collection1.linked_list1;

import java.util.Arrays;

public class Zadanie {
    public static void main(String[] args) {
// “Hello world” —> { {H,e,l,l,o}, {w,o,r,l,d} }
//{w,o,r,l,d}  —> LinkedList
//     String str = "Hello world";
//     char [] charArray = str.toCharArray();
//     for (char ch: charArray){
//         System.out.println(ch);

//        String str = "Hello World!";
//        String[] words = str.split(" ");
//        char[][] result = new char[words.length][];
//
//        for (int i = 0; i < words.length; i++) {
//            String word = words[i];
//            char[] chars = new char[word.length()];
//            for (int j = 0; j < word.length(); j++) {
//                chars[j] = word.charAt(j);
//            }
//            result[i] = chars;
//        }
//
//        System.out.println(Arrays.deepToString(result));
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("world");

        sb1.toString();
        char[][] array = new char[sb1.length()][sb2.length()];
        for (int i = 0; i < sb1.length(); i++) {
            array[i] = new char[]{sb1.charAt(i)};
            for (int j = 0; j < sb1.length(); j++) {
                array[j] = new char[]{sb2.charAt(j)};
            }
        }
        System.out.println(Arrays.deepToString(array));

    }
}


