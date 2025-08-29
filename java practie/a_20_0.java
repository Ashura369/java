class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class lists {
    Node head;
    // private int tail = -1;
    
    void addFirst(int data){
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
            return;
        }

        temp.next = head;
        head = temp;
    }

    void addLast(int data){
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
            return;
        }
        
        Node temp2 = head;
        while (temp2.next != null) {
            temp2 = temp2.next;
        }
        temp2.next = temp;
    }

    void size(){
        int count = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        System.out.println(count);
    }

    void print(){
        if (head == null) {
            System.out.println("The queue is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    void contains(int data){
        if (head == null) {
            System.out.println("The queue is empty");
            return;
        }

        Node temp2 = head;
        while (temp2 != null) {
            if (temp2.data == data) {
                System.out.println("The value you have entered "+data+" exists");
                return;
            }
            
            temp2 = temp2.next;
        }
        System.out.println("The value you have entered "+data+" doesnot exists");              

    }

    int deleteFirst(){
        if (head == null) {
            System.out.println("The queue is empty");
            return -1;
        }
        int a = head.data;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            break;
        }

        head = temp;
        return a;
    }

    int deleteLast() {
        if (head == null) {
            System.out.println("The list is empty");
            return -1;
        }
        if (head.next == null) {  // only one node
            int a = head.data;
            head = null;
            return a;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        int a = temp.next.data;
        temp.next = null;
        return a;
    }

    void insert(int data, int position) {
        if (position == 0) {
            addFirst(data);     // this here is a smart move to call the addFirst functrion, remember it
            return;
        }

        Node temp = head;
        for (int i = 0; i < (position - 1) && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of range");
            return;
        }

        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    void reverse(){
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }

        Node prev = null;
        Node crr = head, next;

        while (crr != null) {
            next = crr.next;
            crr.next = prev;
            prev = crr;
            crr = next;
        }
        head = prev;
    }
}


public class a_20_0 {
    public static void main(String[] args) {
        lists l = new lists();
        l.addLast(20);
        l.addLast(30);
        l.addLast(40);
        l.addFirst(10);

        l.print();
        l.size();
        l.contains(50);
        l.contains(0);
        System.out.println("The deleted value is : "+l.deleteFirst());
        l.print();
        System.out.println("The deleted value is : "+l.deleteLast());
        l.print();
        l.insert(10, 0);
        l.print();
        l.addLast(40);
        l.addLast(50);
        l.print();
        l.reverse();

    }    
}
