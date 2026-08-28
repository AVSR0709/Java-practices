package programs;
import java.util.Scanner;
public class Multiple_Of_Five_While_Loop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n , i = 5, sum = 0;
		System.out.println("Enter the N");
		n = sc.nextInt();
		while (i <= n) {
			sum = sum+i;
			i = i+5;
			System.out.println("Sum of multiples of 5  : "+sum);
			
		}

	}

}
