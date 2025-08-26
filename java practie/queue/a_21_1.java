package queue;

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

public class a_21_1 {
    public static void main(String[] args) {
        
    }
}
