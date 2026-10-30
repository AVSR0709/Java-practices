package programs;

public class Square_cube_method_declaration {

public static int factorial(int x) {
		
	
		int fact = 1;
		
		for (int i = 1; i <= x; i++) {
			fact = fact*i;
		}
		return fact;
	}
public static boolean strong(int x) {
	
	int org =x;
	int sum = 0;
	while (x>0) {
		int digit =x%10;
		sum = sum+factorial(digit);
		x = x/10;
	}
	if(sum == org)
	return true;
	else 
		return false;
}
public static int square(int x) {
		
		int square1 = x*x;
		return square1;
	}
public static int cube(int x) {
	
	int cube1 = x*x*x;
	return cube1;
}


}
