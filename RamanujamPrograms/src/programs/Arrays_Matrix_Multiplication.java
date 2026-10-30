package programs;
import java.util.Scanner;
public class Arrays_Matrix_Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the dimensions of 1st matrix :");
		int r1 = sc.nextInt();
		int c1 = sc.nextInt();
		System.out.println("Enter the dimensions of 2nd matrix ");
		int r2 = sc.nextInt();
		int c2 =sc.nextInt();
		
		if (c1!= r2) {
			System.out.println("Matrix Multiplication is not possible ");
		}
		
		int[][]A = new int[r1][c1];
		int[][]B = new int[r1][c2];
		int[][]res = new int[r1][c2];
		
		System.out.println("Elements of 1st matrix ");
		for (int i = 0; i < r1; i++) {
			for (int j = 0; j < c1; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Elements of 2nd matrix ");
		for (int i = 0; i < r2; i++) {
			for (int j = 0; j < c2; j++) {
				B[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < r1; i++) {
			for (int j = 0; j < c2; j++) {
				res[i][j]=0;
				for (int k = 0; k < c1; k++) {
					res[i][j] += A[i][k]*B[k][j];
				}
			}		
		}
		
		for (int i = 0; i < r1; i++) {
			for (int j = 0; j < c2; j++) {
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}
	

}
