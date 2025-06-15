// Calculate average of all the elements in an array


public class a_7_13 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int sum=0;

        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }

        double average= sum/arr.length;

        System.out.println("the average = "+ average);


    }
}
