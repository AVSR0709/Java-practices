package programs;
import java.util.Scanner;
public class arraytest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Rows");
		int row = sc.nextInt();
		System.out.println("Columns");
		int col = sc.nextInt();
		int[][] mat = new int[row][col];
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		for (int j = 0; j<col; j++) {
			for (int i = 0; i <row; i++) {
			
			System.out.print(mat[i][j]+" ");
			
			
			}
			System.out.println();
		}
		
	}

}
