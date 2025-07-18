// fibonacci sequence

import java.util.*;
public class a_13_2_fibonacciSequence {
    public static void main(String[] args) {
        int ans = fibonacci(6);
        System.out.println(ans);

        // another metod
        int a = 0, b = 1;
        System.out.println("\nFibonacci sequence up to 7 terms:");
        System.out.println(a);
        System.out.println(b);
        int num = 7;  // Total number of terms
        fibonacci2(a, b, num - 2); // Already printed 2 terms (a and b)
    }

    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fibo = fibonacci(n-1) + fibonacci(n-2);
        return fibo;
    }

    /*

    LOGIC OF THE ENTIRE FIBONACCI SEQUENCE : 
    
        fibonacci(6)
        ├── fibonacci(5)
        │   ├── fibonacci(4)
        │   │   ├── fibonacci(3)
        │   │   │   ├── fibonacci(2)
        │   │   │   │   ├── fibonacci(1) => 1
        │   │   │   │   └── fibonacci(0) => 0
        │   │   │   └── fibonacci(1) => 1
        │   │   │   => fibonacci(3) = 1 + 1 = 2
        │   │   └── fibonacci(2)
        │   │       ├── fibonacci(1) => 1
        │   │       └── fibonacci(0) => 0
        │   │       => fibonacci(2) = 1 + 0 = 1
        │   │   => fibonacci(4) = 2 + 1 = 3
        │   └── fibonacci(3)
        │       ├── fibonacci(2)
        │       │   ├── fibonacci(1) => 1
        │       │   └── fibonacci(0) => 0
        │       │   => fibonacci(2) = 1 + 0 = 1
        │       └── fibonacci(1) => 1
        │       => fibonacci(3) = 1 + 1 = 2
        │   => fibonacci(5) = 3 + 2 = 5
        └── fibonacci(4)
            ├── fibonacci(3)
            │   ├── fibonacci(2)
            │   │   ├── fibonacci(1) => 1
            │   │   └── fibonacci(0) => 0
            │   │   => fibonacci(2) = 1 + 0 = 1
            │   └── fibonacci(1) => 1
            │   => fibonacci(3) = 1 + 1 = 2
            └── fibonacci(2)
                ├── fibonacci(1) => 1
                └── fibonacci(0) => 0
                => fibonacci(2) = 1 + 0 = 1
            => fibonacci(4) = 2 + 1 = 3

        ==> fibonacci(6) = 5 + 3 = 8 ✅
    */

    public static void fibonacci2(int a, int b, int termsLeft) {
        if (termsLeft == 0) {
            return;
        }
        int c = a + b;
        System.out.println(c);
        fibonacci2(b, c, termsLeft - 1);
        
    }

    
}
