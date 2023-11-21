import java.util.*;
class Node{
	int data;
	Node next;
	Node(){
      data=0;
      next=null;
	}
	Node(int d, Node n){
	data=d;
	next=n;
	}
	void setNext(Node n){
	next=n;
	}
	void setData(int d){
	data=d;
	}
	Node getNext(){
	return next;
	}
	int getData(){
	return data;
	}
}
class LinkedList{
	Scanner sc=new Scanner(System.in);
	int size;
	Node start;
	LinkedList(){
	size=0;
	start=null;
	}
	/*int getListSize(){
	System.out.print("enter list size - ");
	int size = sc.nextInt();
	return size;
	}*/
	public void insertAtFirst(int val){
	Node n;
	n=new Node();
	n.setData(val);
	n.setNext(start);
	start=n;
	size++;
}
/*public void insertAtLast(int val)
{
Node n; 
Node t;
n=new Node();
n.setData(val);
t=start;
if(t==null)
start=n;
else
{
while(t.getNext() !=null)
t=t.getNext();
t.setNext(n);
}
size++;
}
public void insertAtPos(int val,int pos)
{
if(pos==1)
insertAtFirst(val);
else if(pos==size+1)
insertAtLast(val);
else if(pos>1 && pos<=size)
{
Node n;
n= new Node(val,null);
t=start;
for(int i=1;i<pos-1;i++)
t=t.getNext();
n.setNext(t.getNext());
t.setNext(n);
size++;
}
else
System.out.println("insertion not possible");
}
*/
}




public class List{
	public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
System.out.print("enter data -");
       int data=sc.nextInt();
       LinkedList obj = new LinkedList();
       obj.insertAtFirst(data);
      
       
       /*System.out.print("enter data -");
       int data=sc.nextInt();
       LinkedList.insertAtLast(data);
             System.out.print("Enter data: ");
                    data = sc.nextInt();
                    System.out.print("Enter position: ");
                    int position = sc.nextInt();
                    LinkedList.insertAtPos(data, position);
                   */
   }}