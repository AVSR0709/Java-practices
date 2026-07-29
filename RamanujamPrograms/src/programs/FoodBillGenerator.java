package programs;
public class FoodBillGenerator {
	public static void main(String[] args) {
		double food_charge=725.50;
		double GST_percent=0.05;
		double servicetax = 0.02;
		double Gst_amount = GST_percent*food_charge;
		double services = servicetax*food_charge;
		double total_fbill=food_charge+Gst_amount+services;
		System.out.println("Total Food Bill : "+total_fbill);
	}
}