package programs;
import java.util.Scanner;
public class MinutesToHoursChanger {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long minutes;
		long hours;
		
		System.out.println("Enter the time in minutes : ");
		minutes = sc.nextLong();
		hours = minutes/60;
		System.out.println("The Time in Hours : "+hours);
		minutes = minutes%60;
		System.out.println("The Remaining Minutes : "+minutes);

	}

}
