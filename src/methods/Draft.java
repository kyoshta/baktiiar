package methods;

import java.util.Scanner;

public class Draft {
    public static void main(String[] args) {
        System.out.println("Check if the word is palindrome?");
        Scanner scan = new Scanner(System.in);
        String word2 = scan.next();
        System.out.println(palindrome(word2));


        //System.out.println(reverseTheWord("kitap"));

    }

    //    public static StringBuilder reverseTheWord(String word){
//        StringBuilder sb = new StringBuilder(word);
//        sb.reverse();
//        return sb;
//    public static String reverseTheWord(String word){
//        StringBuilder sb = new StringBuilder(word);
//        return sb.reverse().toString();
    public static String palindrome(String word) {
        StringBuilder sb = new StringBuilder(word);
        String word2 = sb.reverse().toString();
        if (word2.equalsIgnoreCase(word)) {
            return "Yes, this word is a palindrome";
        } else {
            return "No, this word is not a palindrome";
        }
    }
    }

