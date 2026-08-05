package programs;
import java.util.Scanner;
public class ScholarshipEligibeTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 
		int marks;
		int income;
		System.out.println("Enter the Marks : ");
		marks = sc.nextInt();
		System.out.println("Enter the Family Income :");
		income = sc.nextInt();
		
		System.out.println("Does scholarship eligible : "+((marks>=85)&&(income<=30000)));

	}

}
