// fibonacci sequence

import java.util.*;
public class a_13_2_fibonacciSequence {
    public static void main(String[] args) {
        int ans = fibonacci(6);
        System.out.println(ans);
    }

    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fibo = fibonacci(n-1) + fibonacci(n-2);
        return fibo;
    }

    /*
    
        fibonacci(6)
        │
        ├── fibonacci(5)
        │   ├── fibonacci(4)
        │   │   ├── fibonacci(3)
        │   │   │   ├── fibonacci(2)
        │   │   │   │   ├── fibonacci(1) → 1
        │   │   │   │   └── fibonacci(0) → 0
        │   │   │   └── = 1 + 0 = 1
        │   │   │
        │   │   └── fibonacci(1) → 1
        │   │   └── = 1 + 1 = 2
        │   │
        │   └── fibonacci(2)
        │       ├── fibonacci(1) → 1
        │       └── fibonacci(0) → 0
        │       └── = 1 + 0 = 1
        │
        │   └── = 2 + 1 = 3
        │
        ├── fibonacci(4)
        │   ├── fibonacci(3)
        │   │   ├── fibonacci(2)
        │   │   │   ├── fibonacci(1) → 1
        │   │   │   └── fibonacci(0) → 0
        │   │   └── = 1 + 0 = 1
        │   │
        │   │   └── fibonacci(1) → 1
        │   │   └── = 1 + 1 = 2
        │   └── = 2
        │
        │   ├── fibonacci(2)
        │   │   ├── fibonacci(1) → 1
        │   │   └── fibonacci(0) → 0
        │   └── = 1
        │
        └── = 2 + 1 = 3

Final:
fibonacci(5) = 3
fibonacci(4) = 2
So:
fibonacci(6) = 3 + 2 = **5**

    */

    
}
