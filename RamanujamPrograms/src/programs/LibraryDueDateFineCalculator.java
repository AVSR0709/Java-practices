package programs;
import java.util.Scanner;
public class LibraryDueDateFineCalculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int delayed_days;
		int fine = 10;
		
		System.out.println("Enter the number of delayed days : ");
		delayed_days = sc.nextInt();
		
		if (delayed_days == 0) {
			System.out.println("No fine for delayed days ");
		} else {
			
			int total_fine = delayed_days*fine;
			System.out.println("The total fine : "+total_fine);
		}

	}

}
