import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class L_21_1 {
    public static void main(String[] args) {
        
        // ---------------- Queue Example ----------------
        // Queue<Integer> q = new LinkedList<>();

        // // Enqueue (add elements)
        // q.add(10);
        // q.add(20);
        // q.add(30);
        // q.add(40);
        // q.add(50);
        // q.add(60);
        // q.add(70);

        // System.out.println("Printing the Queue : " + q);
        // System.out.println("***************************************");

        // // Front element (peek)
        // System.out.println("(peek) The very first element of the queue : " + q.peek());
        // System.out.println("***************************************");

        // // Dequeue (remove from front)
        // q.remove(70);       // when you pass an argument (element to be removed), only that specific element will be removed
        // System.out.println("Queue after removing the element : " + q);
        // System.out.println("***************************************");

        // q.remove();            // when you don't pass an argument, the very first element fromt the queue will be removed
        // System.out.println("Queue : "+q);
        // System.out.println("***************************************");

        // q.remove();
        // System.out.println("Queue : "+q);
        // System.out.println("***************************************");

        
        // // removing the specific element by putting the index number
        //     // to do so you first have to convert a queue into a list and then convert it back into a queue
        
        // List<Integer> list = new ArrayList<>(q);
        
        // list.addFirst(0);               // although there already is peek to add element to the vary first queue, but this also is a way to do so
        // list.add(1, 10);    // you can't directly add element into the mid of the queue, bcoz it follows the principle of FIFO (first in first out), hence to do so you first have to convert it into a list, and then you can add element into it
        // list.add(2, 20); 
        // System.out.println(list);
        
        // int removed = list.remove(3);   // to remove an element from the mid of it, you first have to convert it into a list

        // System.out.println("The removed number is : "+removed); 

        // q = new LinkedList<>(list);
        // System.out.println("The new Queue is : "+q);

        // System.out.println();
        System.out.println("*******************************************************************************************");
        System.out.println();


        

        // ---------------- Deque Example ----------------
        Deque<Integer> dq = new ArrayDeque<>();

        // Add elements at both ends
        dq.add(100);
        dq.add(200);
        dq.add(300);
        dq.add(400);
        dq.add(500);
        dq.addFirst(50);
        dq.addLast(1000);

        System.out.println("Deque: " + dq);
        System.out.println("***************************************");
        
        // Access front and rear
        System.out.println("Front element: " + dq.peekFirst());             // you can't directly access any specific element in the Deque, that is a very limitation of it. But if you really want to access a specific element, then you can do so by changing the Deque into a list and changing it back into the Deque
        System.out.println("Rear element: " + dq.peekLast());
        System.out.println("***************************************");
        
        // Remove elements from both ends
        System.out.println("Removed from front: " + dq.pollFirst());
        System.out.println("Removed from rear: " + dq.pollLast());
        System.out.println("***************************************");
        
        System.out.println("Deque after removals: " + dq);
        System.out.println("***************************************");
        
        // size
        System.out.println("The size of the Dque is : "+dq.size());
        System.out.println("***************************************");

        // removing the specific elements
        Deque<Integer> remove = new ArrayDeque<>(dq);
        remove.remove(100);
        System.out.println(remove);

        // removing all the elemetns 
        remove.clear();
        System.out.println(remove);




        
    }
}
