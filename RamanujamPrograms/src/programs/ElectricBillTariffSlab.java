package programs;
import java.util.Scanner;
public class ElectricBillTariffSlab {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int electricity_units;
		
		System.out.println("Enter the total units consumed : ");
		electricity_units = sc.nextInt();
		
		if (electricity_units<=100 && electricity_units >0) {
			System.out.println("Domestic Basic");
		} 
		else if (electricity_units<=300 && electricity_units >100) {
			System.out.println("Domestic Standard");
		}
				
		else if (electricity_units<=500 && electricity_units >300) {
			System.out.println("Domestic Premium");	
		}
		else if (electricity_units >500) {
			System.out.println("Commercial Rate");
		}
		
		else {
			System.out.println("Please enter proper input ");
		}

	}

}
