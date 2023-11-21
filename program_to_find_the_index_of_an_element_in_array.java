import java.util.Scanner;
public class index_of_an_element_in_array
{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("enter size of array - ");
int n = sc.nextInt();        
 int a[]= new int[n];
System.out.println("enter elements");
for(int i=0; i<n; i++){
a[i]=sc.nextInt();
}
System.out.print("enter element you want to know index of - ");
int f=sc.nextInt();
System.out.println("index of " +f+ "=" );
for(int i=0;i<n;i++){
if(f==a[i])
System.out.println(i);
}
}}