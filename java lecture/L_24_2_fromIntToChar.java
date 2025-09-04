

public class L_24_2_fromIntToChar {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = b-a;
        System.out.println("The ans of c is : "+c);
        System.out.println("**************************");

        char ch1 = 'a';
        char ch2 = 'c';
        int diff = ch2 - ch1;
        char ans = (char) ('a' + diff - 1);
        char ans2 = (char) ('a' + diff);
        System.out.println("The difference of characters is : "+diff);
        System.out.println("The difference of characters is : "+ans);
        System.out.println("The difference of characters is : "+ans2);
    }

}