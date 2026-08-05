package programs;
import java.util.Scanner;
public class FreeShippingProblem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int purchase_total;
		boolean premium_member;
		
		System.out.println("Enter the Purchase Total : ");
		purchase_total = sc.nextInt();
		System.out.println("Are you Premium member : ");
		premium_member = sc.nextBoolean();
		
		System.out.println("Is the Shipping Free : "+((purchase_total>=2000)||(premium_member)));
		

	}

}
