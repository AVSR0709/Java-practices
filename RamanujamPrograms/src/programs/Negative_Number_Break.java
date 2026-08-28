package programs;
import java.util.Scanner;
public class Negative_Number_Break {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("Enter the number ");
			int n = sc.nextInt();
			if(n<0)
				break;
			
			System.out.println("The number entered is "+n);
		}
		System.out.println("Encounterd Negative number");
	}

}
