package programs;
import java.util.Scanner;
public class SocialMediaInfluencer {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		long current_influencer =  987543210L;
		int Growing_influencer = 25670;
		long Total_influencer;
		int days;
		
		System.out.println("Enter the number of days : ");
		days = sc.nextInt();
		
		Total_influencer = current_influencer + Growing_influencer*days;
		
		System.out.println("The Total Number Of Followers : "+Total_influencer);

	}

}
