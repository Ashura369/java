public class L_13_0_recursion {
    public static void printNum1(int a) {
        // printing the nums 5 to 1
        if (a == 0) {
            return;
        }
        System.out.print(a + " ");
        printNum1(a - 1); // it will keep callling the "printNum" with decreasing the value by 1, untion a == 0. 
    }

    public static void printNum2(int a) {
        // printing nums 1 to 10
        if (a > 10) { 
            
            return;
        }

        System.out.print(a+" ");
        printNum2(a+1);
    }

    public static void main(String[] args) {
        // printing numbers form 5 to 1

        int n = 5;
        System.out.print("printNum1: ");
        printNum1(n);
        System.out.println();

        System.out.print("printNum2: ");
        printNum2(1);

    }

}
