import java.util.Arrays;

public class a_9_0_anagram {
    public static void main(String[] args) {
        String str1 = "School master";
        String str2 = "The classroom";

        if (isAnagram(str1, str2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are NOT anagrams.");
        }
    }

    public static boolean isAnagram(String s1, String s2) {
        // Remove spaces and convert to lowercase
        s1 = s1.replaceAll("\\s", "").toLowerCase(); // \\s is a regular expression that matches spaces, tabs, etc
        s2 = s2.replaceAll("\\s", "").toLowerCase();

        // If lengths are not equal, they can't be anagrams
        if (s1.length() != s2.length()) {
            return false;
        } 

        // Convert strings to char arrays
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        // Sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare sorted arrays
        return Arrays.equals(arr1, arr2);
    }
}
