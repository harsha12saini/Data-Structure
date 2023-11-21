public class CircularQueue {
    private int capacity;
    private int[] queue;
    private int front;
    private int rear;

    public CircularQueue(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.front = -1;
        this.rear = -1;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return (front == 0 && rear == capacity - 1) || (front == rear + 1);
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue.");
            return;
        }

        if (isEmpty()) {
            front = rear = 0;
        } else if (rear == capacity - 1) {
            rear = 0;
        } else {
            rear++;
        }

        queue[rear] = item;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1; 
        }

        int item = queue[front];

        if (front == rear) {
            front = rear = -1;
        } else if (front == capacity - 1) {
            front = 0;
        } else {
            front++;
        }                 //harsha22csu081

        return item;
    }

    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue.dequeue()); // 1
        System.out.println(queue.dequeue()); // 2

        queue.enqueue(4);
        queue.enqueue(5);

        System.out.println(queue.dequeue()); // 3
        System.out.println(queue.dequeue()); // 4
        System.out.println(queue.dequeue()); // 5
    }
}
