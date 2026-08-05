package programs;
import java.util.Scanner;
public class IfStatementDemo {

	public static void main(String[] args) {
		int marks;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks : ");
		marks = sc.nextInt();
		
		if (marks>=35) {
			
			System.out.println("Passed ");
			System.out.println("Java Course ");
		}
		
		System.out.println("End The Program");

	}

}
