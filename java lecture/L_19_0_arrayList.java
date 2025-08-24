// learning arrayList
// arrayList only stored objects

import java.util.ArrayList; // whenever you want to use array list you have to import this package. Or you can always use this "import java.util.*;"
import java.util.Collections;

// "import java.util.*;" -- when you use this it will unnecessarily import all the packages, resualting in heavy memory usage


public class L_19_0_arrayList {
    
    public static void main(String[] args) {
        // ArrayList<variableType> list = new ArrayList<>(); [SYNTAX]

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list1_1 = new ArrayList<Integer>();

        ArrayList<String> list2 = new ArrayList<String>();
        ArrayList<Boolean> list3 = new ArrayList<Boolean>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        list1_1.add(6);
        list1_1.add(7);
        list1_1.add(8);
        list1_1.add(9);
        list1_1.add(10);

        list2.add("Hello");
        list2.add("Hii");
        list2.add("Namaste");
        list2.add("Pranam");

        list3.add(true);
        list3.add(false);

        // to print the output
        System.out.println("This is integer arrayList : "+list1); // it will print all the numbers stored inside list1 
        System.out.println();
        
        // to print the list along with the index
        for (int i = 0; i < list1.size(); i++) {
            System.out.println("The number at index "+i+" is "+list1.get(i));  // you cannot use list1.length or list1[i] with an ArrayList. Those are used for arrays, not for ArrayLists.
        } 
        
        System.err.println("**********************************************");
        System.out.println();
        
        System.out.println("This is string arrayList : "+list2);

        for (int i = 0; i < list2.size(); i++) {
            System.out.println("The string at index "+i+" is "+list2.get(i));  
        } 

        System.err.println("**********************************************");
        System.out.println();

        System.out.println("This is string arrayList : "+list3);

        for (int i = 0; i < list3.size(); i++) {
            System.out.println("The bool at index "+i+" is "+list3.get(i));  
            
        } 

        System.err.println("**********************************************");
        System.out.println();

        int element = list1.get(0);
        System.out.println(element);
        System.out.println(list1.get(0));

        System.err.println("**********************************************");
        System.out.println();

        // adding element in  between
        list1.add(1, 11); // here we have added 11 at index 1
        System.out.println(list1);

        System.err.println("**********************************************");
        System.out.println();

        // set element - changing an alredy existing element into a new element
        list1.set(2, 22); // here we changed alredy existing element 2 into 22, at index 2 
        System.out.println(list1);

        System.err.println("**********************************************");
        System.out.println();

        // delete element
        list1.remove(5); // removed the fifth element from the list
        System.out.println(list1);

        System.err.println("**********************************************");
        System.out.println();

        // ArrayName.size() -- to know the size of the array element
        int size = list1.size();
        System.out.println(list1.size());
        System.out.println(size);

        System.err.println("**********************************************");
        System.out.println();

        // sorting the array
        // REMEMEBER TO USE THIS SORTING YOU HAVE TO IMPORT (import java.util.Collections;) AT THE BEGINNING OF THE CODE

        Collections.sort(list1); // sorting ascending order
        System.out.println(list1);

        Collections.sort(list1, Collections.reverseOrder()); // sorting in descending order
        System.out.println(list1);

        System.err.println("**********************************************");
        System.out.println();

        // printing the ascending arrayList by storing them in a variable
        ArrayList<Integer> ascending = new ArrayList<Integer>(list1); // ascending order
        Collections.sort(ascending);
        System.out.println(ascending);
        
        ArrayList<Integer> descending = new ArrayList<Integer>(list1); // descending order
        Collections.sort(descending, Collections.reverseOrder());
        System.out.println(descending);

        System.err.println("**********************************************");
        System.out.println();

        // combining two array list of similar types (integer + integer)
        ArrayList<Integer> combine = new ArrayList<Integer>(list1); // here it tool all the list1 elements into combine
        combine.addAll(list1_1);    // here it took all the list1_1 elements into combine (which already holds all the list1 elements), when you are combining two array lists you have to use "addAll"
        System.out.println(combine);

            // just like "addAll", there is also another fucntion called "removeAll"

        // combiing a specific element from an array into a already existing array
        combine.add(list1_1.get(4));
        System.out.println(combine);        

    }


}
