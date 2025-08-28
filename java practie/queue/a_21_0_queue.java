package queue;

public class a_21_0_queue{
    public static void main(String[] args) {
        // Queue using array from a_21_1
        Queue q = new Queue(5);
        
        System.out.println("QUEUE");
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.print();
        
        System.out.println("Peek: " + q.peek());
        System.out.println("*********************************************");
        
        System.out.println("Removing the first element: " + q.removeFirst());
        q.print();
        System.out.println("*********************************************");
        
        System.out.println("Removing the first element: " + q.removeFirst());
        q.print();
        System.out.println("*********************************************");
        
        q.add(60);
        q.print();
        System.out.println("*********************************************");
        
        System.out.println("Removing the last element: "+q.removeLast());
        q.print();
        System.out.println("*********************************************");
        
        System.out.println("Removing the selected element is "+q.remove(0));
        q.print();
        System.out.println("*********************************************");
        System.out.println();
        
        // ************************************************************************************************************************************************
        
    }
}
