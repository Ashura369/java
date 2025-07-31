//  printing numbers in zig-zag

import java.util.*;

public class a_13_17_zigZag {
        public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = input.nextInt();
        r1(n);
    }

    public static void r1(int n) {
        if (n == 0) {
            return;
        }

        System.out.println("Pre - "+n);
        r1(n-1);
        System.out.println("In - "+n);
        r1(n-1);
        System.out.println("Post - "+n);

        /*

            For n = 3

            This is the sequence of how everything is getting printed
            
            -pre 3
            -pre 2
            -pre 1
            -in 1
            -post 1
            -in 2
                --pre 1
                --in 1
                --post 1
            -post 2
            -in 3
                --pre 2
                    --pre 1
                    --in 1
                    --post 1
                --in 2
                    --pre 1
                    --in 1
                    --post 1
                --post 2
            -post 3


            -------------------------------------------------------------------


            r1(3)
            ├── print: Pre - 3
            ├── r1(2)
            │   ├── print: Pre - 2
            │   ├── r1(1)
            │   │   ├── print: Pre - 1
            │   │   ├── r1(0)
            │   │   │   └── return
            │   │   ├── print: In - 1
            │   │   ├── r1(0)
            │   │   │   └── return
            │   │   └── print: Post - 1
            │   ├── print: In - 2
            │   ├── r1(1)
            │   │   ├── print: Pre - 1
            │   │   ├── r1(0)
            │   │   │   └── return
            │   │   ├── print: In - 1
            │   │   ├── r1(0)
            │   │   │   └── return
            │   │   └── print: Post - 1
            │   └── print: Post - 2
            ├── print: In - 3
            ├── r1(2)
            │   ├── print: Pre - 2
            │   ├── r1(1)
            │   │   ├── print: Pre - 1
            │   │   ├── r1(0)
            │   │   │   └── return
            │   │   ├── print: In - 1
            │   │   ├── r1(0)
            │   │   │   └── return
            │   │   └── print: Post - 1
            │   ├── print: In - 2
            │   ├── r1(1)
            │   │   ├── print: Pre - 1
            │   │   ├── r1(0)
            │   │   │   └── return
            │   │   ├── print: In - 1
            │   │   ├── r1(0)
            │   │   │   └── return
            │   │   └── print: Post - 1
            │   └── print: Post - 2
            └── print: Post - 3
         */
    }
}
