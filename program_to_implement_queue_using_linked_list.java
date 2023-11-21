class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    private Node front;
    private Node rear;

    public LinkedList() {
        front = null;
        rear = null;
    }

    public void enqueue(int item) {
        Node newNode = new Node(item);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1; 
        }
        int item = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return item;
    }

    public boolean isFull() {
        return false;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot peek.");
            return -1; 
        }
        return front.data;
    }

    public void display() {
        Node current = front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }}
    public class LinkedlistQueue{
    public static void main(String[] args) {
        LinkedList queue = new LinkedList();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
    //harsha 22csu081

        System.out.println(queue.dequeue());  
        System.out.println(queue.peek());     
        queue.display();                     
    }
}
