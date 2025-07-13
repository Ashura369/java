// Sum of first n natural numbers using recursion

public class a_13_0_sumOfFirstNNaturalNums {
    public static void main(String[] args) {
        printSum(1, 5, 0);
        // i = 1 (starting point)
        // n = 5 (number up to which we want the sum)
        // sum = 0 (initial sum)
    }

    public static void printSum(int i, int n, int sum) {

        if (i == n) {
            sum += i;
            System.out.println("THE SUM OF FIRST " + n + " NUMBERS IS: " + sum);
            return;
        }

        sum += i;
        printSum(i + 1, n, sum);
        System.out.println("NOW THE VALUE OF i IS: " + i); // Decreases due to recursion unwinding

        /*
        This print statement is placed *after* the recursive call, so it prints in reverse order
        as the recursive stack unwinds.

        Example for n = 3:
        -> call printSum(1, 3, 0)
        -> calls printSum(2, 3, 1)
        -> calls printSum(3, 3, 3)
        -> prints sum = 6
        -> returns to previous call: i = 2 → prints "NOW THE VALUE OF i IS: 2"
        -> returns to i = 1 → prints "NOW THE VALUE OF i IS: 1"
        */

        /*
        💡 Why is i printed in decreasing order?
        Because of *stack unwinding* (stacks getting deleted after they are being used). When the deepest recursive call finishes (base case),
        each previous call resumes in reverse order and prints its value of `i`.

        Stack works as LIFO (Last-In, First-Out).

        https://youtu.be/5Boqfjissv0?si=SFcCcbGqu1E3NNF2&t=2150
        */
    }
}
