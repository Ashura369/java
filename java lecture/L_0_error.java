
import java.util.*;
public class L_0_error {
   
    public static void main(String[] args) {
        int ans = facto(5);
        System.out.println(ans);
    }

    public static int facto(int n) {

        if (n < 1) {
            return 1;
        }
        
        
        int a = facto(n-1); // by this you are doing two things, you are storing n-1 into a, and also you are calling back the "facto()" with n being a lesser number by 1
        int result = n * a;
        
        return result;
    }
    
}

