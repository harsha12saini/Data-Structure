public class ArrayDeque {
    private int front, rear, capacity;
    private int[] deque;

    public ArrayDeque(int capacity) {
        this.front = -1;
        this.rear = 0;
        this.capacity = capacity;
        this.deque = new int[capacity];
    }

    public void enqueueFront(int element) {
        if (isFull()) {
            System.out.println("Deque is full. Cannot enqueueFront.");
            return;
        }

        if (front == -1) {
            front = rear = 0;
        } else if (front == 0) {
            front = capacity - 1;
        } else {
            front--;
        }

        deque[front] = element;
        System.out.println("Enqueued " + element + " at the front.");
    }

    public void enqueueRear(int element) {
        if (isFull()) {
            System.out.println("Deque is full. Cannot enqueueRear.");
            return;
        }

        if (front == -1) {
            front = rear = 0;
        } else if (rear == capacity - 1) {
            rear = 0;
        } else {
            rear++;
        }

        deque[rear] = element;
        System.out.println("Enqueued " + element + " at the rear.");
    }

    public void dequeueFront() {
        if (isEmpty()) {
            System.out.println("Deque is empty. Cannot dequeueFront.");
            return;
        }

        int removedElement = deque[front];

        if (front == rear) {
            front = rear = -1;
        } else if (front == capacity - 1) {
            front = 0;
        } else {
            front++;
        }

        System.out.println("Dequeued " + removedElement + " from the front.");
    }

    public void dequeueRear() {
        if (isEmpty()) {
            System.out.println("Deque is empty. Cannot dequeueRear.");
            return;
        }

        int removedElement = deque[rear];

        if (front == rear) {
            front = rear = -1;
        } else if (rear == 0) {
            rear = capacity - 1;
        } else {
            rear--;
        }

        System.out.println("Dequeued " + removedElement + " from the rear.");
    }

    public boolean isFull() {
        return (front == 0 && rear == capacity - 1) || (front == rear + 1);
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Deque is empty. Cannot peek.");
            return -1;
        }
        return deque[front];  //harsha22csu081
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        int index = front;
        for (int i = 0; i < capacity; i++) {
            System.out.print(deque[index] + " ");
            index = (index + 1) % capacity;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayDeque deque = new ArrayDeque(5);

        deque.enqueueRear(10);
        deque.enqueueRear(20);
        deque.enqueueFront(5);

        System.out.println("Front element: " + deque.peek());

        deque.dequeueFront();
        deque.dequeueRear();

        System.out.println("Front element after dequeue: " + deque.peek());

        deque.display();
    }
}
