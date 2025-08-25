package linkedList;

// here we will be changing the name of node into node 2, bcoz there is no specific way that you can link a specific file with the a_20_3. And there also exists another node class in a_20_2. 
// KEEP IN MIND, JAPA DOESN'T IMPORT FILES IT IMPORTS PACKAGES (FOLDERS)

class node2{
    int data;
    node2 next;

    node2(int data){
        this.data = data;
        this.next = null;
    }
}

class lists{
    node2 head;             // head always remains same as the first element passes, but it changes accordingly based on the element passsd by "addFirst"
    private int size;

    lists(){
        size = 0;
    }

    // adding element
    void add(int data){
        node2 crrElement = new node2(data); // assigning the newly passes element into the crrElement
        size++;

        if (head == null) {
            head = crrElement;
            return;
        }else{
            node2 temp1 = head;
            while (temp1.next != null) {
                temp1 = temp1.next;
            }
            temp1.next = crrElement;
        }    
    
    }

    // adding element to the very first index
    void addFirst(int data){
        node2 crrElement2 = new node2(data);
        size++;

        if (head == null) {
            head = crrElement2;
            return;
        }else{
            crrElement2.next = head;
            head = crrElement2;
        }

    }

    // adding element to very last index
    void addLast(int data){
        node2 crrElement3 = new node2(data);
        size++;

        if (head == null) {
            head = crrElement3;
            return;
        }else{
            node2 temp2 = head;
            
            while (temp2.next != null) {
                temp2 = temp2.next;
            }
            temp2.next = crrElement3;
        }

    }

    // removing elements using their index number
    void remove(){

    }


    void print(){
        if (head == null) {
            System.out.println("THE LIST IS EMPTY");
        } else{
            node2 newElement = head;
            while (newElement != null) {
                System.out.print(newElement.data+" -> ");
                newElement = newElement.next;
            }
            System.out.println("null");
        }
    }
}



public class a_20_4 {
    
}
