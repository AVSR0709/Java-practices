package programs;

import java.util.Scanner;

public class ElectricityBillGenerator {
	public static void main(String[] args) {
		// start
		// Taking inputs from admin 
		System.out.println(" Electric Bill Generator ");
		System.out.println("Enter the price of 1 unit of electricity :");
		Scanner inpt=new Scanner(System.in);
		int input_1=inpt.nextInt();
		System.out.println("Enter the number of units consumed :");
		Scanner inpt1=new Scanner(System.in);
		int input_2=inpt1.nextInt();
		// declaring and assigning values
	int cost_per_unit = input_1;
	int unit_consumed = input_2;
			// computing the calculation
	int Total_ebill = cost_per_unit * unit_consumed;
			// displaying the value
	System.out.println("The Total  July Electricity bill amount = "+Total_ebill);
			// stop
	}
}
