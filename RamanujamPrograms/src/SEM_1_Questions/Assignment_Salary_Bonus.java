package SEM_1_Questions;
import java.util.Scanner;
public class Assignment_Salary_Bonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Employee name : ");
		String name = sc.nextLine();
		System.out.println("Enter the Salary amount :");
		int salary = sc.nextInt();
		
		if (salary >= 50000) {
			short bonus = 10;
			int bonus_amount = salary*bonus/100;
			int final_salary = bonus_amount + salary;
			
			System.out.println("Salary ( Without bonus )"+salary);
			System.out.println("Bonus Percentage : "+bonus);
			System.out.println("Bonus Amount : "+bonus_amount);
			System.out.println("Final Salary :"+final_salary);
		} 
		else if (salary >= 30000 && salary <50000) {
			
			System.out.println("Salary ( Without bonus )"+salary);
			short bonus = 7;
			int bonus_amount = salary*bonus/100;
			int final_salary = bonus_amount + salary;
			
			System.out.println("Bonus Percentage : "+bonus);
			System.out.println("Bonus Amount : "+bonus_amount);
			System.out.println("Final Salary :"+final_salary);
		}
		else if (salary >= 20000 && salary <30000) {
			
			System.out.println("Salary ( Without bonus )"+salary);
			short bonus = 5;
			int bonus_amount = salary*bonus/100;
			int final_salary = bonus_amount + salary;
			
			System.out.println("Bonus Percentage : "+bonus);
			System.out.println("Bonus Amount : "+bonus_amount);
			System.out.println("Final Salary :"+final_salary);
		}
		else if ( salary <20000 && salary >0) {
			
			System.out.println("Salary ( Without bonus )"+salary);
			short bonus = 2;
			int bonus_amount = salary*bonus/100;
			int final_salary = bonus_amount + salary;
			
			System.out.println("Bonus Percentage : "+bonus);
			System.out.println("Bonus Amount : "+bonus_amount);
			System.out.println("Final Salary :"+final_salary);
		}
		else {
			System.out.println("Please enter correct salary amount");
		}
	}

}
