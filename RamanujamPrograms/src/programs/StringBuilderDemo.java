package programs;
import java.util.Scanner;
public class StringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("**************************************************");
		
		System.out.println("Enter your Name :");
		String name = sc.next();
		StringBuilder sb = new StringBuilder("Hello ");
		sb.append(name);
		System.out.println(sb);

		System.out.println("**************************************************");
		
		System.out.println("Enter a random word :");
		String word = sc.next();
		StringBuilder sb1 = new StringBuilder(word);
		System.out.println("Enter the word you want to insert  : ");
		String ins = sc.next();
		System.out.println("Enter the position where you want to insert the word "+ins);
		int pos = sc.nextInt();
		pos = pos-1;
		sb1.insert(pos,ins);
		System.out.println(sb1);
		
		System.out.println("**************************************************");
		
		System.out.println("Enter the start and end index to delete : "+sb1);
		int posds = sc.nextInt();
		int posde = sc.nextInt();
		System.out.println("Length of sb1 before deleting : "+sb1.length());
		System.out.println("Deleting elements from "+posds+" to "+posde);
		sb1.delete(posds, posde);
		System.out.println("Length of sb1 after deleting : "+sb1.length());
		
		System.out.println("**************************************************");
	
		
	}

}
