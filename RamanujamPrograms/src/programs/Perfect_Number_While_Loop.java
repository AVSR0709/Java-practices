package programs;
import java.util.Scanner;
public class Perfect_Number_While_Loop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i = 1 , n ,sum= 0 ;
		System.out.println("Enter the number :");
		n = sc.nextInt();
		while (i<n) {
			if (n%i == 0) {
				sum = sum+i;
				i++;
				
				if (n == sum) {
					System.out.println(" It is a perfect number ");
				}
				else {
					System.out.println("It is not perfect number ");
				}
			}
			
			
		}
		
	}

}
