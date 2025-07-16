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
            return 1; // here we returned 1 bcoz, if you enter 0 as an input it will show the factorial of 0 as 1
        }
        int a = factorial2(n-1);
        int facto = n * a; // by this you are doing two things, you are storing n-1 into a, and also you are calling back the "facto()" with n being a lesser number by 1
        return facto;
    }
}
