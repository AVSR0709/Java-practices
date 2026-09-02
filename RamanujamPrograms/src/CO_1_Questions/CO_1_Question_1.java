package CO_1_Questions;
import java.util.Scanner;
public class CO_1_Question_1 {

	public static void main(String[] args) {
		// Ravi wants to purchase agricultural equipments and he wants assitance for applying
		// financial aid . Help Ravi to calculate loan repayment amount .
		//
		// a] Develop a java program that accepts name , loan amount , loan period in months , rate of intrest .
		//    Calculate and display intrest amount .
		// b] Calculate and display name , loan amount , loan period , loan period , intrest amount ,
		//    total amount to be paid 
		// c] Calculate and display monthly EMI 
		
		Scanner sc = new Scanner(System.in);
		String name;
		double loan_amount;
		double loan_period;
		double rate_of_intrest;
		double intrest_amount;
		double total_amount;
		double EMI;
		
		System.out.println("-------------------------------------------------------");
		System.out.println("PROGRAM : 1A ");
		System.out.println("-------------------------------------------------------");
		
				System.out.println("Enter Name ");
		name = sc.nextLine();
		System.out.println("Enter Loan Amount ");
		loan_amount= sc.nextDouble();
		System.out.println("Enter the Loan period");
		loan_period = sc.nextDouble();
		System.out.println("Enter Rate of Intrest ");
		rate_of_intrest = sc.nextDouble();
		
		loan_period = loan_period/12;
		intrest_amount = loan_amount*loan_period*rate_of_intrest;
		System.out.println("Intrest Amount "+intrest_amount);
		
		System.out.println("-------------------------------------------------------");
		System.out.println("PROGRAM : 1B ");
		System.out.println("-------------------------------------------------------");
		
		System.out.println("Enter Name ");
		name = sc.nextLine();
		System.out.println("Enter Loan Amount ");
		loan_amount= sc.nextDouble();
		System.out.println("Enter the Loan period");
		loan_period = sc.nextDouble();
		System.out.println("Enter Rate of Intrest ");
		rate_of_intrest = sc.nextDouble();
		
		loan_period = loan_period/12;
		intrest_amount = loan_amount*loan_period*rate_of_intrest;
		total_amount = intrest_amount+loan_amount;
		
		System.out.println("Name "+name);
		System.out.println("Loan Amount "+loan_amount);
		System.out.println("Loan Period "+loan_period+" yrs");
		System.out.println("Rate of Intrest "+rate_of_intrest);
		System.out.println("Intrest Amount "+intrest_amount);
		
		System.out.println("-------------------------------------------------------");
		System.out.println("PROGRAM : 1C ");
		System.out.println("-------------------------------------------------------");
		
		System.out.println("Enter Loan Amount ");
		loan_amount= sc.nextDouble();
		System.out.println("Enter the Loan period");
		loan_period = sc.nextDouble();
		System.out.println("Enter Rate of Intrest ");
		rate_of_intrest = sc.nextDouble();
		
		loan_period = loan_period/12;
		intrest_amount = loan_amount*loan_period*rate_of_intrest;
		EMI = intrest_amount/12;
		
		System.out.println("Monthly EMI "+EMI);
	}

}
