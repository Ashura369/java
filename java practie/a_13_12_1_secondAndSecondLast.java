// print the second occurance of a, and the second last occurance of a

public class a_13_12_1_secondAndSecondLast {
    public static void main(String[] args) {
        String ltrs = "abcdalfgaahhiseao";
        char target = 'a';
        r1(ltrs, 0, target, -1, -1, -1, -1, 0);
    }
    public static void r1(String ltrs, int idx, char target, int first, int secA, int last, int secLast, int count) {
        
        if (idx == ltrs.length()) {
            System.out.println("First occurrence of 'a': " + first);
            System.out.println("Second occurrence of 'a': " + secA);
            System.out.println("Second last occurrence of 'a': " + secLast);
            System.out.println("Last occurrence of 'a': " + last);
            return;
        }

        char crrChar = ltrs.charAt(idx);
        if (crrChar == target) {
            count++; // increase count each time we see 'a'
            if (count == 1) {
                first = idx;
            }else if(count == 2){
                secA = idx;
            }

            secLast = last;
            last = idx;
        }

        r1(ltrs, idx + 1, target, first, secA, secLast, last, count);
    }
}
