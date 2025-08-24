import java.util.Collections;
import java.util.LinkedList;

public class L_20_2_mergingTwoLists {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        list2.add(6);
        list2.add(7);
        list2.add(8);
        list2.add(9);
        list2.add(10);

        // printing the list
        System.out.println("list1 : "+list1);
        System.out.println("list2 : "+list2);
        System.out.println("******************************************");
        
        // merging two lists
        list1.addAll(list2);
        System.out.println("The merged list1 + list2 : "+list1);
        System.out.println("******************************************");
        
        // printing the list in ascending or descending order
        Collections.sort(list1);
        System.out.println("Ascending order : "+list1);

        
        LinkedList<Integer> reverse = new LinkedList<>(list1); // here we stored the list1 in reverse
        Collections.sort(reverse, Collections.reverseOrder()); // here we reversed the entire "reverse"
        System.out.println("Reverse order : "+reverse);        
        System.out.println("******************************************");

        // declaring the list in a variable
        LinkedList<Integer> var = new LinkedList<>(list1);
        System.out.println("Printing the list through the variable : "+var);
        


    }
}