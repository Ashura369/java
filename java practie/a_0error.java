// logarithm
import java.util.*;
public class a_0error {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF ELEMENTS YOU WANT IN YOUR ARRAY : ");
        int n = input.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        r1(arr, 0);
    }

    // Recursive logarithm
    public static void r1(int[] arr, int idx) {
        if (idx == arr.length) {
            return;
        }

        System.out.print(arr[idx] + " ");

        r1(arr, idx+1);



    }
}
