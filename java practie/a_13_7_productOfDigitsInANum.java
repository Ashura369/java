// printing the product of all the digits in a num

public class a_13_7_productOfDigitsInANum {
    public static void main(String[] args) {
        System.out.println("r1 : " + r1(4562));
        System.out.println();
        System.out.println("r2 : " + r2(4562));
    }

    public static int r1(int n) {
        if (n < 1) {
            return 1;
        }

        int a = n % 10; // finding the remainder
        int b = n / 10; // getting the remaining digits as num

        int result = a * r1(b);
        return result;


        /*
        
            r1(4562)
            └── a = 4562 % 10 = 2
                b = 4562 / 10 = 456
                result = 2 * r1(456)

                    r1(456)
                    └── a = 456 % 10 = 6
                        b = 456 / 10 = 45
                        result = 6 * r1(45)

                            r1(45)
                            └── a = 45 % 10 = 5
                                b = 45 / 10 = 4
                                result = 5 * r1(4)

                                    r1(4)
                                    └── a = 4 % 10 = 4
                                        b = 4 / 10 = 0
                                        result = 4 * r1(0)

                                            r1(0)
                                            └── Base case hit: return 1
                                        result = 4 * 1 = 4
                                result = 5 * 4 = 20
                        result = 6 * 20 = 120
                result = 2 * 120 = 240
        */
    }
    

    public static int r2(int n) {
        if (n % 10 == n) {
            return n;
        }

        int ans = (n % 10) * r2(n / 10);
        return ans;
    }
}
