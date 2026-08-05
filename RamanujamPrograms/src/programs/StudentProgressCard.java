package programs;
import java.util.Scanner;
public class StudentProgressCard {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String Name;
		int total_marks;
		int maximum_marks;
		
		System.out.println("Enter the Name of Student : ");
		Name = sc.next();
		System.out.println("Enter the Total Marks Secured : ");
		total_marks = sc.nextInt();
		System.out.println("Enter the Maximum Marks : ");
		maximum_marks = sc.nextInt();
		
		double percentage = (double)total_marks*100/maximum_marks;
		System.out.printf("Name of Student : %s%n",Name);
		System.out.printf("Percentage Secured : %.2f %%%n",percentage);
		int percentage_round1 = (int)percentage;
		System.out.printf("Percentage round off : %d %%%n",percentage_round1);

	}

}
