// learning Hash set
import java.util.*;
public class L_14_0_hashSet {
    public static void main(String[] args) {
        HashSet<String> fruits = new HashSet<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Banana"); // Duplicate, will be ignored

        // Printing the HashSet
        System.out.println("Fruits: " + fruits);

        // Check if an element exists
        System.out.println("Contains Apple? " + fruits.contains("Apple")); // true

        // Removing an element
        fruits.remove("Orange");

        // Set size
        System.out.println("Set size: " + fruits.size());

        // Iterating
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("*********************************");
        System.out.println("FIRST MAKING AN ARRAYLIST WITH DUPLICATES, AND THEN REMOVING THE DUPLICATES USING HASHSET");
        ArrayList<String> li = new ArrayList<>();
        li.add("A");
        li.add("B");
        li.add("C");
        li.add("D");
        li.add("E");
        li.add("F");
        li.add("E");
        li.add("F");
        li.add("F");
        
        System.out.println("ArrayList is : "+li);
        System.out.println("The size of the ArrayList is : "+li.size());
        
        HashSet<String> hash = new HashSet<>(li);
        System.out.println("The list after removing the duplicates : "+hash);
        System.out.println("The size of the HashSet is : "+hash.size());

        // so bascially this is the way how you use the hashset from an ArrayList to remove the duplicates. There can be other methods to use it, based on different scenarios.  
        
        System.out.println("*********************************");
    }
}
