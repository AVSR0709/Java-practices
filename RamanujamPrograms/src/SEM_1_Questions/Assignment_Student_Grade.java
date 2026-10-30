package SEM_1_Questions;
import java.util.Scanner;
public class Assignment_Student_Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Student name :");
		String name = sc.nextLine();
		System.out.println("Enter the Marks of 1st Subject (out of 100) :");
		int marks_1 = sc.nextInt();
		System.out.println("Enter the Marks of 2nd Subject (out of 100) :");
		int marks_2 = sc.nextInt();
		System.out.println("Enter the Marks of 3rd Subject (out of 100):");
		int marks_3 = sc.nextInt();
		
		int total = marks_1 + marks_2 + marks_3;
		double percentage = (total/300.0)*100;
		
		if (percentage >= 90) {
			System.out.println("Grade : A");
		} 
		else if (percentage <= 89 && percentage >= 75) {
			System.out.println("Grade : B");
		}
		else if (percentage <= 74 && percentage >= 60) {
			System.out.println("Grade : C");
		}
		else if (percentage <= 59 && percentage >= 40) {
			System.out.println("Grade : D");
		}
		else if (percentage <= 39 && percentage >= 0) {
			System.out.println("Grade : F");
			}
		else {
			System.out.println("Please enter the correct marks ");
		}
	}
}
