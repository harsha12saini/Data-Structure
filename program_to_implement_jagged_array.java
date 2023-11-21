import java.util.Scanner;
class jagged_array {
	public static void main(String[] args)
	{
		
		int arr[][] = new int[4][];
		arr[0] = new int[3];
		arr[1] = new int[2];
		arr[2] = new int[4];
		arr[3] = new int[1];
        input(arr);
        display(arr);
    }
	
	public static void input(int arr[][]){	
		Scanner sc = new Scanner(System.in);
      System.out.println("enter elements -");
		for (int i = 0; i < arr.length; i++){
			for (int j = 0; j < arr[i].length; j++){
				arr[i][j] = sc.nextInt();
			}
		}
    }       


        public static void display(int arr[][]){
		
		System.out.println("Contents of 2D Jagged Array");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++)
				System.out.print(arr[i][j] + " ");
			System.out.println();
		}}
	}
