package programs;
import java.util.Scanner;
public class Prime_Number_While_Loop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :  ");
		int n = sc.nextInt();
		int count = 0 , i = 1;
		while (i <= n) {
			if (count==0 && n>1) {
				System.out.println("The number is prime ");
			} else {
				System.out.println("The number is not prime ");
			}
		}

	}

}
