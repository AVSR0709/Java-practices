package programs;
import java.util.Scanner;
public class Sanchit {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
	int org = n;
	int rev = 0;
	int rem;
		 while (n >0) {
			rem = n%10;
			rev = rev*10+rem;
			n = n/10;
		}
		 System.out.println(rev);
		 if (rev == org) {
			System.out.println("Palindrome");
		}
		 else {
			 System.out.println("Not Pallindrome");
			 }
	}

}
