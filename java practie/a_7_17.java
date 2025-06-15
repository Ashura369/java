// finding frequency of array elements
public class a_7_17 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 5, 1, 9, 2, 4, 7, 8, 3, 1, 6, 5, 9, 4, 2, 6, 8, 7};
        boolean[] visited = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (!visited[i]) {
                int freq = 1;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        freq++;
                        visited[j] = true;
                    }
                }
                System.out.println("THE FREQUENCY OF ELEMENT " + arr[i] + " IS: " + freq);
            }
        }
    }
}
