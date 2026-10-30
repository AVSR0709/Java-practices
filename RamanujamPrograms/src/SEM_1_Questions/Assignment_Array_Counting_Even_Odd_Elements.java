package SEM_1_Questions;
import java.util.Scanner;
public class Assignment_Array_Counting_Even_Odd_Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int ecount=0;
		int ocount=0;
		System.out.println("Enter the Size of Array :");
		int size = sc.nextInt();
		int [] arr = new int[size];
		
		System.out.println("Enter the Elements in Array of size "+size);
		for (int i = 0; i < arr.length; i++) {
			arr[i]= sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2==0) {
				ecount ++;
				
			}
			if (arr[i]%2!=0) {
				ocount++;
			}
		}
		System.out.println("Number of Even Numbers in Array  :"+ecount);
		System.out.println("Number of Odd Numbers in Array  :"+ocount);
	}

}
