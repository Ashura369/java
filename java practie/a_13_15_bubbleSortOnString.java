// Sorting a string using bubble sort with recursion and for loop

public class a_13_15_bubbleSortOnString {
    public static void main(String[] args) {
        String str = "qczfxxvmyuhrokwaxnpbldexxtsagxjaixegtc";
        char[] arr = str.toCharArray();

        r1(arr, arr.length);
        System.out.print(new String(arr));
    }

    public static void r1(char[] arr, int n) {
        if (n == 1) {
            return;
        }

        // Bubble pass (push largest to end)
        for (int i = 0; i < n - 1; i++) {  // fixed boundary
            if (arr[i] > arr[i + 1]) {
                // Swap
                char temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        // Recurse for next pass
        r1(arr, n - 1);
    }
}
