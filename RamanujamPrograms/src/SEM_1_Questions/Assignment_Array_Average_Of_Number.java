package SEM_1_Questions;
import java.util.Scanner;
public class Assignment_Array_Average_Of_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int aaverage = 0;
		int baverage = 0;
		
		System.out.println("Enter the Size of Array :");
		int size = sc.nextInt();
		int [] arr = new int[size];
		System.out.println("Enter the Elements in the Array of size "+size);
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			sum = sum+arr[i];
		}
		float average = sum/arr.length;
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] < average) {
			baverage++;
			}
			if (arr[i] >  average) {
				aaverage++;
			}
			
		}
		System.out.println("Average : "+average);
		System.out.println("Number of Elements above the Average :"+aaverage);
		System.out.println("Number of Elements below the Average :"+baverage);
			}

}
