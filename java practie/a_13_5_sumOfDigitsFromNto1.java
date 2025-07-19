public class a_13_5_sumOfDigitsFromNto1 {
    public static void main(String[] args) {
        // sum of nums 1 to n
        System.out.println(r1(1, 10));
    }

    public static int r1(int n, int x) {
        if (n == x) {
            return x;
        }

        int a = r1(n+1, x);
        int sum = n + a;
        return sum;


    }
}
