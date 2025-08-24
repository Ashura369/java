package linkedList;

public class a_20_1 {
        
    public static void main(String[] args) {
        linkList list = new linkList();

        list.printList();
        System.out.println("*********************************");        
        list.addFirst("D");
        System.out.println("*********************************");
        list.printList();

        list.addFirst("C");
        System.out.println("*********************************");
        list.printList();        

        list.addFirst("B");
        System.out.println("*********************************");
        list.printList();        

        list.addLast("E");
        System.out.println("*********************************");
        list.printList();

        System.out.println("*********************************");
        list.printList();        

        System.out.println("*********************************");
        list.addFirst("A");
        list.printList();
        
        System.out.println("*********************************");
        list.deleteFirst();
        list.printList();
        
        System.out.println("*********************************");
        list.deleteLast();
        list.printList();
        
        System.out.println("*********************************");
        System.out.println("The size of the list is : "+list.size());



    }    
}
