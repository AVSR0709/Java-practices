package programs;
import java.util.Scanner;
public class StringBuilder_Own_Code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean repeat;
		boolean same;
		System.out.println(" ----------------- Welcome to StringBuilder Methods Tester ----------------");
		do {
			
			System.out.println("**************************************************");
			
			System.out.println("Enter the First String ");
			String sb = sc.next();
			StringBuilder sbt = new StringBuilder(sb);
			System.out.println("Enter the Second String");
			String sb1 = sc.next();
			StringBuilder sbt1 = new StringBuilder(sb1);
			
			System.out.println("**************************************************");
			
			System.out.println("Select the Method you want to check ");
			System.out.println("1.Append");
			System.out.println();
			System.out.println("2.Char At");
			System.out.println();
			System.out.println("3.Comapare To");
			System.out.println();
			System.out.println("4.Delete");
			System.out.println();
			System.out.println("5.Reverse");
			System.out.println();
			System.out.println("6.Index Of");
			System.out.println();
			System.out.println("7.Insert");
			System.out.println();
			System.out.println("8.Is Empty");
			System.out.println();
			System.out.println("9.Length ");
			System.out.println();
			System.out.println("10.Replace");
			System.out.println();

			int select = sc.nextInt();
			
			System.out.println("**************************************************");
			
			switch(select) {
			
			case 1:
				System.out.println("Appending SB and SB1....");
				System.out.println("After Appending :"+sbt.append(sbt1));
				break;
				
			case 2:
				System.out.println("Enter the position to check :");
				int check = sc.nextInt();
				System.out.println("Checking...");
				System.out.println("Charecter at position "+check+" for First String is : "+sbt.charAt(check-1)); 
				System.out.println("Charecter at position "+check+" for Second String is : "+sbt1.charAt(check-1)); 
				break;
				
			case 3:
				System.out.println("Comparing both Strings with each other.....");
				boolean res;
				if (sbt.compareTo(sbt1)==0) {
					res=true;
				}
				else {
					res =false;
				}
				System.out.println("Are they Same ? : "+res);
				break; 
				
			case 4:
				System.out.println("Select the type of deletion :");
				System.out.println("1. Deleting elements between two Positions");
				System.out.println("2. Deleting Charecter at one position");
				int sel = sc.nextInt();
				if (sel == 1) {
					System.out.println("Enter Position of Starting element ");
					int fi = sc.nextInt();
					System.out.println("Enter Position of Ending element ");
					int ei = sc.nextInt();
					System.out.println("Strings Before Deletion :");
					System.out.println("First String : "+sbt);
					System.out.println("Second String : "+sbt1);
					System.out.println("Deleting.......");
					System.out.println("After Deletion : ");
					System.out.println("First String : "+sbt.delete(fi-1,ei+1));
					System.out.println("Second String : "+sbt1.delete(fi-1,ei+	1));
					break;
					
				}
				else if (sel == 2) {
					System.out.println("Enter the Position to be Deleted");
					int pos=sc.nextInt();
					System.out.println("Strings Before Deletion :");
					System.out.println("First String : "+sbt);
					System.out.println("Second String : "+sbt1);
					System.out.println("Deleting.......");
					System.out.println("After Deletion : ");
					System.out.println("First String : "+sbt.deleteCharAt(pos-1));
					System.out.println("Second String : "+sbt1.deleteCharAt(pos-1));
					break;
					
				}
				else {
					System.out.println("Please enter the correct value ");
				}
				
			case 5:	
				System.out.println("Enter the String to be reversed  [SB(0) / SB1(1)]");
				int rev = sc.nextInt();
		
				System.out.println("Reversing the selected String ... ");
				if (rev == 0) {
					System.out.println("Before Reversing : "+sbt);
					System.out.println("After reversing of String SB : "+sbt.reverse());  
				}
				else if (rev == 1) {
					System.out.println("Before Reversing : "+sbt1);
					System.out.println("After reversing of String SB1 : "+sbt1.reverse()); 
				}
				else {
					System.out.println("Please select correct string  ");
				}
				break;

				
			case 6:
				System.out.println("Select the Main String [SB(0) / SB1(1)] :");
				int main = sc.nextInt();
				System.out.println("Select the Sub String [SB(0) / SB1(1)] :");
				int sub = sc.nextInt();
				boolean val;
				if (main == 0 && sub == 1) {
					System.out.println("Checking the Index of ");
					if(sbt.indexOf(sb1)==-1){
						val = false;
					}
					else {
						val = true;
					}
					System.out.println("Is SB1 the Sub-String of SB : "+val);
				} 
				else if (main == 1 && sub==0) {
					System.out.println("Checking the Index of ");
					System.out.println(sbt1.indexOf(sb));
					if(sbt1.indexOf(sb)==-1){
						val = false;
					}
					else {
						val = true;
					}
					System.out.println("Is SB the Sub-String of SB1 : "+val);
				}
				else {
					System.out.println("Please select the correct Strings");
				}
				break;
				
			case 7:
				System.out.println("Enter the position where you want to insert :");
				int inspos = sc.nextInt();
				System.out.println("Enter element you want to insert :");
				String insstr = sc.next();
				System.out.println("Select String in which you want to insert [SB(0) / SB1(1)] ");
				int inssel = sc.nextInt();
				if (inssel == 0) {
					System.out.println("Before Inserting : "+sbt);
					System.out.println("Inserting...");
					System.out.println("After Inserting : ");
					System.out.println(sbt.insert(inspos,insstr));
				}
				else if (inssel == 1) {
					System.out.println("Before Inserting : "+sbt1);
					System.out.println("Inserting...");
					System.out.println("After Inserting : ");
					System.out.println(sbt1.insert(inspos,insstr));
				}
				else {
					System.out.println("Please select correct string to insert ");
				}
				break;
				
			case 8:
				System.out.println("Enter the String to be check if it is Empty or not [SB(0) / SB1(1)]");
				int emp = sc.nextInt();
				System.out.println("Checking is the selected String is Empty or not ");
				if (emp == 0) {
					System.out.println("Is the String SB Empty ? : "+sbt.isEmpty());  
				}
				else if (emp == 1) {
					System.out.println("Is the String SB1 Empty ? : "+sbt1.isEmpty()); 
				}
				else {
					System.out.println("Please select correct string to insert ");
				}
				break;
				
			case 9:
				System.out.println("Enter the String to check its length  [SB(0) / SB1(1)]");
				int len = sc.nextInt();
				System.out.println("Checking the length... ");
				if (len == 0) {
					System.out.println("Length of String SB : "+sbt.length());  
				}
				else if (len == 1) {
					System.out.println("Length of String SB1 : "+sbt1.length()); 
				}
				else {
					System.out.println("Please select correct string to check its length ");
				}
				break;
				
			case 10:
				System.out.println("Enter the String to replace the element  [SB(0) / SB1(1)]");
				int rep = sc.nextInt();
				System.out.println("Enter the position of Starting Element ");
				int ressta = sc.nextInt();
				System.out.println("Enter the position of Ending Element ");
				int resend = sc.nextInt();
				System.out.println("Enter the element with what you want to replace ");
				String repstr = sc.next();
				System.out.println("Replacing the element... ");
				if (rep == 0) {
					System.out.println("After replacing  of String SB : "+sbt.replace(ressta-1, resend, repstr));  
				}
				else if (rep == 1) {
					System.out.println("After replacing of String SB1 : "+sbt1.replace(ressta-1, resend, repstr)); 
				}
				else {
					System.out.println("Please select correct string to check its length ");
				}
				break;
			}
			
			System.out.println("**************************************************");
			
//			if (repeat = true ) {
//				if (same=true) {
//					
//				}
//				else {
//					
//				}
//				
//			}
//			
//			else {
//
//			}
			
			System.out.println("**************************************************");
			
			System.out.println("Do you want to repeat the code ");
			 repeat = sc.nextBoolean();
//			System.out.println("Do you want to keep same or change the values of Strings");
//			same = sc.nextBoolean();
			
		} while (repeat);
		}
	}


