import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;


public class L_21_0_queue {
    public static void main(String[] args) {
        
        Queue<Integer> l1 = new LinkedList<>();
        
        l1.add(1);
        l1.add(2);
        l1.add(3);
        System.out.println(l1);
        System.out.println("***************************************");
        
        Queue<Integer> l2 = new LinkedList<>();
        l2.add(4);
        l2.add(5);
        l2.add(6);
        
        Deque<Integer> merged = new LinkedList<>(l1); // if you want to use add first and add last then you have to use "Deque" 
        merged.addAll(l2);
        System.out.println(merged);        
        System.out.println("***************************************");
        
        // addFirst and addLast
        merged.addFirst(0); // Adds 0 to the front
        merged.addLast(7);  // Adds 7 to the end

        System.out.println(merged); // View updated merged queue

        // REMEMBER YOU CAN'T INSERT AN ELEMENT IN BETWEEN USING QUEUE OR DEQUEUE, FOR THAT TO HAPPEN YOU HAVE TO USE LINKEDLIST
        System.out.println("***************************************");
        
        // converting a Deque into an arrayList
        ArrayList<Integer> arr = new ArrayList<>(merged);
        System.out.println(arr);        
        System.out.println("***************************************");


    }
}
