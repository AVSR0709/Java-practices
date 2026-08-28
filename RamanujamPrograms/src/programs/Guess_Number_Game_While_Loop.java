package programs;
import java.util.Scanner;
public class Guess_Number_Game_While_Loop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int secret = 36;
		while (true) {
			System.out.println("Enter the number");
			int n = sc.nextInt();
			if (secret == n) {
				System.out.println("Correct !!!");
				break;
			}
			System.out.println("Wrong Guess !!!");
		}

	}

}
