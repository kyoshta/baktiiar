package access_modifiers;

public class FirstClass {
    public static void main(String[] args) {
        System.out.println(sayHi("Jennifer"));

    }
public static String sayHi (String name){
        return "Hi " + name;
}
}
    // 1. public    -> all project
    // 2. protected -> in one package --> sub class
    // 3. default   -> in one package
    // 4. private   -> in current class

