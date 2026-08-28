package programs;
import java.util.Scanner;
public class ElectricityBillCalculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double number_of_units;
		double cost_per_unit = 7.5;
		
		System.out.println("Enter the number of units consumed : ");
		number_of_units = sc.nextDouble();
		
		double bill = number_of_units * cost_per_unit ;
		
		System.out.printf("The total bill : %.2f",bill);

	}

}
