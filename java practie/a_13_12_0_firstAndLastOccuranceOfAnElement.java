// print the first and last occurance of an element of a letter (e.g. "a") in a string using recursion

public class a_13_12_0_firstAndLastOccuranceOfAnElement {
    public static void main(String[] args) {
        String ltrs = "abcdalfgaahhiseoa";
        char target = 'a';
        System.err.println("r1");
        r1(ltrs, 0, target, -1, -1);
        System.err.println("r2");
        r2(ltrs, 0, target, -1, -1);
    }

    public static void r1(String ltrs, int idx, char target, int first, int last) {
        if (idx == ltrs.length()) {
            System.out.println("First Occurrence: " + first);
            System.out.println("Last Occurrence: " + last);
            return;
        }

        if (ltrs.charAt(idx) == target) {
            if (first == -1) {
                first = idx;
            }
            last = idx;
        }

        r1 (ltrs, idx + 1, target, first, last);
    }

    public static void r2(String ltrs, int idx, char target, int first, int last) {
        if (idx == ltrs.length()) {
            System.out.println("First Occurrence: " + first);
            System.out.println("Last Occurrence: " + last);
            return;
        }

        char currCharacter = ltrs.charAt(idx);
        if (currCharacter == target) {
            if (first == -1) {
                first = idx;
            }else{
                last = idx;
            }
        }

        r2(ltrs, idx+1, target, first, last);
    }
}


