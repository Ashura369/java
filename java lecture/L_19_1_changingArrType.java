import java.util.ArrayList;

public class L_19_1_changingArrType {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<String> list2 = new ArrayList<String>();
        

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        list2.add("1");
        list2.add("2");
        list2.add("3");
        list2.add("4");
        list2.add("5");


        // integer to string
        ArrayList<String> changeString = new ArrayList<String>();
        for (int num : list1) {                    // here we stored each element of list1 into num
            changeString.add(String.valueOf(num)); // here we converted each elements of num into string
        }

                // for each is loop can be used with any class that implements the iteratable interface (Array, ArrayList, LinkedList, HashSet, TreeSet, LinkedHashSet, Vector, Stack, PriorityQueue, ArrayDeque, CopyOnWriteArrayList, CopyOnWriteArraySet)

        System.out.println("int to string : "+changeString);

        
        System.err.println("**********************************************");
        System.out.println();

        // string to integer
        ArrayList<Integer> changeIntegr = new ArrayList<Integer>();
        for (String str : list2) {
            changeIntegr.add(Integer.valueOf(str));  // you can also use "changeIntegr.add(Integer.parseInt(str));"
        }

        System.out.println("string to int : "+changeIntegr);


    }
}
