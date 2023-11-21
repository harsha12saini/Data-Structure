import java.util.Scanner;
public class experiment3_2{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("enter no of rows - ");
int r=sc.nextInt();
System.out.print("enter no of columns - ");
int c=sc.nextInt();
int a[][]= new int[r][c];
System.out.println("enter elements");
for(int i=0; i<r; i++){
for(int j=0; j<c; j++){
a[i][j]=sc.nextInt();
}}

System.out.println("all elements -");
for(int i=0; i<r; i++){
for(int j=0; j<c; j++){
System.out.print(a[i][j]);
System.out.print(" ");
}
System.out.println();
}

System.out.println("array after odd elements multiplied by 2 - ");
for(int i=0; i<r; i++){
for(int j=0; j<c; j++){
if(a[i][j]%2!=0)
a[i][j]=2*a[i][j];
System.out.print(a[i][j]);
System.out.print(" ");
}
System.out.println();
}

}}