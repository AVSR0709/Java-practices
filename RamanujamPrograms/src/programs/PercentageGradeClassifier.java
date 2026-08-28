package programs;
import java.util.Scanner;
public class PercentageGradeClassifier {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int percentage;
		
		System.out.println("Enter the Marks :");
		percentage = sc.nextInt();
		
		if (percentage>=90) {
			System.out.println("Distinction ");
		} 
		else if (percentage>=70) {
			System.out.println("First Class ");
		}
		else if (percentage>=60) {
			System.out.println("Second Class ");	
				}
		else if (percentage>35) {
			System.out.println("Pass ");
		}
		else {
			System.out.println("Fail ");
		}

	}

}
