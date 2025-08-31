public class Factorial {
    public static long compute(int n) {
        long fact = 1;
        if (n == 1 || n == 0) {
            return fact;
        } else {
            // use long for larger results
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            return fact;
        }
    }

    public static void main(String[] args) {
        int num = 5; // number to find factorial of
        System.out.println("Factorial of " + num + " is: " + compute(num));
    }
}
