package programs;
import java.util.Scanner;
public class MarksGradeClassifier {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int marks;
		System.out.println("Enter the Marks : ");
		marks = sc.nextInt();
		
		if (marks>90) {
			System.out.println("Grade : A");
		} 
		else if (marks>70) {
			System.out.println("Grade : B");
		}
		
		else if (marks>60) {
			System.out.println("Grade : C");
		}
		
		else if (marks>40) {
			System.out.println("Grade : D");
				}
				
		else {
			System.out.println("Grade : FAIL ");
		}

	}

}
