public class a_13_16_logarithm {
    public static void main(String[] args) {
        int base = 2;
        int number = 16;

        int result = log(base, number); // computes log base 2 of 16
        int result2 = power(base, 8);   // computes 2^8

        System.out.println("log_" + base + "(" + number + ") = " + result);
        System.out.println(base + "^" + result + " = " + result2);
    }

    // Recursive logarithm
    public static int log(int base, int number) {
        if (number < base) {
            return 0;
        }
        return 1 + log(base, number / base);
    }

    // Recursive exponentiation (base^power)
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }

        int half = power(x, n / 2);
        int result = half * half;

        if (n % 2 != 0) {
            result = result * x;
        }

        return result;
    }
}
