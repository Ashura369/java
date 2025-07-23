// print all the string characters one by one
// print all the string characters in reverse

public class a_13_11_stringInRecursion {
    public static void main(String[] args) {
        String a = "abcdef";
        // System.err.println(a.length());
        r1(a, 0);
        System.err.println();
        int lastDigit = a.length()-1;
        r2(a, lastDigit);
        System.err.println();

    }

    public static String r1(String a, int idx) {
        if (idx == a.length()-1) { // (idx == a.length()) --> if you write this the index will go out of the bounds 
            System.err.println("THE CHARACTER AT INDEX "+ idx +" is "+ a.charAt(idx));
            return a;
        }

        System.err.println("THE CHARACTER AT INDEX "+ idx +" is "+ a.charAt(idx));
        String elements = r1(a, idx+1);
        return elements;
    }

    public static String r2(String a, int lastDigit) {
        if (lastDigit < 0) {
           return a; 
        }

        System.err.println("THE CHARACTER AT INDEX "+ lastDigit +" is "+ a.charAt(lastDigit));
        String reverse = r2(a, lastDigit-1);
        return reverse;
    }
}
