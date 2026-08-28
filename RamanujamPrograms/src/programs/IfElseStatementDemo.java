package programs;
import java.util.Scanner;
public class IfElseStatementDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean isStudent;
		System.out.println("Is Person Student (true/false)");
		isStudent = sc.nextBoolean();
		
		if (isStudent) {
			
			System.out.println("This is IF Statement");
		} else {
			
			System.out.println("This is Else Statement");
		}
		
		System.out.println("********** END **********");

	}

}
