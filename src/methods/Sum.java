package methods;

public class Sum {
    public static void main(String[] args) {
        for (int i = 1; i < 22; i++){
            System.out.println(fibo(i) + " ");
        }
        System.out.println();
        System.out.println("-------------");
        int result = sum(10);
        System.out.println(result);
        System.out.println(fibo(2));
        System.out.println(factorial(10));
        // 0112358132134
    }

    public static int fibo(long num) {
        if (num == 1 || num == 2) {
            return 1;
        }
        return fibo(num - 1) + fibo(num - 2);
    }

    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }

    public static int factorial(int n) {
        if (n == 1)
            return 1;
            return n * factorial(n - 1);

        }
    }
// a+b=c b+c=d c+d=e

