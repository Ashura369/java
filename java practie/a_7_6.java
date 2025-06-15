// Count even and odd numbers in an array

import java.util.*;

public class a_7_6 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int even = 0, odd = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] %2 == 0) {
                even++; // or you can write --> even = even + 1; / even+=1
            }else{
                odd++;
            }
        }

        System.out.println("even : "+even);
        System.out.println("odd : "+odd);

    }
}
