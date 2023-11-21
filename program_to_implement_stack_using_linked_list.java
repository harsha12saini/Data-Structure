class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListStack {
    private Node top;

    public LinkedListStack() {
        this.top = null;
    }

    public void push(int item) {
        Node n = new Node(item);
        n.next = top;
        top = n;         //harsha22csu081
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1; 
        }
        int data = top.data;
        top = top.next;
        return data;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1; 
        }
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }
    
    
    public void printStack() {
    System.out.print("Stack: ");
    Node current = top;
    while (current != null) {
        System.out.print(current.data + " ");
        current = current.next;
    }
    System.out.println();
}

    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);            //harsha22csu081
        stack.push(4);
        stack.push(5);

        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());
        stack.printStack();
        
    }
}
