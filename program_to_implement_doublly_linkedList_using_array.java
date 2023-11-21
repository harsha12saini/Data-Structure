class Node{
private int data;
private Node next;
private Node prev;
public Node(){
data=0;
next=null;
prev=null;
}
public Node(int d, Node n, Node p){
data=d;
next=n;
prev=p;
}
public void setData(int d){
data=d;
}
public void setNext(Node n){
next=n;
}
public void setPrev(Node p){
prev=p;
}
public int getData(){
return(data);
}
public Node getNext(){
return(next);
}
public Node getPrev(){
return(prev);
}
}

class LinkedList{
 int size;
 Node head;
 Node tail;
public LinkedList(){
size=0;
head=null;
tail=null;
}
public boolean isEmpty(){
if (head==null)
return(true);
else
return(false);
}
public int getListSize(){
return(size);
}
public void viewList(){
Node t;
if (isEmpty()){
System.out.println("List is empty");
}
else{
t=head;
for(int i=1;i<=size;i++){
System.out.println(""+t.getData());
t=t.getNext();
}
}
}
public void insertAtFirst(int val){
Node n;
Node temp;
temp=head;
n= new Node();
if(isEmpty()){
tail=n;
head=n;
}
else{
temp.setPrev(n);
}
n.setData(val);
n.setNext(temp);
head=n;
size++;
}
public void insertAtLast(int val){
Node n,temp;
temp=tail;
n=new Node();
if(isEmpty()){
head=n;
}
else{
tail.setNext(n);
}
n.setData(val);
n.setPrev(tail);
tail=n;
size++;
}
public void insertAtPos(int val, int pos){
Node n;
Node t;
Node temp;
t=head;
n= new Node();
if(pos==1){
insertAtFirst(val);
}
else if (pos==size+1){
insertAtLast(val);
}
else{
for(int i=1;i<pos-1;i++){
t=t.getNext();
}
temp=t.getNext();
n.setData(val);
n.setNext(t.getNext());
t.setNext(n);
n.setPrev(t);
temp.setPrev(n);
size++;
}
}
public void deleteAtFirst(){
if (head==null)
System.out.println("List is empty");
else{
head=head.getNext();
size--;
}
}
public void deleteAtLast()
{
if (head==null)
System.out.println("List is empty");
else if (size==1)
{
head=null;
size--;
}
else
{
Node t;
t=head;
for (int i=1;i<size-1;i++)
{
t=t.getNext();
}
t.setNext(null);
size--;
}
}
public void deleteAtPos(int pos)
{
if (head==null)
System.out.println("list is empty");
else if(pos<1 || pos>size)
System.out.println("invalid position");
else if(pos==1)
deleteAtFirst();
else if(pos==size)
deleteAtLast();
else
{
Node t,t1;
t=head;
for(int i=1; i<pos-1;i++)
{
t=t.getNext();
}
t1=t.getNext();
t.setNext(t1.getNext());
t1.getNext().setPrev(t);
size--;
}
}
}


public class double_LinkedList_exp5 {
    public static void main(String[] args) {
        LinkedList obj = new LinkedList();
        
        obj.insertAtFirst(50);
        obj.insertAtFirst(2);
        obj.insertAtFirst(40);
        obj.insertAtLast(55);
        obj.insertAtLast(1);
        obj.insertAtPos(75,3);
        System.out.println("List is: ");
        obj.viewList();
        System.out.println("List is empty: "+obj.isEmpty());
        System.out.println("List size: "+obj.getListSize());
        System.out.println("After deletion: ");
        obj.deleteAtFirst();
        obj.deleteAtPos(5);
        obj.deleteAtLast();
        obj.viewList();
    }
} 
