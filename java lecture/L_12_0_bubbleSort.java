public class L_12_0_bubbleSort {
    public static void main(String[] args) {
        int[] arr = {7, 2, 14, 5, 1, 13, 8, 3, 10, 6, 12, 9, 4, 15, 11};

        // Bubble sort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap elements
                    int temporary = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temporary;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
