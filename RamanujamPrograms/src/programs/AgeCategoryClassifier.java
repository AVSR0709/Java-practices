package programs;
import java.util.Scanner;
public class AgeCategoryClassifier {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int age;
		System.out.println("Enter the age :");
		age = sc.nextInt();
		
		if (age <= 12 && age >0) {
			System.out.println("Child");
		}
		else if (age <=19 && age>12) {
			System.out.println("Teenager");
		}
		else if (age <= 59 && age >19) {
			System.out.println("Adult");
		}
		else if (age >= 60) {
			System.out.println("Senior Citizen");
		}
		
		else {
			System.out.println("Inappropriate Age");
		}

	}

}
