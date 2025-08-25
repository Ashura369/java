package linkedList;
// making a integer based linkList

public class a_20_3 {
    public static void main(String[] args) {
        lists l1 = new lists();
        
        l1.add(1);
        l1.print();
        System.out.println("***************************");
        
        l1.add(2);
        l1.print();
        System.out.println("***************************");
        
        l1.add(3);
        l1.print();
        System.out.println("***************************");
        
        l1.addFirst(0);
        l1.print();
        System.out.println("***************************");
        
        l1.addLast(6);
        l1.print();
        System.out.println("***************************");

        // ****************************************************

        node2 l2 = new node2(22); // here i put data into the objects
        node2 l3 = new node2(33);
        node2 l4 = new node2(44);
        node2 l5 = new node2(55);
        node2 l6 = new node2(66);
        node2 l7 = new node2(77);
        node2 l8 = new node2(88);

        l2.next = l3;                   // here i linked one object with the another
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        l6.next = l7;
        l7.next = l8;

        // printing the entire list in l1, without using the print() method that i have created
        
        System.out.println("Printing the l1 list without using the print() function");
        node2 temp = l1.head;
        while (temp.next != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");


        /*
            We can't print the l1 by doing the below 
            
            System.out.println(l1.data);

            This is bcoz l1 is a list now, and it doesn't have any data field

        */

        
        System.out.println("**********************************************");
        
        System.out.println("l2.data = " + l2.data); 
        // prints: l2.data = 22

        System.out.println("l2.next.data = " + l2.next.data); 
        // l2.next → l3, so prints: l2.next.data = 33

        System.out.println("l3.next.data = " + l3.next.data); 
        // l3.next → l4, so prints: l3.next.data = 44

        System.out.println("l4.next.data = " + l4.next.data); 
        // l4.next → l5, so prints: l4.next.data = 55

        System.out.println("l5.next.data = " + l5.next.data); 
        // l5.next → l6, so prints: l5.next.data = 66

        System.out.println("l6.next.data = " + l6.next.data); 
        // l6.next → l7, so prints: l6.next.data = 77

        System.out.println("l7.next.data = " + l7.next.data); 
        // l7.next → l8, so prints: l7.next.data = 88
    
        System.out.println("**********************************************");

        
    }
}
