package loops;

public class UsingWhileInTheMethod {
    public static void main(String[] args) {//12345678901234
        getTheNomads("Digital Nomads");


    }
    public static void getTheNomads(String word){
        int num = word.indexOf(' ')+1;//word.length();
        while (num < word.length()){
            System.out.print(word.charAt(num));
            num++;
        }
//        String word = "Digital Nomads";
//        int num = word.length();
//        for (int i = 0; i < num; i++) {//word.indexOf(' ')
//            System.out.print(word.charAt(i));
//            if (i == word.lastIndexOf(' ')) {//word.length()-1
//                break;
    }
}
