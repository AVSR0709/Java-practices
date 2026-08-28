package programs;
import java.util.Scanner;
public class Prime_Number_Do_Whie_Loop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		int count = 0 , i = 1;
		do {
			if (n%i == 0) {
				i++;
				count++;
				if (count==2) {
					System.out.println("The number is prime");
					
				} 
				
			}
			else {
				System.out.println("The number is not prime");
				break;
			}
			
		} while (i <= n);
		
	}

}
