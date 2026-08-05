package programs;
import java.util.Scanner;
public class WholeDecimalNumberSeperator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float number;
		
		System.out.println("Enter the Number to be seperated : ");
		number = sc.nextFloat();
		
		int whole = (int)number;
		System.out.printf("The Whole Number Part : %d%n",whole);
		
		number = (number-whole);
		System.out.printf("The Decimal Part %.3f : ",number);

	}

}
