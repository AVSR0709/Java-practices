package SEM_1_Questions;
import java.util.Scanner;
public class Assignment_Simple_Intrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Name :");
		String name = sc.nextLine();
		System.out.println("Enter the Principal Amount :");
		int principal = sc.nextInt();
		System.out.println("Enter the Rate Of Intrest :");
		float rate = sc.nextFloat();
		System.out.println("Enter the Time Period : " );
		int time = sc.nextInt();
		
		double simple = (principal*rate*time)/100;
		System.out.println("The Simple Intrest = "+simple);
		
		if (simple >= 5000) {
			System.out.println("Category : High Intrest");
		}
		else if (simple >= 2000 && simple <= 4999) {
			System.out.println("Category : Medium Intrest");
		}
		else if (simple >= 0 && simple < 2000) {
			System.out.println("Category : Low Intrest");
		}
		else {
			System.out.println("Please enter correct value");
		}
		
	}

}
