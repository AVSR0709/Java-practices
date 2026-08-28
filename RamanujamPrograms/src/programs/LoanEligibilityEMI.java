package programs;
import java.util.Scanner;
public class LoanEligibilityEMI {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double monthly_salary;
		
		System.out.println("Enter the monthly salary ");
		monthly_salary = sc.nextDouble();
		
		if (monthly_salary >= 30000) {
			
			double loan = monthly_salary *10;
			double EMI = loan / 24;
			
			System.out.println("The Loan Amount : "+loan);
			System.out.println("The EMI Amount : "+EMI);
			
		} else {
			System.out.println("Loan not Eligible ");
		}

	}

}
