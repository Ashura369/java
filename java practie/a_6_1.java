// finding min of three numbers
import java.util.Scanner;

public class a_6_1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String ab=process(-5, 0, 1);
        System.err.println(ab);
    }

    public static String process(int a, int b, int c) {
        int min=Math.min(a, Math.min(b, c));
        return min+" is the minimum";
    }
}
