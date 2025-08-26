package queue;
// Queue using array

public class a_21_0 {
    public static void main(String[] args) {
        Queue q = new Queue(5);

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

    }
}
