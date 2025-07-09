public class a_9_1_1 {
    public static void main(String[] args) {
        StringBuilder sc = new StringBuilder("Namaste");

        for (int i = 0; i < sc.length() / 2; i++) {
            int front = i;
            int back = sc.length() - 1 - i;

            char frontChar = sc.charAt(front);
            char backChar = sc.charAt(back);

            sc.setCharAt(front, backChar);
            sc.setCharAt(back, frontChar);
        }

        System.out.println(sc);


    }
}
