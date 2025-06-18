// int only the positive numbers from an array

public class a_7_11_printingPositiveNums {
    public static void main(String[] args) {
        int[] arr = {-10, 5, 0, -3, 7, -1, 8, -6, 2, -4};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                System.out.println("NUMBER "+arr[i]+"  IS A POSITIVE NUMBER");
            }
        }
    }
}
