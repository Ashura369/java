public class a_0error {
    // printing second and second last 

    public static void main(String[] args) {
        // int x = 0;
        int[] arr = {1,3,6,2,4,2,5,9};
        
    }

    public static void r1(String n, int idx, char target, int count, int first, int secF, int secL, int last) {
       if (idx == n.length()) {
            System.out.println(first);
            System.out.println(secF);
            System.out.println(secL);
            System.out.println(last);
            return;
       }

        if (n.charAt(idx) == target) {
            count ++;
            if (count == 1) {
                first = idx;
            } else if (count == 2) {
                secF = idx;
            }

            secL = last;
            last = idx;
        }

        r1(n, idx+1, target, count, first, secF, secL, last);

    }

        
}