// fixing disorted and recurring arr


import java.util.*;

public class a_0error {
    public static void main(String[] args) {
        StringBuilder sc = new StringBuilder("Namaste");

        for (int i = 0; i < sc.length() / 2; i++) {
            int front = i;
            int back = sc.length() - 1 - i;

            char frontChar = sc.charAt(back);
            char backChar = sc.charAt(front);

            sc.setCharAt(backChar, frontChar);
        }

        System.out.println(sc);
        System.out.println();
    }   

}