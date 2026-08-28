package programs;
public class Patten_ABCD_For_Loop {

	public static void main(String[] args) {
		
		int i;
		char ch = 'A';
		for (i = 0;  i<= 4;i ++) {
			ch ='A';
			for (int j = 0; j <= i; j++) {
				System.out.print(ch + " ");
				ch++;
			}
			System.out.println();
		}

	}

}
