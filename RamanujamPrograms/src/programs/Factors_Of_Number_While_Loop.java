package programs;
import java.util.Scanner;
public class Factors_Of_Number_While_Loop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		int i = 1;
		System.out.println("The factors of "+n+" are : ");
		
		while (i <= n ) {
			if(n%i == 0 ) {
				System.out.print(i + " " );
				
			}
			i++;
		}
	}

}
