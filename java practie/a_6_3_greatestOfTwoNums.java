// printing the greatest of two nums

public class a_6_3_greatestOfTwoNums {
    public static void main(String[] args) {
        greatest(3 , 5);
    }

    public static int greatest(int a, int b) {
        int n = 0;
        if (a > b) {
            n = a;
        }else{
            n = b;
        }

        System.err.println("THE GREATEST OF TWO NUMBERS IS : "+n);
        return n;
    }
}
