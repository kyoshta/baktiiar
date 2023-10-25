package loops;

import java.util.Scanner;

public class PalindromeWithLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String reverseTheWord = "";
//        for (int j = 0; j < word.length(); ++j){
//           word.charAt(j);
//            System.out.print(word);
        for (int i = word.length()-1; i >= 0; --i){
            reverseTheWord += word.charAt(i);

        }
//        System.out.print(reverseTheWord);
        if (word.equalsIgnoreCase(reverseTheWord)){
            System.out.println("palindrome");
        }
        else {
            System.out.println("ne palindrome");
        }
    }


}
