import java.util.*;
public class delete_an_element_from_an_array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array - ");
        int n=sc.nextInt();
	    int a[] = new int[n];
	
	System.out.print("enter elements - ");
	for(int i=0;i<n;i++){
    a[i]=sc.nextInt();
	}
    
         System.out.print("enter position where you want to delete - ");
	int k = sc.nextInt(); 

        if (k > 0 && k <= n) {
        
            int item = a[k - 1];

            for (int j = k - 1; j < n - 1; j++) {
                a[j] = a[j + 1];
            }

            n--;

        
            System.out.println("Updated array after deleting element at position " + k + ":");
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
        } else {
            System.out.println("deletion not possible");
        }
    }
}
