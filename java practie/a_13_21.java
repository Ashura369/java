// FROM HERE ON OUT THERE WILL BE ONLY ADVANCED FORM OF QS FOR RECURSION

// print all permutations of a string

public class a_13_21 {
    public static void main(String[] args) {
        String str = "abc";
        r1(str, 0, ' ');
        // System.out.println(r1(str, 0, ' '));
    }

    public static void r1(String str, int idx, char ans) {
        if (idx == str.length()) {
            return;
        }


        char n = str.charAt(idx);
        // System.out.println(n);

        for (int i = 0; i < str.length(); i++) {
            r1(str, idx+1, ans);
        }


    }
}
