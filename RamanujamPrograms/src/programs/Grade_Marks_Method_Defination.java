package programs;

public class Grade_Marks_Method_Defination {
public static char Mark(double x , double y , double z) {
	double stotal = x+y+z;
	double rtotal =300;
	double gtotal = (stotal/rtotal)*100;
	char g;
	if (gtotal <= 100 && gtotal >= 90) {
		g ='A';
	} 
	else if (gtotal >= 80 && gtotal < 90) {
		g ='B';
	}
	else if (gtotal >= 70 && gtotal <80) {
		g ='C';
	}
	else {
		g ='F';
	}
	return g;
}
}
