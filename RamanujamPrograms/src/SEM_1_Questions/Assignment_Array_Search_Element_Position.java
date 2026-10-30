package SEM_1_Questions;

import java.util.Scanner;

public class Assignment_Array_Search_Element_Position {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int flag =0;
		System.out.println("Enter the Size of Array :");
		int size = sc.nextInt();
		int [] arr = new int[size];
		System.out.println("Enter the elements in Array of size "+size);
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the Search Key :");
		int search = sc.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==search) {
				System.out.println("Element Found at position : "+i);
				flag = 1;
				break;
			}
			
		}
		if (flag ==0) {
			System.out.println("Element not found");
		}
	}

}
