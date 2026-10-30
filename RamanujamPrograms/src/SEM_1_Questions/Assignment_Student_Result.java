package SEM_1_Questions;
import java.util.Scanner;
public class Assignment_Student_Result {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Student name :");
		String name = sc.nextLine();
		System.out.println("Enter the Marks of 1st Subject :");
		int marks_1 = sc.nextInt();
		System.out.println("Enter the Marks of 2nd Subject:");
		int marks_2 = sc.nextInt();
		System.out.println("Enter the Marks of 3rd Subject :");
		int marks_3 = sc.nextInt();
		
		int total = marks_1 + marks_2 + marks_3;
		double percentage = (total/3);
		
		if (percentage >= 75) {
			System.out.println("Distinction");
		} 
		else if (percentage <= 74 && percentage >= 60) {
			System.out.println("First Class");
		}
		else if (percentage <= 59 && percentage >= 50) {
			System.out.println("Second Class");
		}
		else if (percentage <= 49 && percentage >= 40) {
			System.out.println("Pass");
		}
		else if (percentage <= 39 && percentage >= 0) {
			System.out.println("Fail");
			}
		else {
			System.out.println("Please enter the correct marks ");
		}
	}

}
