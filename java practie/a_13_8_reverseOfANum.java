// pritnting the digits of a num in reverse

public class a_13_8_reverseOfANum {
    public static void main(String[] args) {
        r1(12345); //method 1
        System.out.println();
        
        r2(12345);
        System.out.println(sum); //method 2
        System.out.println();
    }

    public static void r1(int n) {
        if (n < 1) {
            return;
        }

        int a = n % 10;
        int b = n / 10;
        
        r1(b);
        System.out.println(a); // if you use the print statemtnt above "r1(b)", it will print the numbers in reverse
    }

    static int sum = 0;
    public static void r2(int n) {
        if (n == 0) {
            return;
        }

        int remainder = n % 10;
        sum = sum * 10 + remainder;
        r2(n/10);
    }
}
