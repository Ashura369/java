package queue;

public class a_21_2_circularQueue {
    public static void main(String[] args) {
        // Circular Queue using array from a_21_1
        Queue2 cq = new Queue2(5);
        
        System.out.println("CIRCULAR QUEUE");
        // adding elements
        cq.add(10);
        cq.add(20);
        cq.add(30);
        cq.add(40);
        cq.add(50);
        cq.print();

        System.out.println("Peek: " + cq.peek());
        System.out.println("*********************************************");
        
        // removing first element
        System.out.println("Removing the first element: " + cq.removeFirst());
        cq.print();
        System.out.println("*********************************************");
        
        // removing another element from front
        System.out.println("Removing the first element: " + cq.removeFirst());
        cq.print();
        System.out.println("*********************************************");
        
        // adding element after removals (will wrap around)
        cq.add(60);
        cq.print();
        System.out.println("*********************************************");
        
        // removing last element
        System.out.println("Removing the last element: " + cq.removeLast());
        cq.print();
        System.out.println("*********************************************");

        // peek again
        System.out.println("Peek: " + cq.peek());
        cq.print();
        System.out.println("*********************************************");


    }
}
