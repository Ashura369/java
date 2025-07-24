// move the letter "x" to the end of the string

public class a_13_14_movingTheLetters {
    public static void main(String[] args) {
        String str = "abcxoxlx";
        String str2 = "qczfxxvmyuhrokwaxnpbldexxtsagxjaixegtc";
        
        System.out.println("str : " + r1(str, 0));
        System.out.println("str2 : " + r1(str2, 0));
    }

    public static String r1(String str, int idx) {
        if (idx == str.length()) {
            return "";
        }

        char crr = str.charAt(idx);
        String rest = r1(str, idx+1); // this gives us the result of the recursive call on the rest of the string

        if (crr == 'x') {
            return rest + crr; // move x to end
        }else{
            return crr + rest; // keep in front
        }


        /*
            For str = abcxoxlx

            r1(8): curr = 'x' → return "" + 'x' → "x"
            r1(7): curr = 'l' → return 'l' + "x" → "lx"
            r1(6): curr = 'x' → return "lx" + 'x' → "lxx"
            r1(5): curr = 'p' → return 'p' + "lxx" → "plxx"
            r1(4): curr = 'o' → return 'o' + "plxx" → "oplxx"
            r1(3): curr = 'x' → return "oplxx" + 'x' → "oplxxx"
            r1(2): curr = 'c' → return 'c' + "oplxxx" → "coplxxx"
            r1(1): curr = 'd' → return 'd' + "coplxxx" → "dcoplxxx"
            r1(0): curr = 'a' → return 'a' + "dcoplxxx" → **"adcoplxxx"**
        */

    }
}
