package programs;
import java.util.Scanner;
public class MagicalPond {

	public static void main(String[] args) {
		
		
		double volume;
		int days;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of days : ");
		days = sc.nextInt();
		volume = (days)*(days+1)*(2*days+1);
		volume = volume/6;
		System.out.println("The Water in Magical Pond on 6TH day : "+volume+" Ounces");
		volume = volume*0.0295735;
		System.out.printf("The Water in Magical Pond on 6th day (in litres) : %.2f ",volume);

	}

}