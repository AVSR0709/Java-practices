package programs;
import java.util.Scanner;
public class EvenOddClassifier {

	public static void main(String[] args) {

		Scanner inpt = new Scanner(System.in);
		System.out.println("Type the number you want to check");
		int number;
		number=inpt.nextInt();
		System.out.println("your selected number is : "+number);

		if (number == 0) {	
			System.out.println("I am in IF");
			System.out.println("Number is Zero");	
		}
		else if( number%2 == 0)	{
			System.out.println("I am in Else IF");
			System.out.println("Numbner is even");
		}
		else {
			System.out.println("I am in Else");
			System.out.println("This is odd number");
		}	


	}
}
