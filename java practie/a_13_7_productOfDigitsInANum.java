// printing the product of all the digits in a num

public class a_13_7_productOfDigitsInANum {
    public static void main(String[] args) {
        System.out.println("r1 : " + r1(4562));
        System.out.println();
        System.out.println("r2 : " + r2(4562));
    }

    public static int r1(int n) {
        if (n < 1) {
            return 1;
        }

        int a = n % 10; // finding the remainder
        int b = n / 10; // getting the remaining digits as num

        int result = a * r1(b);
        return result;
    }

    public static int r2(int n) {
        if (n % 10 == n) {
            return n;
        }

        int ans = (n % 10) * r2(n / 10);
        return ans;
    }
}
