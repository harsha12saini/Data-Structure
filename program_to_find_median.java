import java.util.*;
public class find_median{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("enter size of array -");
int n = sc.nextInt();
int a[]= new int[n];
System.out.println("enter elements");
for(int i=0; i<n; i++){
a[i]=sc.nextInt();
}

median(a, n);

}

public static void median(int a[], int n){
        Arrays.sort(a);
        int s = n/2;
        
System.out.println("median -" +a[s] );

}}

