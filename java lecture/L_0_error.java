
import java.util.*;
public class L_0_error {
   
    public static void main(String[] args) {
        // sum of the digits in a num
        System.out.println(r1(3685));
    }

    public static int r1(int n) {
        if (n < 1) {
            return 0;
        }

        int lastDigit = n % 10;
        int remainingNum = n / 10;

        int ans = lastDigit + r1(remainingNum);
        return ans;


    }
    
    
}

