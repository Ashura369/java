// print odd or even numbers
import java.util.*;

public class a_3_1_ifElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the num - ");
        int a = input.nextInt();

        if (a % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
