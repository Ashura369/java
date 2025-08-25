package linkedList;
class node{
        String data;
        node next;

        node(String data){
            this.data = data;
            this.next = null;
            // ❌ size++;   // ERROR: size belongs to linkList, not node
        }
    }

    
    // we hade to put everything inside the class a_20_2, bcoz you can't put all the methods (node head;, addFirst(), addLast(), etc.) in the open air without any class, then must belong to a class.

    // you can also make a new class and put then inside that class, also have to make the changes in the "name list = new name();" in the a_20_1 file

    // below the example of how its done, if you want to use the below then uncomment it an put comment on all that is inside the a_20_2

    class linkList{
        node head; // as head is not assigned anything here, so it automatically becomes "null"
        private int size;

        linkList(){
           this.size = 0;
        }


        // add first
        void addFirst(String data){
            node crrElement = new node(data);
            size++;
            if(head == null){
                head = crrElement;
                return;
            }
            crrElement.next = head;    
            head = crrElement;         
        }

        // add last
        void addLast(String data){
            node crrElement = new node(data);
            size++;
            if (head == null) {
                head = crrElement;
                return;
            }

            node newElement = head;
            while (newElement.next != null){
                newElement = newElement.next;
            }
            newElement.next = crrElement;
        }

        void printList(){
            if (head == null) {
                System.out.println("list is empty");
                return;
            }
            
            node newElement = head;
            while (newElement != null){
                System.out.print(newElement.data + " --> ");
                newElement = newElement.next;
            }
            System.out.println("Null");
        }

        // delete  first
        void deleteFirst(){
            if (head == null) {
                System.out.println("The list is empty");
                return;
            }
            size--;
            head = head.next;
        }

        // delete last
        void deleteLast() {
            if (head == null) {
                System.out.println("The list is empty");
                return;
            }

            size--;  // decrease size

            if (head.next == null) {
                head = null;
                return;
            }

            node secondLast = head;
            node lastNode = head.next;

            while (lastNode.next != null) {
                lastNode = lastNode.next;
                secondLast = secondLast.next;
            }

            secondLast.next = null;
        }

        // return current size
        int size() {
            return size;
        }
    }

   

public class a_20_2 {
    // node head;

    // // add first
    // void addFirst(String data){
    //     node a = new node(data);
    //     if(head == null){
    //         head = a;
    //         return;
    //     }
    //     a.next = head;
    //     head = a;
    // }

    // // add last
    // void addLast(String data){
    //     node a = new node(data);
    //     if (head == null) {
    //         head = a;
    //         return;
    //     }

    //     node b = head;
    //     while (b.next != null){
    //         b = b.next;
    //     }
    //     b.next = a;
    // }

    // void printList(){
    //     if (head == null) {
    //         System.out.println("list is empty");
    //         return;
    //     }
    //     node b = head;
    //     while (b != null){
    //         System.out.print(b.data + " --> ");
    //         b = b.next;
    //     }
    //     System.out.println("Null");
    // }
}
