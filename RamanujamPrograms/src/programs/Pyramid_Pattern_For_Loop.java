package programs;

public class Pyramid_Pattern_For_Loop {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 4;i ++) {
			for (int s = 1; s <= 4-i; s++) {
				
				System.out.print(" ");
			}
			for (int j = 0; j <= 2*i-1; j++) {
				System.out.print(" * ");
				
			}
			System.out.println();
		}
		
	}

}
