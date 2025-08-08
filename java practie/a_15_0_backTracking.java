public class a_15_0_backTracking {
    // print ABC height wise from smaller to taller
    // A = tallest
    // B = sec tallest
    // C = smallest
    // Start printing from CBA (smallest to tallest)


    public static void main(String[] args) {
        String str = "ABC";
        bTracking(str, "");
    }

    public static void bTracking(String str, String perm) {
        if (str.length() == 0) {
            System.out.println(perm);
            return;
        }

        int n = str.length() - 1;
        for (int i = n; i >= 0; i--) {
            String a = str.substring(0, i) + str.substring(i + 1);
            char crr = str.charAt(i);
            bTracking(a, perm + crr);
        }

    }
}
