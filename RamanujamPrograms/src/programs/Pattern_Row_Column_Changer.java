package programs;

import java.util.Iterator;

public class Pattern_Row_Column_Changer {

	public static void main(String[] args) {
	
		
		System.out.println("------------------------- Pattern 1 ----------------------");
		int i,j;
		for (i=1;i<=4;i++) {
		for (j=1;j<=i;j++) {
		System.out.print("*");}
		System.out.println();}
		
		System.out.println("------------------------- Pattern 2  ----------------------");

		int i1,j1;
		for (i1=1;i1<=4;i1++) {
		for (j1=1;j1<=i1;j1++) {
		System.out.print(i1 +" ");}
		System.out.println();}
		
		System.out.println("------------------------- Pattern 3 ----------------------");

		int i3,j3;
		for (i3=1;i3<=4;i3++) {
		for (j3=1;j3<=i3;j3++) {
		System.out.print(j3 +" ");}
		System.out.println();}

		System.out.println("------------------------- Pattern 4 ----------------------");

		int i9, j9;
		for (i9 = 1; i9 <= 10; i9++) {
		    for (j9 = 10; j9 >= 1; j9--) {
		        if (j9 == 11 - i9) {
		            System.out.print(j9 + " ");}
		       else {
		            System.out.print("  ");   } }
		    System.out.println();
		}
		System.out.println("------------------------- Pattern 5 ----------------------");
		
		int i6, i7;
		for (i6 = 1; i6 <= 10; i6++) {
		    for (i7 = 1; i7 <= 10; i7++) {
		        if (i7 == i6) {
		            System.out.print((11 - i6) + " ");} 
		        else if (i7 == 11 - i6) {
		            System.out.print((11 - i6) + " "); } 
		        else {
		            System.out.print("  ");}
		    }
		    System.out.println();
		}
	}

}
