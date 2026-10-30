package SEM_1_Questions;
import java.util.Scanner;
public class Assignment_Array_Reverse_Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of Array :");
		int size = sc.nextInt();
		int [] arr = new int[size];
		
		System.out.println("Enter the Elements in Array of size "+size);
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]+" ");
		}
	}

}
