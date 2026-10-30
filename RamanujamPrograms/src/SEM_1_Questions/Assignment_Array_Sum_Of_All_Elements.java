package SEM_1_Questions;
import java.util.Scanner;
public class Assignment_Array_Sum_Of_All_Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum=0;
		System.out.println("Enter the Size of Array");
		int size = sc.nextInt();
		
		int [] arr = new int[size];
		
		System.out.println("Enter the Elements in Array :");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
			
			sum = sum +arr[i];
		}
		System.out.println(sum);
	}

}
