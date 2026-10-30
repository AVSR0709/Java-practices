package programs;

public class Leap_Year_Method_Defination {
public static boolean yleap(int x) {
	if (x%4 ==0 || x%400 == 0 && x%100 !=0) {
		return true;
	} else {
		return false;
	}
}
}
