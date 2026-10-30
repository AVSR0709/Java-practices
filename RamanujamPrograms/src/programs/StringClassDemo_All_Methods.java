package programs;
import java.util.Scanner;
public class StringClassDemo_All_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter vaue for S :");
		String is = sc.nextLine();
		System.out.println("Enter vaue for S1 :");
		String is1 = sc.nextLine();
		System.out.println("Enter vaue for S2 :");
		String is2 = sc.nextLine();
		
		String s= is;
		String s1 = new String(is1);
		String s2 = new String(is2);
		
		System.out.println("******************************************************");
		
		System.out.println("The length of S : "+s.length());
		System.out.println("The length of S1 : "+s1.length());
		System.out.println("The length of S2 : "+s2.length());
		
		System.out.println("******************************************************");
		
		System.out.println("Is S is empty string ? :"+s.isEmpty());
		System.out.println("Is S1 is empty string ? :"+s1.isEmpty());
		System.out.println("Is S2 is empty string ? :"+s2.isEmpty());
		
		System.out.println("******************************************************");
		
		System.out.println("Enter the poition to  be checked :");
		int k = sc.nextInt();
		System.out.println("Charecter at "+k+" position in S : "+s.charAt(k-1));
		System.out.println("Charecter at "+k+" position in S1  : "+s1.charAt(k-1));
		System.out.println("Charecter at "+k+" position in S2  : "+s2.charAt(k-1));
		
		System.out.println("******************************************************");
		
		System.out.println("Is S and S1 are equal  ? : "+s.equals(s1));
		System.out.println("Is S and S2 are equal  ? : "+s.equals(s2));
		System.out.println("Is S1 and S2 are equal  ? : "+s1.equals(s2));

		System.out.println("******************************************************");
		
		System.out.println("Enter Strings to be Concatinated (s/s1/s2)");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			String c1 =s;
			String c2 = s1;
		case 2:
			 c1 =s;
			 c2 = s2; 
		case 3:
			 c1 =s1;
			 c2 = s2;
					
		System.out.println("Concatinating.......");
		System.out.println(c1.concat(c2));
		}
		
		System.out.println("******************************************************");
		
		System.out.print("Checking IndexOf method :  ");
		System.out.println("NCwdcvwHellosdcc".indexOf("Hello"));
		
		System.out.println("******************************************************");
		
		System.out.println("Comparing S and S1 Strings :");
		System.out.println("Without Ignoring Case :"+s.compareTo(s1));
		System.out.println("With Ignoring Case : "+s.compareToIgnoreCase(s1));
		
		System.out.println("******************************************************");
	}

}
