import java.util.Scanner;
public class linear_search
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array-");
		int n = sc.nextInt();
		int a[]= new int[n];
		System.out.println("enter elements of array-");
		for(int i=0; i<n; i++){
		    a[i] = sc.nextInt();
		}
		System.out.println("enter element to search-");
		int s = sc.nextInt();
	int pos=-1;
	for(int i=0;i<n;i++){
	    if(s==a[i]){
	    System.out.println("element found");
	    pos=i;
	    break;
	    }}
	    
	if(pos==-1)
	System.out.println("element not found");
	    
	}}
