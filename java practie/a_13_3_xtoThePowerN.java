// printing x^n (stack height = n)


public class a_13_3_xtoThePowerN {
    public static void main(String[] args) {
        int x = 2; //number
        int n = 5; //power
        int resualt = power(x, n);
        System.out.println(resualt);
    }

    public static int power(int x, int n) {
        if (x == 0) {
            return 0;
        } else if (n == 0) {
            return 1;
        }

        int a = power(x, n-1);
        int ans = x * a;
        return ans;

        /*
        power(2, 3)
        = 2 * power(2, 2)
        = 2 * (2 * power(2, 1))
        = 2 * (2 * (2 * power(2, 0)))
        = 2 * (2 * (2 * 1))
        = 2 * (2 * 2)
        = 2 * 4
        = 8
        */
    }
}
