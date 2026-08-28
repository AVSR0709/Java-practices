package programs;
import java.util.Scanner;
public class IncomeTaxCalculation {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		double Annual_Income;
		double tax_amount;
		
		System.out.println("Enter the Annual Income : ");
		Annual_Income = sc.nextDouble();
		
		if (Annual_Income>1000000) {
			tax_amount = Annual_Income*0.2;
			System.out.println("The Tax Amount is "+tax_amount);
		}
		else if (Annual_Income<=1000000 && Annual_Income>600000) {
			
			tax_amount = Annual_Income*0.1;
			System.out.println("The Tax Amount is "+tax_amount);
		}
		else if (Annual_Income <= 600000 && Annual_Income > 300000) {
			
			tax_amount = Annual_Income*0.05;
			System.out.println("The Tax Amount is "+tax_amount);
		}
		else if (Annual_Income<=300000 && Annual_Income >0) {
			
			tax_amount = Annual_Income*0;
			System.out.println("The Tax Amount is "+tax_amount);
		}
		else {
			
			System.out.println("Please enter correct annual income ");
		}

	}

}
