import java.util.Scanner;
public class difference_between_largest_and_smallest_element_of_array{

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("enter size of array-");
int n = sc.nextInt();
  int i;
int numbers[] = new int[n];
for( i=0; i<n; i++){
numbers[i] = sc.nextInt();
}

//assign first element of an array to largest and smallest
  int smallest = numbers[0];
  int largest = numbers[0];

  for ( i = 1; i < n; i++) {
   if (numbers[i] > largest)
    largest = numbers[i];
   else if (numbers[i] < smallest)
    smallest = numbers[i];
  }

  System.out.println("Largest Number is : " + largest);
  System.out.println("Smallest Number is : " + smallest);
  System.out.println("Difference : " + (largest-smallest));
  
 
}}
