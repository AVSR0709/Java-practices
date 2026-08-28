package programs;
import java.util.Scanner;
public class EmployeeBonus {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double salary;
		double years;
		
		System.out.println("Enter the salary of Employee ");
		salary = sc.nextDouble();
		
		System.out.println("Enter the number of years of service :");
		years = sc.nextDouble();
		
		if (years >= 5) {
			
			double bonus = salary * 0.1;
			System.out.println("The total bonus : "+bonus);
		} else {
			double bonus = salary * 0.05;
			System.out.println("The total bonus : "+bonus);
		}
	}

}
