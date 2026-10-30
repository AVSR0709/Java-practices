package programs;
import java.util.Scanner;
public class Prime_Or_Not_Method_Calling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number :");
		int n = sc.nextInt();
		
		if (Prime_Or_Not_Method_Defination.prime(n)) {
			System.out.println("It is a prime number");
		} else {
			System.out.println("It is not prime number");
		}
		
	}

}
