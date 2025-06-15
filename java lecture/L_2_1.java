public class L_2_1 {
    public static void main(String[] args) {
        int a, b, c, d, sum, diff, multy, divide;
        a = 10;
        b = 5;
        sum = a + b;
        diff = a - b;
        multy = a * b;
        divide = a / b;
        c=a*b/a-b;
        d=(a*b)/(a-b); // this format is correct //in java calculation starts from left to right

        System.out.println("The sum is: " + sum);
        System.out.println("The diff is: " + diff);
        System.out.println("The multy is: " + multy);
        System.out.println("The divide is: " + divide);
        System.out.println("The value of c is: " + c);
        System.out.println("The value of d is: " + d);
    }
}
