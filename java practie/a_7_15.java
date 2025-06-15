// merge two arrays into one array

public class a_7_15 {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8, 10};
        int merged = arr1.length + arr2.length;

        int[] newArr = new int[merged];

        // copying elements from arr1
        for (int i = 0; i < arr1.length; i++) {
            newArr[i] = arr1[i];
        }
        
        // copying elements from arr2
        for (int i = 0; i < arr2.length; i++) {
            newArr[arr1.length + i] = arr2[i];
        }

        System.out.println(newArr.length); //finds total elements in the array
        System.out.println(newArr.length - 1); //finds second last element in the array
        System.out.println(newArr[newArr.length - 1]); //finds last element of the array

        // the new array
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i]+" ");
        }
    }
}
