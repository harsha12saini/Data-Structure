public class stack_array{
    int a[];
    int top;
   stack_array(int size){
        a = new int[size];
        top=-1;
    }

    void push(int val){
        if(top==a.length - 1)
            System.out.println("stack overflow");
        else{
            top++;
            a[top] = val;
        }
    }

    int pop(){
        if(top==-1){
            System.out.println("stack underflow");
        return -1;
        }
        else{
            int popval = a[top];
            top--;
            return popval;
        }}

        int peek(){
          if(top==-1){
            System.out.println("stack underflow");
        return -1;
        }
        else {
            System.out.println("peek element - " +a[top]); 
            return a[top];
        }
        }

        boolean isEmpty(){
            return (top==-1);
        }

        void display(){
            for(int i=0; i<5; i++)
                System.out.println(a[i]);
        }

    public static void main(String[] args) {
        stack_array stack = new stack_array(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.pop();
        stack.pop();
        stack.push(81);          //harsha22csu081
        stack.peek();
        stack.push(85);
        stack.push(100);
        stack.push(92);
        stack.peek();
        stack.display();

        }}