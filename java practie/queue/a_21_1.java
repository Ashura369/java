package queue;

// THIS IS QUEUE USING ARRAY FROM a_21_0
class Queue {
    static int arr[];
    static int size;
    static int rear; // rear = index of last element

    // constructor
    Queue(int size) {
        arr = new int[size];
        this.size = size;
        rear = -1; // initially empty
    }

    // enqueue (add element)
    void add(int data) {
        if (rear == size - 1) {   // queue full
            System.out.println("Queue is Full");
            return;
        }
        rear++;
        arr[rear] = data;
    }

    // checks if the queue is empty or not
    boolean isEmpty() {
        return rear == -1;
    }

    // dequeue (remove from front)
    int removeFirst() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }

        int front = arr[0];
        // shift all elements to the left
        for (int i = 0; i < rear; i++) {
            arr[i] = arr[i + 1];
        }
        rear--; // reduce rear index
        return front;

        // Returning front lets the caller know which element was removed.
        // Otherwise, the program would remove it but not tell you what it was.
    }

    int remove(int idx){
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }

        int removedElement = arr[idx];
        for (int i = idx; i < rear; i++) {
            arr[i] = arr[i+1];
        }

        rear--;

        return removedElement;
    }

    int removeLast(){
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        
        int last = arr[rear];
        rear--;
        return last; // here we are returning the very last element which was removed
    }

    // peek (get front element without removing)
    int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[0];
    }

    // print the queue
    void print() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.print("Queue: ");
        for (int i = 0; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}


// THIS IS CIRCULAR QUEUE USING ARRAY FROM a_21_2
class Queue2 {
    static int arr[];
    static int size;
    static int rear;  // rear = index of last element
    static int front; // front = index of first element

    // constructor
    Queue2(int size) {
        arr = new int[size];
        this.size = size;
        rear = -1; // initially empty
        front = -1;
    }

    // enqueue (add element)
    void add(int data) {
        if (isFull()) {   
            System.out.println("Queue is Full");
            return;
        }

        if (front == -1) {  
            front = 0;
        }

        rear = (rear + 1) % size;   // keep in mind this statement in here not storing the ans of a division, but rather its storing the remainder of a division   
        arr[rear] = data;           // here we are using rear to assign values into the arr
    }

    // checks if the queue is empty or not
    boolean isEmpty() {
        return rear == -1 && front == -1;
    }

    // checks if the queue is full or not
    boolean isFull() {
        return (rear + 1) % size == front;
    }

    // dequeue (remove from front)
    int removeFirst() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }

        int val = arr[front];

        // only one element
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % size;
        }

        return val;
    }

    // peek (get front element without removing)
    int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[front];
    }

    // remove last element
    int removeLast() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }

        int val = arr[rear];

        if (front == rear) { // only one element
            front = -1;
            rear = -1;
        } else {
            rear = (rear - 1 + size) % size; // circular decrement
        }

        return val;
    }

    // print the queue
    void print() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.print("Queue: ");
        int i = front;
        while (true) {                          // while(true) means the loop will run indefinitely until a break condition is met.
            System.out.print(arr[i] + " ");
            if (i == rear) break;
            i = (i + 1) % size;
        }

        System.out.println();
    }
}



public class a_21_1 {
    public static void main(String[] args) {
        
    }
}
