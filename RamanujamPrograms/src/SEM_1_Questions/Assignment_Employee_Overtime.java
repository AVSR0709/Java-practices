package SEM_1_Questions;
import java.util.Scanner;
public class Assignment_Employee_Overtime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Employee name :");
		String name = sc.nextLine();
		System.out.println("Enter Basic Salary ");
		int salary = sc.nextInt();
		System.out.println("Enter the Overtime in Hours : ");
		int hours = sc.nextInt();
		
		if (hours >= 20) {
			
			int overtimepay = hours*200;
			int total = salary + overtimepay;
			System.out.println("Over Time Pay : "+overtimepay);
			System.out.println("Total Salary : "+total);
		} 
		else if (hours >= 10 && hours < 20) {
			int overtimepay = hours*150;
			int total = salary + overtimepay;
			System.out.println("Over Time Pay : "+overtimepay);
			System.out.println("Total Salary : "+total);

		}
		else if (hours < 10) {
			int overtimepay = hours*100;
			int total = salary + overtimepay;
			System.out.println("Over Time Pay : "+overtimepay);
			System.out.println("Total Salary : "+total);

		}
		else {
			System.out.println("Please enter correct value");
		}
		
	}

}
