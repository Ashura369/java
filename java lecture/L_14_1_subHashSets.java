// here i have created a main hashSet of "food", and under it there is other sub hashSet called "fruits, vegetables, and grains"


import java.util.HashSet;

public class L_14_1_subHashSets {
    public static void main(String[] args) {
         // Subcategories
        HashSet<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");

        HashSet<String> vegetables = new HashSet<>();
        vegetables.add("Carrot");
        vegetables.add("Spinach");

        HashSet<String> grains = new HashSet<>();
        grains.add("Rice");
        grains.add("Wheat");

        // Master food set that contains all subcategories as objects
        HashSet<HashSet<String>> food = new HashSet<>();
        food.add(fruits);
        food.add(vegetables);
        food.add(grains);

        // Printing the main food set
        System.out.println("Food items:");
        for (HashSet<String> category : food) {
            System.out.println(category);
        }

        /*
        Stack and Heap memory allocation --> 
         
        [STACK MEMORY]
        ---------------------------------------------------------
        | Variable     | Value                                   |
        |--------------|-----------------------------------------|
        | fruits       | → HashSet<String> ["Apple", "Banana"]   |
        | vegetables   | → HashSet<String> ["Carrot", "Spinach"] |
        | grains       | → HashSet<String> ["Rice", "Wheat"]     |
        | food         | → HashSet<HashSet<String>>              |
        ---------------------------------------------------------

                                    ▼

        [HEAP MEMORY]
        ---------------------------------------------------------------------
        | HashSet<HashSet<String>> (food)                                   |
        |-------------------------------------------------------------------|
        | Internal hash table (array of buckets)                            |
        |                                                                   |
        | [Bucket 1] → Reference to fruits set      → ["Apple", "Banana"]   |
        | [Bucket 2] → Reference to vegetables set  → ["Carrot", "Spinach"] |
        | [Bucket 3] → Reference to grains set      → ["Rice", "Wheat"]     |
        ---------------------------------------------------------------------

        [Each sub HashSet<String>]
        ---------------------------------------------
        | fruits     → ["Apple", "Banana"]           |
        | vegetables → ["Carrot", "Spinach"]         |
        | grains     → ["Rice", "Wheat"]             |
        ---------------------------------------------


        
        */
    
    }
}
