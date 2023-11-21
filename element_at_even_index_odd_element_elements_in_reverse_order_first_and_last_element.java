import java.util.Scanner;
public class element_at_even_index_odd_element_elements_in_reverse_order_first_and_last_element
{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
         int a[]= new int[10];
System.out.println("enter 10 elements");
for(int i=0; i<10; i++){
a[i]=sc.nextInt();
}
//print element at even index
System.out.println("element at even index");
for(int i=0; i<10; i++){
    if(i%2==0)
    System.out.println(a[i]);
}
//print odd element
System.out.println("odd element");
for(int i=0; i<10; i++){
    if(a[i]%2!=0)
    System.out.println(a[i]);
}
//reverse order
System.out.println("reverse order");
for(int i=9; i>0; i--){
    System.out.println(a[i]);
}

//first and last element
System.out.println("First and last element");
for(int i=0; i<10; i++){
   System.out.println(a[0]);
   System.out.println(a[9]);
 break;
}
}
}

