import java.util.Set;

public class a_13_18_1 {
    public static void main(String[] args) {
        char a = 'a';
        char b = 'z';

        System.out.print(b-a);
    }

    public static void r1(String str, int idx, Set<Character> valueAvailable) {
        if (idx == str.length()) {
            
            System.out.print(valueAvailable+" ");
            return;
        }

        char crrElement = str.charAt(idx);

        if (! valueAvailable.contains(crrElement)) {
            valueAvailable.add(crrElement);
        }

        r1(str, idx+1, valueAvailable);

        // we can proceed with printing the output like this, but our main objective here is to print the output in string format
        // so we have to use the stringBuilder and append the values into it and then convert it back into a string and print the output


    }

    public static void r2(String str, int idx, StringBuilder sb, Set<Character> valueAvailable) {
        if (idx == str.length()) {
            System.out.print(sb+" ");
            return;
        }

        char crrElement = str.charAt(idx);

        if (!valueAvailable.contains(crrElement)) {
            valueAvailable.add(crrElement);
            sb.append(crrElement);
        }

        r2(str, idx+1, sb, valueAvailable);


    }
}
