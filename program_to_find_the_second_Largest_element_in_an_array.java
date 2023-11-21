import java.util.Scanner;
public class secondLargest {
   public static void main(String args[]){
      int temp, size;
      Scanner sc = new Scanner(System.in);
      System.out.print("enter size of array-");
      int n = sc.nextInt();
      int array[] = new int[n];
      for(int i = 0; i<n; i++){
          array[i]=sc.nextInt();
      }
      for(int i = 0; i<n; i++ ){
         for(int j = i+1; j<n; j++){
            if(array[i]>array[j]){
               temp = array[i];
               array[i] = array[j];
               array[j] = temp;
            }
         }
      }
      System.out.println("second largest number is:: "+array[n-2]);
   }
}