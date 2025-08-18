public class a_15_0 {
    // Given an integer N, print all binary strings of length N.

    public static void main(String[] args) {
        int n = 2;
        r1(n, "");
        System.out.println(r1(n, ""));
    }

    public static String r1(int n, String ans) {
        if (n == 0) {
            return ans + "\n";
        }

        String a = r1(n-1, ans + "0");
        String b = r1(n-1, ans + "1");
        return a + b;
    }
}
