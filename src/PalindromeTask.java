import java.util.HashMap;
import java.util.Scanner;

public class PalindromeTask {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String word = scan.next();
//        String reversWord = "";
//        HashMap<Character, Character> result = new HashMap<>();
//        String str1 = "";
//        String str2 = "";
//        for (int i = word.length() - 1; i >= 0; i--) {
//            reversWord += word.charAt(i);
//
//        }
//        if (word.equals(reversWord)) {
//            System.out.println("palindrome");
//            for (int i = 0; i < reversWord.length(); i++) {
//                str1 += reversWord.charAt(i);
//
//            }
//            System.out.println(str1);
//
//        } else {
//            System.out.println("not palindrome");
//        }
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String reverse = "";
        HashMap<Character, Character> result = new HashMap<>();

        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);
            char ch = word.charAt(i);
            if (Character.isLetter(ch)) {
                if (Character.isUpperCase(ch)) {
                    result.put(ch, Character.toLowerCase(ch));
                }
            }
        }
        if (word.equalsIgnoreCase(reverse)) {
            System.out.println("Palindrome: " + reverse);
        } else {
            System.out.println("Its not a palindrome");
        }
        for (Character key : result.keySet()) {
            Character value = result.get(key);
            System.out.println(key + " " + value);
        }
    }
}

