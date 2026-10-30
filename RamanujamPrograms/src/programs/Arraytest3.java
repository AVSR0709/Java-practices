package programs;
import java.util.Scanner;
public class Arraytest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Row of 1st matrix ");
		int row1 = sc.nextInt();
		System.out.println("Columns of 1st matrix ");
		int col1 = sc.nextInt();
		int [][] mat = new int[row1][col1];
//		System.out.println("Column of 2nd matrix ");
//		int row2 = sc.nextInt();
//		System.out.println("Columns of 2nd matrix ");
//		int col2 = sc.nextInt();
		int [][] mat1 = new int[row1][col1];
		int [][] sum = new int[row1][col1];

		System.out.println("Elements of 1st ");
		for(int i = 0; i < row1; i++) {
			for (int j = 0; j <col1; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println("Elements of 2nd ");
		for (int i1 = 0; i1 < row1; i1++) {
			for (int j1 = 0; j1 <col1; j1++) {
				mat1[i1][j1] = sc.nextInt();
			}
		}
		
		for (int i = 0; i <row1; i++) {
			for (int j = 0; j <col1; j++) {
				
				sum[i][j]=mat[i][j] + mat1[i][j];
				System.out.print(sum[i][j]+" ");
				
			}
			System.out.println();
		}
	
	}

}
