package programs;
import java.util.Scanner;
public class Armstrong_Number_Do_While_Loop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int org ,sum=0,  rem;
		do {
			rem = num%10;
			sum = sum+rem*rem*rem;
			num = num/10;
		} while (num>0);
		if (sum == num) {
			System.out.println("It is a Armstrong Number");
		} else {
			System.out.println("It is not an Armstrong Number");
		}

	}

}
