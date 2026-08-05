package programs;
import java.util.Scanner;
class VoteEligibleTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		short age;
		System.out.println("Enter the Age : ");
		age = sc.nextShort();
		System.out.println("Is the Person eligible to vote : "+(age>=18));

	}

}
