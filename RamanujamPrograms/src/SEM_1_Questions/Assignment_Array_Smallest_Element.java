package SEM_1_Questions;
import java.util.Scanner;
public class Assignment_Array_Smallest_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Size of Array :");
		int size = sc.nextInt();
		int [] arr = new int[size];
		
		System.out.println("Enter the elements in the Array of "+size);
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int smallest = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < smallest) {
				smallest = arr[i];
			}
			
		}
		System.out.println("The Smallest Number : "+smallest);
	}

}
