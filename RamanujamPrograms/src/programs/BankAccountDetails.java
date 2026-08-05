package programs;

public class BankAccountDetails {
public static void main(String[] args) {
	 byte deposit_period = 3;
	 short Branch_code = 102;
	 int Principle_Amount = 50000 ;
	 long account_number = 1;
	 float Annual_intrest = 7.5f;
	 float Processing_fee=150.75f;
	 char Account_type = 'S';
	 boolean Account_status = true;
	 double Simple_intrest;
	 double final_amount;
	 
	 Simple_intrest = Principle_Amount*deposit_period*Annual_intrest;
	 Simple_intrest = Simple_intrest/100;
	 
	 final_amount = Principle_Amount+Simple_intrest-Processing_fee;
	 System.out.println("The Account Number : "+account_number);
	 System.out.println("The bank branch number : "+Branch_code);
	 System.out.println("Account active status : "+Account_status);
	 System.out.println("The account type : "+Account_type);
	 System.out.println("The final amount : "+final_amount);
}
}
