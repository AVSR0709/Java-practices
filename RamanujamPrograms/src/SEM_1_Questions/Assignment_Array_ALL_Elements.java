package SEM_1_Questions;
import java.util.Scanner;
public class Assignment_Array_ALL_Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Length of Array : ");
		int size  = sc.nextInt();
		int[] arr = new int[size];
		
		System.out.println("Enter the Elements in Array of Size "+size);
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

			
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		}
		
	}


