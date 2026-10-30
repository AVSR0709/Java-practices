package SEM_1_Questions;
import java.util.Scanner;
public class Assignment_Number_Calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number :");
		float number = sc.nextFloat();
		
		if (number >0) {
			System.out.println("The Number : "+number);
			System.out.print("The Square of Number : "+number*number);
		}
		else if (number <0) {
			System.out.println("The Number : "+number);
			int in = (int) number;
			System.out.println("The Absolute Value :"+in);
		}
		else {
			System.out.println("Zero");
		}
	}

}
