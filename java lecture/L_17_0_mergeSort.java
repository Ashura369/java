public class L_17_0_mergeSort {
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        int n = arr.length;

        divide(arr, 0, n-1);

        // print
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    public static void divide(int arr[], int si, int ei) {
        if (si >= ei) {                 // si = startinf idx, ei = ending idx
            return;
        }

        int mid = (si + ei)/2;          // si + (ei - si) / 2 ----> this is another way of writing this code. If you write (arr.length - 1) / 2, when the recursion will be called it will only be calling the same arr not the newly made arr by dividing the previous one
        divide(arr, si, mid);           // This recursively sorts the left half of the array.
        divide(arr, mid + 1, ei);       // This recursively sorts the left half of the array.
        conquer(arr, si, mid, ei);      // After both halves are individually sorted, this function merges them into one sorted sequence.
    }


    public static void conquer(int arr[], int si, int mid, int ei) {
        int merged[] = new int[ei - si + 1]; // temp array to hold merged part
        int idx1 = si;     // start index of left half
        int idx2 = mid+1;  // start index of right half
        int x = 0;         // pointer for merged[]

         // Merge elements from both halves until one half is exhausted
        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] <= arr[idx2]) {
                // If left element is smaller, take it
                merged[x++] = arr[idx1++];
            } else {
                // If right element is smaller, take it
                merged[x++] = arr[idx2++];
            }
        }

        // If any elements are left in the left half, copy them
        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }

        // If any elements are left in the right half, copy them
        while (idx2 <= ei) {
            merged[x++] = arr[idx2++];
        }

        // Copy merged result back into original array
        // Start placing at index 'si' up to 'ei'
        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }
}
