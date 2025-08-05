// removing duplicate integers


import java.util.*;
public class a_14_1_remocingDuplicateIntegers {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 3, 5, 1, 6};
        HashSet<Integer> num = new HashSet<>();

        System.out.println("r1");   
        System.out.println(r1(arr, 0, num));
        System.out.println("\n r2");   
        System.out.println(r2(arr, 0, num));
    }

    public static Set<Integer> r1(int[] a, int idx, Set<Integer> num) {
        if (idx == a.length) {
            return num;
        }
        
        if (! num.contains(a[idx])) {
            num.add(a[idx]);
        }

        return r1(a, idx+1, num);

    }
    public static Set<Integer> r2(int[] a, int idx, Set<Integer> num) {
        if (idx == a.length) {
            return num;
        }
        
        num.add(a[idx]); // there is no need to write the logic like the r1, bcoz hash set automatically will keep adding the unique numbers and remove the repeating numbers

        return r2(a, idx+1, num);

    }
}
