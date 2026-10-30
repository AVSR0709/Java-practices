package programs;
import java.util.Scanner;
public class Armstrong_Number_While_Loop {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int org = num, sum = 0, rem;
		while (num > 0) {
			rem = num%10;
			sum += rem*rem*rem;
			num = num/10;
			
		}
		if (sum == org) {
			System.out.println("It is a armstrong number ");
		}
		else {
			System.out.println("It is not a armstrong number ");
		}

	}

}
