package programs;

import java.util.Scanner;

public class Arraytest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Row of 1st matrix ");
		int row1 = sc.nextInt();
		System.out.println("Columns of 1st matrix ");
		int col1 = sc.nextInt();
		int [][] mat = new int[row1][col1];

		for(int i = 0; i < row1; i++) {
			for (int j = 0; j <col1; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i <row1; i++) {
			for (int j = 0; j <col1; j++) {
				
				if (i != j) {
					mat[i][j]=0;
					if (i == j ) {
						mat[i][j]=1;
					}
					System.out.println("Identity Matrix");
				}
				
				
			}
			System.out.println();
		}
	}

}
