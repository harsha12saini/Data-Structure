import java.util.Scanner;
class findMissing{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("enter size of array - ");
int n = sc.nextInt();
int i, count=0;
int a[] = new int[n];
System.out.print("enter array elements - ");
for(i=0;i<n;i++){
a[i]=sc.nextInt();
}
for(i=0;i<n;i++){
 for(int j=1;j<10;j++){
   if(a[i]==j){
    count++; 
    }
count=0;
}}
if(count==1)
System.out.println("all numbers are present");
else if(count==0)
System.out.println("number is missing");
else
System.out.println("repeating");

}}