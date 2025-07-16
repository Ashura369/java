// Write a method that takes an integer and returns its square.

public class a_6_2_squareOfANum {
    public static void main(String[] args) {
        
        System.err.println(square(5));
        square2(6);
    }

    public static int square(int a) {
        int sq = a*a;
        return sq;
    }

    public static void square2(int b) {
        int sq = b*b;
        System.err.println(sq); 
    }
}
