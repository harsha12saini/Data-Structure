import java.util.*;
public class insert{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array - ");
        int n=sc.nextInt();
	    int a[] = new int[n+1];
	    int item = 189;
	    System.out.print("enter position where you want to insert - ");
     	int k = sc.nextInt(); 
	
	System.out.print("enter elements - ");
	for(int i=0;i<n;i++){
    a[i]=sc.nextInt();
	}
    
        if(k<=n){
 int j = n;

            while (j >= k) {
            
            a[j] = a[j - 1];

            
            j--;
        }

        
        a[k - 1] = item;

        
        n++;

        
            System.out.println("Updated array after inserting element at position " + k + ":");
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }}
            else 
                System.out.println("insertion not possible");
         
    }
}
