// printing the string in reverse

public class a_13_10_printingStringInReverse {
    public static void main(String[] args) {
        String str = "abcd";
        int idx = str.length()-1;
        r1(str, idx);

        
        System.out.println(r2(str, idx));
    }

    public static void r1(String str, int idx) {
        if (idx == 0) {
            System.out.println(str.charAt(idx));
            return;
        }

        System.out.println(str.charAt(idx));
        r1(str, idx-1);
    
    }
    public static String r2(String str, int idx) {
        if (idx == 0) {
            String a = String.valueOf(str.charAt(0)); // returns the last value
            return a;
        }

        return str.charAt(idx) + r2(str, idx - 1);
    }
}
