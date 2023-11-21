import java.util.Scanner;
public class experiment3_1{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("enter size of array - ");
int n=sc.nextInt();
int a[]= new int[n];
System.out.println("enter elements");
for(int i=0; i<n; i++){
a[i]=sc.nextInt();
}
System.out.println("enter element you want to find occurence of - ");
int occ = sc.nextInt();
int count=0;
for(int i=0;i<n;i++){
if(a[i]==occ)
count++;
}
System.out.println("occurence of " +occ+ " = " +count);
}}