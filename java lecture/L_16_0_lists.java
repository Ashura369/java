import java.util.*;

public class L_16_0_lists {
    // learning how to make lists in java
    // this will be much helpful for further codig
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>(); // storing elements through using array is the most common way of making a list
        List<String> fruits2 = new LinkedList<>();
        Set<String> fruits3 = new HashSet<>();
        Set<String> fruits4 = new TreeSet<>();
        Vector<String> fruits5 = new Vector<>();
        
        fruits.add("APPLE");
        fruits.add("BANANA");
        fruits.add("MANGO");
        fruits.add("PINEAPPLE");
        fruits.add("PAPAYA");

        // Copy data into other collections
        fruits2.addAll(fruits);
        fruits3.addAll(fruits);
        fruits4.addAll(fruits);
        fruits5.addAll(fruits);

        // Printing
        System.out.println("ArrayList : " + fruits);
        System.out.println("LinkedList: " + fruits2);
        System.out.println("HashSet   : " + fruits3); // No guaranteed order
        System.out.println("TreeSet   : " + fruits4); // Sorted order
        System.out.println("Vector    : " + fruits5);

    }
}
