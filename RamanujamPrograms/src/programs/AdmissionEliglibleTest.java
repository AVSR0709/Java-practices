package programs;
import java.util.Scanner;
public class AdmissionEliglibleTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int rank;
		boolean sports;
		
		System.out.println("Enter the Rank in Entrance Test  : ");
		rank = sc.nextInt();
		System.out.println("Does belong to Sports Quota : ");
		sports = sc.nextBoolean();
		
		System.out.println("Did get Admission : "+((rank<=500)||(sports)));
		sc.close();
}

}
