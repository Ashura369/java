public class a_13_6_sumOfDigitsInANum {
    public static void main(String[] args) {
        // sum of the digits in a num
        System.out.println(r1(3685));
    }

    public static int r1(int n) {
        if (n == 0) {
            return 0;
        }

        int lastDigit = n % 10; // will give the remainder (last digit of the num) when it is divided by 10
        int remaining = n / 10; // will give the division when the num is divided by 10

        // % -- used to get the remainder in the num
        // / -- used to get the division of the num
        int ans = lastDigit + r1(remaining);
        return ans;

    }
    
}
