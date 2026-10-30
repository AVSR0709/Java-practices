package programs;
import java.util.Scanner;
public class Array_Matrix_Max {

	public static void main(String[] args) {
		  // TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
		  int sum = 0;
		  int rsum =0;
		  System.out.println("Enter the rows of matrix ");
		  int row = sc.nextInt();
		  System.out.println("Enter the column of matrix");
		  int col = sc.nextInt();
		  
		  int[][]matrix = new int[row][col];
		  
		  System.out.println("Enter elements in matrix");
		  for (int i = 0; i < row; i++) {
		   System.out.println("Enter elements of row "+ (i+1) +" in matrix");
		   for (int j = 0; j < col; j++) {
		   matrix[i][j] = sc.nextInt();
		   }
		  }
		  
		  System.out.println("---------------------------------------------------");
		  for (int i = 0; i < row; i++) {
		   for (int j = 0; j < col; j++) {
		    System.out.print(matrix[i][j]+" ");
		   sum = sum+matrix[i][j];
		  }
		   System.out.println();
		   
		 }
		  System.out.println("---------------------------------------------------");
		  for (int i = 0; i < row; i++) {
		   rsum= 0;
		   for (int j = 0; j < col; j++) {
		    

		   rsum = rsum+matrix[i][j];
		  
		   } 
		   System.out.println("Sum of row "+(i+1)+" elements : "+rsum);
		 }

		  System.out.println("---------------------------------------------------");
		  for (int j = 0; j < col; j++) {
		   int csum = 0;
		   for (int i = 0; i < row; i++) {
		    
		    csum =  csum + matrix[i][j];

		   }
		   System.out.println("Sum of "+(j+1)+" column"+" is :"+csum);
		  }
		  System.out.println("---------------------------------------------------");
		  int dsum1 =0;
		  for (int i = 0; i < row; i++) {
		   for (int j = 0; j < col; j++) {
		    if (i == j) {
		      dsum1 = dsum1 + matrix[i][j];
		    }
		   }
		  }
		  System.out.println("The sum of 1st diagonal : "+dsum1);
		  
		  int dsum2 =0;
		  for (int i = row; i >= 0; i--) {
		   for (int j = col; j >= 0; j--) {
		    if (i + j == row-1) {
		      dsum2 = dsum2 + matrix[i][j];
		    }
		   }
		  }
		  System.out.println("The sum of 2nd diagonal : "+dsum2);
		  System.out.println("---------------------------------------------------");
		  
		  int disum =0;int disum1 = 0;
		  for (int i = row-1; i >= 0; i--) {
		   for (int j = col-1; j >= 0; j--) {
		    if (j == (row-1)/2  || i == (col-1)/2 ) {

		      if ((i +j)%2 != 0) {
		        disum = disum + matrix[i][j];
		      
		     }
		      
		    }
		   }
		  }
		  System.out.println("The sum of elements in diamond shape :"+disum);

		  
		  if (row%2 != 0 && col%2 !=0) {
		   for (int i = 0; i < row; i++) {
		    for (int j = 0; j <col; j++) {
		     if (i == (row-1)/2) {
		      if (j == (col-1)/2) {
		       if (i == j) {
		        System.out.println("The middle term of whole matrix is :"+matrix[i][j]);
		       }
		      }
		    }
		   }
		  }
		}
		  System.out.println("---------------------------------------------------");
		  System.out.println("The Extracted Matrix : ");

		  
		  for (int i = ((row-1)/2)-1; i < row-1; i++) {
		   for (int j = ((col-1)/2)-1; j < col-1; j++) {
		    
		    
		    if (row == 3 && col== 3) {
		     System.out.println(matrix[1][1]);
		     break;
		    }
		    
		     System.out.print(matrix[i][j]+" ");
		    
		   }
		   System.out.println();
		  }
		  
		  System.out.println("---------------------------------------------------");
		  System.out.println("Sum of all elements : "+sum);
}}