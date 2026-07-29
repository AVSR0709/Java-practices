package programs;
public class HotelRentGenerator {
public static void main(String[] args) {
	double Hotel_charge = 2500;
	double GST =0.05;
	int H_Days = 5;
	double Hotel_total;
	Hotel_total = Hotel_charge *H_Days;
	GST = Hotel_total *GST;
	Hotel_total = Hotel_total + GST ;
	System.out.println("The total bill to be paid : "+Hotel_total);
}
}
