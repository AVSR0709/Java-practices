package programs;
import java.util.Scanner;
public class EvenOddCheckerTernaryOperator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int number;
		
		System.out.println("Enter the Value of Number : ");
		number = sc.nextInt();
		String check = (number%2==0)?"Even":"Odd";
		System.out.println("The Number is : "+check);

	}

}
