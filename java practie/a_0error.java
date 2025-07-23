// fixing disorted and recurring arr


import java.util.*;

public class a_0error {
    public static void main(String[] args) {
    
        String str = "jdanvabcababuuaabuabmh";
        char target = 'a';
        r1(str, target, 0, -1, -1, -1, -1, 0);
    }

    public static void r1(String str, char target, int idx, int first, int secFirst, int last, int secLast, int count) {
        if (idx == str.length()) {
            System.out.println("First occurrence of 'a': " + first);
            System.out.println("Second occurrence of 'a': " + secFirst);
            System.out.println("Second last occurrence of 'a': " + secLast);
            System.out.println("Last occurrence of 'a': " + last);
            return;
        }

        char crrChar = str.charAt(idx);
        if (crrChar == target) {
            count++;
            if (count == 1) {
                first = idx;
            }else if(count == 2){
                secFirst = idx;
            }

            secLast = last;
            last = idx;
        }


        r1(str, target, idx+1, first, secFirst, last, secLast, count);
    }
}