import java.util.Scanner;
public class experiment3{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int a[]= new int[5];
System.out.println("enter elements");
for(int i=0; i<5; i++){
a[i]=sc.nextInt();
}
int sum=0;
for(int i=0;i<5;i++){
sum=sum+a[i];
}
System.out.println("sum of all elements = " +sum);
int sum1=0;
for(int i=0;i<5;i=i+2){
sum1=sum1+a[i];
}
System.out.println("sum of alternate elements = " +sum1);
int temp;
for(int i = 0; i<5; i++ ){
         for(int j = i+1; j<5; j++){
            if(a[i]>a[j]){
               temp = a[i];
               a[i] = a[j];
               a[j] = temp;
            }
         }
      }
      System.out.println("second largest element = " +a[5-2]);

}}
