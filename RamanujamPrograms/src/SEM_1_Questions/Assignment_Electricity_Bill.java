package SEM_1_Questions;
import java.util.Scanner;
public class Assignment_Electricity_Bill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Customer name :");
		String name = sc.nextLine();
		System.out.println("Enter the Number of Units Consumed :");
		int units = sc.nextInt();
		
		if (units <= 0 && units >= 100) {
			int price = 2;
			int total_bill = units*price;
			
			System.out.println("Total Bill : "+total_bill);
		}
		else if (units <= 101 && units >= 200) {
			int price = 3;
			int total_bill = units*price;
			
			System.out.println("Total Bill : "+total_bill);
		}
		else if (units <= 201 && units >= 300) {
			int price = 5;
			int total_bill = units*price;
			
			System.out.println("Total Bill : "+total_bill);
		}
		else if (units <= 300) {
			int price = 7;
			int total_bill = units*price;
			
			System.out.println("Total Bill : "+total_bill);
		}
		else {
			System.out.println("Please enter correct value ");
		}
		
	}

}
