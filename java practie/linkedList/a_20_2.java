package linkedList;
class node{
        String data;
        node next;

        node(String data){
            this.data = data;
            this.next = null;
        }
    }

    
    // we hade to put everything inside the class a_20_2, bcoz you can't put all the methods (node head;, addFirst(), addLast(), etc.) in the open air without any class, then must belong to a class.

    // you can also make a new class and put then inside that class, also have to make the changes in the "name list = new name();" in the a_20_1 file

    // below the example of how its done, if you want to use the below then uncomment it an put comment on all that is inside the a_20_2

    class linkList{
        node head; // head = at the beginning

        // add first
        void addFirst(String data){
            node newNode = new node(data);
            if(head == null){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        // add last
        void addLast(String data){
            node newNode = new node(data);
            if (head == null) {
                head = newNode;
                return;
            }

            node currNode = head;
            while (currNode.next != null){
                currNode = currNode.next;
            }
            currNode.next = newNode;
        }

        void printList(){
            if (head == null) {
                System.out.println("list is empty");
                return;
            }
            node currNode = head;
            while (currNode != null){
                System.out.print(currNode.data + " --> ");
                currNode = currNode.next;
            }
            System.out.println("Null");
        }
    }

   

public class a_20_2 {
    // node head;

    // // add first
    // void addFirst(String data){
    //     node newNode = new node(data);
    //     if(head == null){
    //         head = newNode;
    //         return;
    //     }
    //     newNode.next = head;
    //     head = newNode;
    // }

    // // add last
    // void addLast(String data){
    //     node newNode = new node(data);
    //     if (head == null) {
    //         head = newNode;
    //         return;
    //     }

    //     node currNode = head;
    //     while (currNode.next != null){
    //         currNode = currNode.next;
    //     }
    //     currNode.next = newNode;
    // }

    // void printList(){
    //     if (head == null) {
    //         System.out.println("list is empty");
    //         return;
    //     }
    //     node currNode = head;
    //     while (currNode != null){
    //         System.out.print(currNode.data + " --> ");
    //         currNode = currNode.next;
    //     }
    //     System.out.println("Null");
    // }
}
