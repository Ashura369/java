//  Shift all elements to the left by one index.

public class a_17_19_shiftElementsToLeft {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int firstEle = arr[0];

        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i]; // Shift element left
        }
        arr[arr.length - 1] = firstEle; // Place original first element at the end

        // Print shifted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}