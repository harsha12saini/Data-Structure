import java.util.Scanner;
public class swap_alternate_elements{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("enter size of array -");
int n = sc.nextInt();
int a[]= new int[n];
System.out.println("enter elements");
for(int i=0; i<n; i++){
a[i]=sc.nextInt();
}

swap_pairs(a, n);

}

public static void swap_pairs(int a[], int n){
        for(int i = 0; i < n-1; i += 2) {
            int temp;
            temp = a[i];
            a[i] = a[i + 1];
            a[i + 1] = temp;
        }
        
System.out.println("new array -");
for(int i=0; i<n; i++){
System.out.print(" " +a[i]);
}
}}

