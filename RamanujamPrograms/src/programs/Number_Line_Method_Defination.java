package programs;

public class Number_Line_Method_Defination {
public static String checkN(int x) {
	String num ;
	if (x > 0) {
		num = "Positive";
	}
	else if (x < 0) {
		num = "Negative";
	}
	else {
		num = "Zero";
	}
	return num;
}

}
