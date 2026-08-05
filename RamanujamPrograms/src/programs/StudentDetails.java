package programs;
public class StudentDetails {
	public static void main(String[] args) {
		int java = 100;
		int DTI = 50;
		int DDCA =30;
		int roll_number=26100;
		int total = DTI+DDCA+java;
		double percentage = (total/300.0)*100;
		System.out.println("Total marks : "+total);
		System.out.println("Total Percentage : "+percentage+" %");
	}
}
 