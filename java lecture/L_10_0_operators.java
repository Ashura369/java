// learning unary operators

public class L_10_0_operators {
    public static void main (String[] args) {
        // post-increament
        int a = 10;
        int b = 0;

        b = a++;
        System.out.println("a: "+a);
        System.out.println("b: "+b);

        System.out.println();
        postIncreament();
        System.out.println();
        preDecreament();
        System.out.println();
        postDecreament();
    }

    public static void postIncreament () {
        // pre-increament
        int a = 10;
        int b = 0;

        b = ++a;
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }
    public static void preDecreament () {
        // pre-decreament
        int a = 10;
        int b = 0;

        b = --a;
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }
    public static void postDecreament () {
        // post-decreament
        int a = 10;
        int b = 0;

        b = a--;
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }
}
