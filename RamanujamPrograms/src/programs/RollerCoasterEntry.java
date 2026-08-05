package programs;
import java.util.Scanner;
public class RollerCoasterEntry {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double person_height;
		boolean health_problems;
		
		System.out.println("Enter the Height of the Person  : ");
		person_height = sc.nextDouble();
		System.out.println("Is Person Healthy ( No self reported Heart Conditions ) : ");
		health_problems = sc.nextBoolean();
		
		System.out.println("Person Permitted to ride in Roller Coaster : "+((person_height<120)&&(health_problems)));
	}

}
