package programs;
import java.util.Scanner;
public class Numbers_Between_Do_While_Loop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int start,end;
		System.out.println("Enter Starting number");
		start = sc.nextInt();
		System.out.println("Enter Ending number ");
		end = sc.nextInt();
		do {
			System.out.println(start);
			start++;
		} while (start <=end);
		
	}

}
