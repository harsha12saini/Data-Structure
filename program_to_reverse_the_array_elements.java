import java.util.Scanner;
public class experiment2_3
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
System.out.println("reverse array - ");
for(int i=n-1; i>=0; i--){
    System.out.print(a[i]);
}
}}
