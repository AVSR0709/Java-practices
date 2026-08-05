package programs;
import java.util.Scanner;
public class ScannerClass {
public static void main(String[] args) {
	int i ;
	float f;
	double d;
	long l;
	short s;
	byte b;
	boolean bool;
	char ch;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Byte Value :");
	b = sc.nextByte();
	System.out.println("Enter the Short Value :");
	s = sc.nextShort();
	System.out.println("Enter the Integer Value :");
	i = sc.nextInt();
	System.out.println("Enter the Long Value :");
	l = sc.nextLong();
	System.out.println("Enter the Float Value :");
	f = sc.nextFloat();
	System.out.println("Enter the Double Value :");
	d = sc.nextDouble();
	System.out.println("Enter the Boolean Value :");
	bool = sc.nextBoolean();
	System.out.println("Enter the Character Value :");
	ch = sc.next().charAt(0);
	System.out.println(" Byte Value :"+b);
	System.out.println(" Short Value :"+s);
	System.out.println(" Integer Value :"+i);
	System.out.println(" Long Value :"+l);
	System.out.println(" Float Value :"+f);
	System.out.println(" Double Value :"+d);
	System.out.println(" Boolean Value :"+bool);
	System.out.println(" Character Value :"+ch);
}
}
