// learning HashMap

import java.util.HashMap; // to use HashMap you need to import HashMap first
import java.util.LinkedHashMap;
import  java.util.Set;
import java.util.TreeMap;

class p{
    static String printStar(){
        return "************************************";
    }
}


public class L_23_0_hashMap{
    

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // put - to add
        map.put("India", 100);
        map.put("China", 200);
        map.put("Russia", 500);
        System.out.println(map);            // REMEMBER HASHMAPS ARE UNORDERED LISTS, HENCE THEY WILL BE PRINTED IN UNORDERED WAY 
        System.out.println("************************************");
        map.put("China", 200);
        System.out.println(map);            // duplicates  will never be addded into HashMaps
        System.out.println("************************************");
        map.put("China", 180);
        System.out.println(map);            // but if i keep the key name same, and just change the value then the value corresponding to the key will be updated
        System.out.println("************************************");
        
        // containsKey - to search for a key (not for the value assigned to it)
        System.out.println(map.containsKey("China")); 
        System.out.println(map.containsKey(180)); 

        if (map.containsKey("India")) {
            System.out.println("KEY IS PRESENT");
        }else{
            System.out.println("KEY IS NOT PRESENT");
        }
        System.out.println("************************************");
        
        // containsValue - to search for a value (not for the key it was assigned to)
        System.out.println(map.containsValue("China"));
        System.out.println(map.containsValue(180));
        
        if (map.containsKey(100)) {
            System.out.println("VALUE IS PRESENT");
        }else{
            System.out.println("VALUE IS NOT PRESENT");
        }
        System.out.println("************************************");
        
        // get - to get the value of a specific key        
        System.out.println(map.get("India"));       // it will print the value of India
        System.out.println(map.get("Indonesia"));   // will print null
        System.out.println(map.get(100));           // doesn't work on values
        System.out.println("************************************");
        
        // entrySet() - entrySet() is a method that returns a Set view of all the entries in the map.
        System.out.println("entrySet: "+map.entrySet());
        System.out.println("************************************");

        
        // iterating through each element - for this you have to use forEach loop
        for (HashMap.Entry<String, Integer> e: map.entrySet()) {
            System.out.println("KEY: "+e.getKey()+", VALUE: "+e.getValue());
        }
        System.out.println("************************************");
        
        // iterating through each element - using set
        Set<String> keys = map.keySet();                // to use Set here you have to import it first, then you will be able to use it
        for (String key : keys) {
            System.out.println(key+": "+map.get(key));
        }
        System.out.println("************************************");
        
        // remove - to remove a key from the map
        map.remove("China");
        System.out.println(map);
        System.out.println("**************************************************************************");
        System.out.println();
        System.out.println();
        System.out.println();
        
        
        
        
        // if you want to print the HashMap in an ordered way, then there are several ways to do so
        // LinkedHashMap
        LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();
        map2.put("Banana", 10);
        map2.put("Apple", 20);
        map2.put("Orange", 30);
        map2.put("Mango", 40);
        
        System.out.println(map2);
        System.out.println();
        
        Set<String> key1 = map2.keySet();
        for (String a : key1) {
            System.out.println(a+", "+map2.get(a));
        }
        
        System.out.println("************************************");
        
        
        // TreeMap
        TreeMap<String, Integer> map3 = new TreeMap<>();
        map3.put("Banana", 10);
        map3.put("Apple", 20);
        map3.put("Orange", 30);
        map3.put("Mango", 40);
        
        System.out.println(map3);
        System.out.println();
        
        Set<String> key2 = map3.keySet();
        for (String b : key2) {
            System.out.println(b+", "+map3.get(b));
        }
        System.out.println("************************************");
        System.out.println(p.printStar());
        System.out.println(p.printStar());
        
    }
}