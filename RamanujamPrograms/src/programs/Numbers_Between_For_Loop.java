package programs;
import java.util.Scanner;
public class Numbers_Between_For_Loop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int start,end;
		System.out.println("Enter starting number");
		start = sc.nextInt();
		System.out.println("Enter ending number ");
		end = sc.nextInt();
		for (int i = start; i <= end; i++) {
			System.out.println(i +" ");
		}

	}

}
