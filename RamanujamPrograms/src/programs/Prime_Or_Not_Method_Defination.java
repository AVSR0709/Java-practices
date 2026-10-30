package programs;

public class Prime_Or_Not_Method_Defination {
public static boolean prime(int x) {
	int pcount = 0;
	for (int i = 1; i <=x; i++) {
		if (x%i == 0) {
			pcount++;
		}
	}
	if (pcount == 2) {
		return true;
	}
	else {
		return false;
	}
}
}
