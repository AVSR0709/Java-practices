package programs;
import java.util.Scanner;
public class Matrix_Symmetric_Checker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int scount =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Rows of Matrix ");
		int row = sc.nextInt();
		System.out.println("Enter the Columns of Matrix");
		int col = sc.nextInt();
		
		if(row != col) {
			System.out.println("The given matrix cannot be symmetric");
		}
		// Giving inputs for matrix
		
		if(row == col) {
		int [][] mat1= new int[row][col];
		System.out.println("Enter the elements into matrix");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				mat1 [i][j] = sc.nextInt();
			}
		}
		
		// Making transpose of given matrix
		int [][] mat2 = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				mat2[j][i] = mat1[i][j];
			}
		}

		//Copying transpose matrix
		System.out.println("The Transpose Matrix of the given Matrix ");
		int [][] ano = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++) {
				ano[i][j]=mat2[i][j];
			}
		}
		for (int i = 0; i <row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(ano[i][j] +" ");
			}
			System.out.println();
		}
		
		//Checking Each Element
		if (row == col) {
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					if (mat1[i][j] == ano[i][j]) {
						 scount ++;		
					}
				}
			}	
		}
		
		 if (scount == row*col) {
				System.out.println("It is Symmetric Matrix");
			}
			 else {
				 System.out.println("It is not Symmetric Matrix");			 
			 }
		} 
	}
}
