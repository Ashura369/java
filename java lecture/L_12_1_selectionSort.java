public class L_12_1_selectionSort {
    public static void main(String[] args) {
         
        int[] arr = {7, 2, 14, 5, 1, 13, 8, 3, 10, 6, 12, 9, 4, 15, 11};

        // Selection sort logic
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;

            // Find the index of the smallest element in the unsorted part
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        // Print the sorted array
        System.out.println("Sorted array using Selection Sort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }


    }
}
