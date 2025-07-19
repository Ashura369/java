public class a_13_4_sumOfDigitsFrom1toN {
    public static void main(String[] args) {
        r1(5);
        System.out.println();
        r2(5);
    }

    public static void r1(int n) {
        // 1 to n
        if (n == 0) {
            return;
        }

        r1(n-1);
        System.out.println(n);
    }
    public static void r2(int n) {
        // n to 1
        if (n == 0) {
            return;
        }

        System.out.println(n);
        r2(n-1);
    }
}
