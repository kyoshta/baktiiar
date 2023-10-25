package methods;

public class AccessMethods2 {
    public static void main(String[] args) {
        System.out.println(sumOfTwoNums(44,55));

        AccessMethods2 object = new AccessMethods2();
        System.out.println(object.sayHi("Alex"));

    }

    public static int sumOfTwoNums(int num1, int num2){
        int result = num1 + num2;
        return result;

    }
    public String sayHi(String name){
        return "Hi " + name;
    }
    public static void sentMessage(String message){
        System.out.println("Your massage delivered");
    }
    // static method --> call by name --> sumOfTwoNums
    // non-static method --> call by object --> object.SayHi

    // calling static methods --> same class --> call by name
    // calling static methods --> another class --> call by className.methodName

    // return method --> data type = return
    // non-return --> void = sout

    // return method       --> static / non-static
    // non-return()void method --> static / non-static


}
