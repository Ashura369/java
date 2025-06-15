public class a_7_9 {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,3,3,4,4,4,4,5,5,5,5,5,6,6,6,6,6,6};

        int n1=0;
        int n2=0;
        int n3=0;
        int n4=0;
        int n5=0;
        int n6=0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                n1++;
            }else if(arr[i]==2){
                n2++;
            }else if(arr[i]==3){
                n3++;
            }else if(arr[i]==4){
                n4++;
            }else if(arr[i]==5){
                n5++;
            }else if(arr[i]==6){
                n6++;
            }
        }

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        System.out.println(n5);
        System.out.println(n6);
        System.out.println("***********************************************************");

        process();
    }

    // here i created a new function as an alternative of the above code
    public static void process() {
        int[] arr = {1,2,2,3,3,3,4,4,4,4,5,5,5,5,5,6,6,6,6,6,6};

        int[] freq = new int[7]; // index 0 unused, index 1-6 store counts
                /*
                This creates another integer array freq with 7 elements (indices 0 to 6).
                Note: Index 0 is not used, so you store counts for 1 at freq[1], for 2 at freq[2], and so on, up to freq[6].
                */
        for (int num : arr) {
            freq[num]++;
        }
                /*
                This is an enhanced for-loop (also called a for-each loop).
                For each number (num) in arr, it increases the count at freq[num] by 1.
                For example, if num is 3, then freq[3]++ increments the count for the number 3.
                */

        for (int i = 1; i <= 6; i++) {
            System.out.println("Frequency of " + i + ": " + freq[i]);
        }
    }
}
