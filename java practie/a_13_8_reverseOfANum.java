// pritnting the digits of a num in reverse

public class a_13_8_reverseOfANum {
    public static void main(String[] args) {
        r1(12345);
    }

    public static void r1(int n) {
        if (n < 1) {
            return;
        }

        int a = n % 10;
        System.out.println(a);
        int b = n / 10;

        r1(b);

    }
}
