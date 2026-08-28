package programs;
import java.util.Scanner;
public class IncomeTaxCalculator {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		double annual_income;
		
		System.out.println("Enter the Annual income : ");
		annual_income = sc.nextDouble();
		
		if (annual_income >= 0 && annual_income <= 300000) {
			
			double tax_amount = annual_income * 0;
			System.out.println("The Tax Amount : "+tax_amount);
		} 
		else if (annual_income >= 300001 && annual_income <= 600000) {
			double tax_amount = annual_income * 0.05;
			System.out.println("The Tax Amount : "+tax_amount);
		}
		else if (annual_income >= 600001 && annual_income <= 1000000) {
			double tax_amount = annual_income * 0.1;
			System.out.println("The Tax Amount : "+tax_amount);
				}
		else if (annual_income >= 1000001) {
			double tax_amount = annual_income * 0.2;
			System.out.println("The Tax Amount : "+tax_amount);
		}
		else {
			System.out.println("Please enter the correct value ");
		}


	}

}
