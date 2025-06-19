// Kedens algorithm - Maximum sum sub array

public class a_17_20_kedensAlgorithm {
    public static void main(String[] args) {
        int[] arr = { -5, 4, 6, -3, 4, -1 };
        int crrSum = arr[0]; // -5
        int maxSum = arr[0]; // -5

        for (int i = 0; i < arr.length; i++) {

            // currSum = Math.max(arr[i], currSum + arr[i]);
            if ((crrSum + arr[i]) > arr[i]) {
                crrSum = (crrSum + arr[i]);
            } else {
                crrSum = arr[i];
            }

            // maxSum = Math.max(maxSum, currSum);
            if (crrSum > maxSum) {
                maxSum = crrSum;
            }
        }

        System.out.println("THE MAXIMUM SUM SUB-ARRAY IS: " + maxSum);
        System.out.println("THE CURRENT SUM SUB-ARRAY IS: " + crrSum);
        System.out.println("-----------------------------------------------------");

        anotherExample(); // another array for the same qs
    }

    public static void anotherExample() {
        int[] arr = { 3, -2, 5, -1, 6, -3, 2, 7, -5, 2, -8, 4, 1, -2, 3 };

        int currSum = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            // Decides whether to extend the current subarray or start a new one
            currSum = Math.max(arr[i], currSum + arr[i]);

            // Updates maxSum if current subarray sum is greater
            maxSum = Math.max(maxSum, currSum);
        }

        System.out.println("THE MAXIMUM SUM SUB ARRAY IS: " + maxSum);

    }

}