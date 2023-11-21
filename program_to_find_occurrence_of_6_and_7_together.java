import java.util.Scanner;
public class experiment3_3{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("enter size of array -");
int n = sc.nextInt();
int a[]= new int[n];
System.out.println("enter elements");
for(int i=0; i<n; i++){
a[i]=sc.nextInt();
}
int count =0, c=0;
for(int i=0; i<n; i++){
if(a[i]==6 && a[i+1]==6)
count++;
if(a[i]==7)
c++;
}
System.out.println("ocuurence of two 6's together =" +count);
System.out.println("occurence that second element is 7 =" +c);
}}

