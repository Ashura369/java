// factorial of a number

public class a_13_1_factorialOfANumber {
    public static void main(String[] args) {
        int a = 5;
        factorial(a, 1, a);
        
        int ans = factorial2(a);
        System.out.println(ans);
    }

    public static void factorial(int n, int facto, int original) {
        if (n < 1) {
            System.out.println("THE FACTORIAL OF NUMBER "+ original +" IS "+facto); // just remove this comment and you will see why i have put "original" here
            System.out.println("THE FACTORIAL OF NUMBER "+ n +" IS "+facto);
            return;
        }

        facto *= n;

        factorial( n-1, facto, original);

    }

    public static int factorial2(int n) {
        if (n < 1) {
            return 1;
        }
        int a = factorial2(n-1);
        int facto = n * a;
        return facto;
    }
}
