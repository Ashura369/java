// make an array and take numbers as an input, and find the repetation of each number
import java.util.*;
public class a_7_10_findingTheRepetation {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF ELEMENTS YOU WANT : ");
        int size = input.nextInt(); //entering the size
        int[] arr = new int[size];
        
        // taking input
        for (int i = 0; i < size; i++) {
            System.out.print("ENTER ELEMENT "+(i+1)+" OF THE ARRAY : ");
            arr[i] = input.nextInt();
        }

        // finding the maximum value to size the size of the arrray
        int max=arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int[] freq = new int[max+1];

                    /*
                        Why do we need to find the maximum value?
                        When you want to count the frequency of each number in the array using another array (like freq), you typically create a frequency array with a size large enough to store counts for all possible numbers in your data.

                        For example, if your array has {1, 3, 5, 8, 9}, the largest number is 9.
                        So, you need a freq array of size 10 (to cover indices 0 through 9).

                        If you don't know what the largest number is, you might waste memory (by making the array too big) or risk an error (if it's too small).
                    */

        // countinng the frequencies
        for (int i = 0; i < size; i++) {
            freq[arr[i]]++;
        }

            /*
            or you can also write -->
            
                int value = arr[i]; 
                freq[value] = freq[value] + 1;
            */

        // printing the frequencies of numbers
        for (int i = 0; i <= max; i++) {
            if (freq[i] > 0) {
                System.out.println("FREQUENCY OF "+i+" IS: "+freq[i]);
            }
        }

            
    }
}
