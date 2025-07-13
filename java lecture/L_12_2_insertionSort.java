public class L_12_2_insertionSort {
    public static void main(String[] args) {
        int[] arr = {7, 2, 14, 5, 1, 13, 8, 3, 10, 6, 12, 9, 4, 15, 11};

        // Insertion sort logic
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;

            // Move elements that are greater than current one position ahead
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Place the current value into its correct position
            arr[j + 1] = current;
        }

        // Print the sorted array
        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
