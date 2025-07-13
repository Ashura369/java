// dis-sorted and recurring array - fix it
import java.util.*;
public class L_0_error {
   
    public static void main(String[] args) {
        // printing the sum of first n natural numbers
        sum(0, 5, 0);
    }

    public static void sum(int i, int n, int sum) {
        if (i > n) {
            System.out.println(sum);
            return;
        }
        sum = sum + i;
        sum(i+1, n, sum);
    }
    
}

