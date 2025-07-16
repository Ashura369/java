// sum of all the elements in the arr

public class a_6_4_sumOfElemetsInTheArr {
    public static void main(String[] args) {
        sum();
    }

    public static int sum(){
        int[] arr = {1,2,3,4,5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.err.println(sum);
        return sum;
    }
}
