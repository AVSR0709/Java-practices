package programs;
import java.util.Scanner;
public class NehaProblem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int days;
		int minutes;
		double total_minutes;
		double total_hours;
		int total_problems;
		
		System.out.println("Enter the number of Days : ");
		days=sc.nextInt();
		System.out.println("Time Taken for each problem : ");
		minutes = sc.nextInt();
		
		total_problems = days*(days+1) / 2;
		total_minutes = total_problems*minutes;
		total_hours = total_minutes/60;
		
		System.out.println("The Number of Days : "+days);
		System.out.println("The Number of Problems : "+total_problems);
		System.out.printf("The Total Minutes Taken to solve : %.2f%n",total_minutes);
		System.out.printf("The Total Hours Taken to solve : %.2f",total_hours);
		
	}

}
