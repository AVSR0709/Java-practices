package programs;
import java.util.Scanner;
public class CuboidCanPaint {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int length;
		int breadth;
		int height;
		int TSA;
		double cost;
		
		System.out.println("Enter the Length of Can : ");
		length = sc.nextInt();
		System.out.println("Enter the Breadth of Can : ");
		breadth = sc.nextInt();
		System.out.println("Enter the Height of Can : ");
		height = sc.nextInt();
		
		TSA = 2*(length*breadth+breadth*height+height*length);
		cost = TSA*0.05;
		
		System.out.println("The Total Cost to Paint the Can : "+cost);

	}

}
