class node{
    int value;
    node next;
}


public class L_20_1 {
    public static void main(String[] args) {
         // Create nodes
        node l1 = new node();
        node l2 = new node();
        node l3 = new node();

        // Assign values
        l1.value = 1;
        l2.value = 2;
        l3.value = 3;

        // Link the nodes: l1 -> l2 -> l3 -> null
        l1.next = l2;
        l2.next = l3;
        l3.next = null;


        // using while loop to print
        node list = l1; // start from head
        while (list != null) {
            System.out.print(list.value + " -> ");
            list = list.next;
        }
        System.out.println("null"); // end of list


            /*
                for (node list = l1; list != null; list = list.next) {
                    System.out.print(list.value + " -> ");
                }

                System.out.println("null");
            */

            /*
                l1 (node)
                ├── value: 1
                └── next ──► l2 (node)
                            ├── value: 2
                            └── next ──► l3 (node)
                                            ├── value: 3
                                            └── next ──► null
            */


        // just remember these but remember these is already class exists in java like linkedList<integer> l1 = new linkedList<integer>();
        /*
            linkedList<integer> l1 = new linkedList<integer>();
            l1.add(1);
            l1.add(2);
            l1.add(3);
        */
    }
}





