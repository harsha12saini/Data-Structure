import java.util.*;
import java.lang.*;
public class segregate_all_0_and_all_1
{
   public static void main (String[] args) 
    {  
Scanner sc = new Scanner(System.in);
System.out.print("enter size of array-");
int n = sc.nextInt();        

        int i;
        int nums[] = new int[n];
        int left = 0, right = n-1;

for(i=0;i<n;i++){
nums[i]=sc.nextInt();
}
        
        System.out.print("Original Array : ");
  
 for(i=0;i<n;i++){
System.out.print(nums[i]);
}
System.out.println();
        while (left < right) 
        {
            /* While  0 at left increment left index  */
            while (nums[left] == 0 && left < right)
               left++;
 
            /* While we see 1 at right decrement right index*/
            while (nums[right] == 1 && left < right)
                right--;
 
           
            if (left < right) 
            {
                nums[left] = 0;
                nums[right] = 1;
                left++;
                right--;
            }
        }
        
       System.out.println("Array after segregation is : "+Arrays.toString(nums));  
    }
}
