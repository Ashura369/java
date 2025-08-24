// import java.util.*;
import java.util.LinkedList;

public class L_20_0_linkedList {
    public static void main(String[] args) {
        // Creating a LinkedList of Strings
        LinkedList<String> names = new LinkedList<>();

        // Adding elements
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        System.out.println("Initial LinkedList: " + names);
        System.out.println("******************************************");

        // Adding elements at specific positions
        names.addFirst("Zara");   // Add at beginning
        names.addLast("Mike");    // Add at end
        System.out.println("After adding first & last: " + names);
        System.out.println("******************************************");

        // Accessing elements (from index to elements)
        System.out.println("Third element : "+names.get(3));
        System.out.println("First Element: " + names.getFirst());
        System.out.println("Last Element: " + names.getLast());
        System.out.println("******************************************");
        
        // Accessing index (from elements to index)
        System.out.println("Index of Charlie : "+names.indexOf("Charlie"));
        System.out.println("Index of first element : "+names.indexOf(names.getFirst()));
        System.out.println("Index of last element : "+names.indexOf(names.getLast()));
        System.out.println("******************************************");

        // Removing elements
        names.remove("Bob");        // remove by value
        names.removeFirst();        // remove first element
        names.removeLast();         // remove last element
        System.out.println("After Removals: " + names);
        System.out.println("******************************************");

        // Iterating through LinkedList
        System.out.print("Iterating: ");
        for (String name : names) {
            System.out.print(name + " ");
        }
    }
}
