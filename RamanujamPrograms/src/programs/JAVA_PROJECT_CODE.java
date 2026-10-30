package programs;
import java.util.Scanner;

class ElectricityBill {
    private int consumerId;
    private String consumerName;
    private double unitsConsumed;
    protected double totalBill;

    static String companyName = "TSSPDCL";
    static double serviceCharge = 50;
    static int consumerCount = 0;

    ElectricityBill() {
        consumerCount++;
        consumerId = consumerCount;
    }

    ElectricityBill(String name, double units) {
        this();
        consumerName = name;
        unitsConsumed = units;
    }

    public int getConsumerId() {
        return consumerId;
    }

    public String getConsumerName() {
        return consumerName;
    }

    public double getUnitsConsumed() {
        return unitsConsumed;
    }

    public double getTotalBill() {
        return totalBill;
    }

    public double calculateBill() {
        double rate;

        if (unitsConsumed <= 100)
            rate = 3;
        else if (unitsConsumed <= 300)
            rate = 5;
        else
            rate = 6.5;

        totalBill = rate * unitsConsumed + serviceCharge;
        return totalBill;
    }

    public double calculateBill(boolean gst) {
        calculateBill();

        if (gst)
            totalBill = totalBill + totalBill * 0.05;

        return totalBill;
    }

    public String compareBill(ElectricityBill e2) {
        if (totalBill > e2.totalBill)
            return consumerName;
        else
            return e2.consumerName;
    }

    public void displayDetails() {
        System.out.println("ID: " + consumerId);
        System.out.println("Name: " + consumerName);
        System.out.println("Units: " + unitsConsumed);
        System.out.println("Total Bill: " + totalBill);
    }

    public static String findHighestBill(ElectricityBill[] bills) {
        ElectricityBill best = bills[0];

        for (int i = 0; i < bills.length; i++) {
            bills[i].calculateBill();

            if (bills[i].totalBill > best.totalBill)
                best = bills[i];
        }

        return best.consumerName;
    }
}

class CommercialBill extends ElectricityBill {
    private double connectedLoadKW;
    static double demandChargePerKW = 120;

    CommercialBill(String name, double units, double load) {
        super(name, units);
        connectedLoadKW = load;
    }

    @Override
    public double calculateBill() {
        totalBill = super.calculateBill()
                + connectedLoadKW * demandChargePerKW;
        return totalBill;
    }

    public double calculatePenalty(int daysLate) {
        if (daysLate <= 0)
            return 0;

        return 0.02 * totalBill * daysLate;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Load: " + connectedLoadKW + " kW");
        System.out.println("Demand Charge: "
                + connectedLoadKW * demandChargePerKW);
    }
}

public class JAVA_PROJECT_CODE
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many consumers? ");
        int n = sc.nextInt();

        ElectricityBill[] bills = new ElectricityBill[n];
        boolean[] gst = new boolean[n];
        int[] daysLate = new int[n];

        for (int i = 0; i < n; i++) {
            boolean valid = false;

            while (!valid) {
                System.out.print("Type (D/C): ");
                String type = sc.next().toUpperCase();

                System.out.print("Name: ");
                String name = sc.next();

                System.out.print("Units: ");
                double units = sc.nextDouble();

                double load = 1;
                int late = 0;

                if (type.equals("C")) {
                    System.out.print("Load (kW): ");
                    load = sc.nextDouble();
                }

                System.out.print("Include GST (true/false): ");
                boolean includeGST = sc.nextBoolean();

                if (type.equals("C")) {
                    System.out.print("Days late: ");
                    late = sc.nextInt();
                }

                if ((!type.equals("D") && !type.equals("C"))
                        || units < 0 || load <= 0 || late < 0) {

                    System.out.println("Invalid input. Try again.");

                } else {
                    if (type.equals("C")) {
                        bills[i] = new CommercialBill(name, units, load);
                        daysLate[i] = late;
                    } else {
                        bills[i] = new ElectricityBill(name, units);
                    }

                    gst[i] = includeGST;
                    valid = true;
                }
            }
        }

        System.out.println("\n===== "
                + ElectricityBill.companyName + " BILL REPORT =====");

        for (int i = 0; i < n; i++) {
            double amount = bills[i].calculateBill(gst[i]);

            bills[i].displayDetails();
            System.out.println("Bill Amount: " + amount);

            if (bills[i] instanceof CommercialBill) {
                CommercialBill c = (CommercialBill) bills[i];

                System.out.println("Late Penalty: "
                        + c.calculatePenalty(daysLate[i]));
            }

            System.out.println("----------------------");
        }

        if (n >= 2) {
            System.out.println("Higher Bill: "
                    + bills[0].compareBill(bills[1]));
        }

        System.out.println("Highest Bill: "
                + ElectricityBill.findHighestBill(bills));

        System.out.println("Consumer Count: "
                + ElectricityBill.consumerCount);

       
    }
}
 