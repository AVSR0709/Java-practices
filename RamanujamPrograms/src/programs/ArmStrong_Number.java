package programs;
import java.util.Scanner;
public class ArmStrong_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int org = n ; int sum = 0 ; int rem ;
		while (n >0) {
			
			rem = n%10;
			sum = sum+rem*rem*rem;
			n = n/10;
		}
		
		
		if (sum == org) {
			System.out.println("Armstrong");
		} else {
			System.out.println("Not an Armstrong");
		}
	}

}
