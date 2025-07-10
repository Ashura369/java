import java.util.Arrays;
import java.util.StringTokenizer;

public class a_9_8_splittingTheStringBySpaces {
    public static void main(String[] args) {
        String input = "Hello world this is Java";
        String[] words = input.split(" ");

        for (String word : words) {
            System.out.println(word);
        }
        better(); // doing the same with the help of the method
    }

    public static void better() {
        String input = "Hello world this is Java";
        StringTokenizer tokenizer = new StringTokenizer(input);

        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
    }
}
