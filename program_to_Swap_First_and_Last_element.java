import java.util.Scanner;
public class SwapFirstLast
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    	System.out.println("Harsha 22CSU081");
		System.out.println("enter size of array-");
		int n = sc.nextInt();
		int a[]= new int[n];
		System.out.println("enter elements of array-");
		for(int i=0; i<n; i++){
		    a[i] = sc.nextInt();
		}
	
    int temp;
	 temp=a[0];
	 a[0]=a[n-1];
	 a[n-1]=temp;
	
	for(int i=0; i<n; i++){
		    System.out.print(a[i]);
	}
	    }}
