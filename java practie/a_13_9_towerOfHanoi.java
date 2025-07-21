/*
Tower of Hanoi

print the instructions to move the disks
following are the rules...
    - move 1 disk at a time
    - newer place a smller disk under a larger disk
    - you can only move a disk at the top

*/

public class a_13_9_towerOfHanoi {
    public static void main(String[] args) {
        // a == start
        // b == helper
        // c == destination
        hanoi(3, 'A', 'B', 'C');
    }

    public static void hanoi(int n, char a, char b, char c) {
        if (n == 1) {
            System.out.println("Transfer disk "+ n +" from "+ a +" to "+ c);
            return;
        }
        
        hanoi(n-1, a, c, b); // move n-1 disks from a to b using c
        System.out.println("Transfer disk "+ n +" from "+ a +" to "+ c); // move nth disk to destination
        hanoi(n-1, b, a, c); // move n-1 disks from b to c using a

        /*
        When we say "n - 1 disks", we mean all the disks except the largest one (the nth one).

                           hanoi(3, A, B, C)
                            /       |       \
                hanoi(2, A, C, B)  Move A->C  hanoi(2, B, A, C)
                    /     |     \                      /     |     \
            h(1,A,B,C) M A->B h(1,C,A,B)      h(1,B,C,A) M B->C h(1,A,B,C)


        
        hanoi(3, A, B, C)
        ├── hanoi(2, A, C, B)
        │   ├── hanoi(1, A, B, C)
        │   │   └── print: A --> C
        │   └── print: A --> B
        │   └── hanoi(1, C, A, B)
        │       └── print: C --> B
        ├── print: A --> C
        └── hanoi(2, B, A, C)
            ├── hanoi(1, B, C, A)
            │   └── print: B --> A
            └── print: B --> C
            └── hanoi(1, A, B, C)
                └── print: A --> C

        */
    }
}


