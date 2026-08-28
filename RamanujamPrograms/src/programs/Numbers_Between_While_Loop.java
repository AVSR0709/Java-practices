package programs;
import java.util.Scanner;
public class Numbers_Between_While_Loop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int start,end;
		System.out.println("Enter the starting number ");
		start = sc.nextInt();
		System.out.println("Enter the ending number ");
		end = sc.nextInt();
		while (start <= end) {
			System.out.println(start);
			start++;
		}

	}

}
