// extracting a substring from a string

public class a_9_6_extractingSubstringFromTheString {
    public static void main(String[] args) {
        String sc = "My name is soldierBoy";

        // printing all the elements with their index number to know the place of each character
        for (int i = 0; i < sc.length(); i++) {
            System.err.println(i + " " + sc.charAt(i));
        }

        // priting the substring
        String a = sc.substring(11, 21); // without storing the substring into an object you can't print it
        System.err.println(a);

    }
}
