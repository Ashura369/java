// returning the ans in boolean, if the array is increasing or strictly increasing

public class a_13_13_1 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5};
        int[] arr2 = {1, 3, 3, 5};
        System.out.println(isSorted(arr, 0)); // true
        System.out.println(isSorted(arr2, 0)); // false
    
    }

    public static boolean isSorted(int arr[], int idx) {

        if (idx == arr.length - 1) {
            return true;
        }

        if (arr[idx] >= arr[idx+1]) {
            return false;
        }else{
            return isSorted(arr, idx+1);
        }
    }
}
