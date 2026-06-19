package dinosauring;

public class Argentinasaurs {
	
	public static void main(String[] args) {
		
		System.out.println("Hello welcome to Calculator");
		System.out.println("Taken numbers a = 3 & b = 15 ");
		int first=sum(3,15);
				System.out.println("Total Sum = "+first);
		int second=diff (3,15);	
				System.out.println("Total difference = "+second);
		int third = mult(3,15);
				
				System.out.println("Total product = "+third);
		int fourth = div(3,15);
				System.out.println("Total quotient = "+fourth);
	}
	public static int sum (int a,int b) {		
		int c=a+b;
		return c;
	}
	public static int diff (int a , int b) {
		int d=b-a;
		return d;
	}
	public static int mult (int a ,  int b) {
		int e=a*b;
		return e;
	}
	public static int div (int a , int b ) {
		int f=b/a;
		return f;
		
	}
	
	

}
