// finding the largest and second largest value

public class a_7_18_largestAndSecLargest {
    public static void main(String[] args) {
        int[] arr = {14, 3, 19, 7, 1, 12, 6, 17, 9, 2, 20, 4, 11, 15, 8, 13, 16, 10, 5, 18};

        int largest = arr[0];
        int secLargest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) { //finding the largest
                secLargest = largest;
                largest = arr[i];
            } else if (arr[i] != largest && arr[i] > secLargest) { //finding the second largest
                secLargest = arr[i];
            }
        }

        System.out.println("LARGEST = "+largest);
        System.out.println("SECOND LARGEST = "+secLargest);

    }
}
