package loops;

public class LastLetterO {
    public static void main(String[] args) {
        String word = "MacBokkok Pro";

//        for (int i = 0; i < word.length(); i++){
//            if (i == word.indexOf('o', word.indexOf('o'))){
//                continue;
//
//            }
//            System.out.print(word.charAt(i));

//        }

        int num = 0;
        while (num < word.length()) {
            if (num == word.indexOf('o', word.indexOf('o')+1)) {
                num++;
                continue;
            }
            System.out.print(word.charAt(num));
            num++;
        }
    }

}



