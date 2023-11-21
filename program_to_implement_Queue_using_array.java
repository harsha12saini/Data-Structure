public class ArrayQueue {
    private int capacity;
    private int[] queue;
    private int front;
    private int rear;
    private int size;

    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue.");
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = item;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1; 
        }
        int item = queue[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot peek.");
            return -1; 
        }
        return queue[front];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        int index = front;
        for (int i = 0; i < size; i++) {
            System.out.print(queue[index] + " ");
            index = (index + 1) % capacity;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        //harsha 22csu081
        System.out.println(queue.dequeue());  
        System.out.println(queue.peek());    
        queue.display();                     
    }
}
