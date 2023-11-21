import java.util.Scanner;
public class experiment2_5
{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("enter size of array - ");
int n = sc.nextInt();  
      
int a[]= new int[n];
int b[]=new int[n-1];

System.out.println("enter elements");
for(int i=0; i<n; i++){
a[i]=sc.nextInt();
}
System.out.print("enter element you want to remove - ");
int f=sc.nextInt();
int k=0;

for(int i=0; i<n; i++){
if(a[i]!=f){
b[k]=a[i];
k++;
}
}
System.out.println("array after removal of " +f+ " = " );
for(int i=0;i<n;i++){
System.out.println(b[i]);
}
}}