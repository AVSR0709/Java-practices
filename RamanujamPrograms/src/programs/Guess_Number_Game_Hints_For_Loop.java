package programs;
import java.util.Scanner;
public class Guess_Number_Game_Hints_For_Loop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int secret = 36 ; int n;
		for (; ; ) {
			System.out.println("Enter your guess : ");
			n = sc.nextInt();
			System.out.println(n);
			if (secret == n) {
				System.out.println("Correct!!!");
				break;
			} 
			else if (n < secret) {
				System.out.println("Guess higher");
			}
			else if (n>secret) {
				System.out.println("Guess lower");
			}
			else {
				System.out.println("Wrong guess !!!");
			}
		}

	}

}
