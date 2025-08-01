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
    }
}
