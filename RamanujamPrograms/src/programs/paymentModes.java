package programs;
import java.util.Scanner;
abstract class paymentModes{
	protected double amount;
	public paymentModes(double amount) {
		this.amount= amount;
		}
	
	abstract public void makePayment();
	
}
class UPI extends paymentModes{
	private int upiID;
	public UPI(double amount,int upiID) {
		super(amount);
		this.upiID = upiID;
	}
	@Override
	public void makePayment() {
		System.out.println("The payment done by UPI: "+this.upiID+"\namount paid: "+this.amount);
	}
}
class DebitCard extends paymentModes{
	private int DcardNumber;
	private int dCVV;
	private int Dpin;
	public DebitCard(double amount,int DcardNumber,int dCVV,int Dpin) {
		super(amount);
		this.DcardNumber = DcardNumber;
		this.dCVV = dCVV;
		this.Dpin = Dpin;
	}

@Override
public void makePayment() {
	System.out.println("The payment done by Debit Card: "+this.DcardNumber+" ,"+this.dCVV+" ,"+this.Dpin+"\nAmount paid: "+this.amount);;
    }
}
class CreditCard extends paymentModes{
		private int CcardNumber;
		private int cCVV;
		private int Cpin;
		public CreditCard(double amount,int CcardNumber,int cCVV,int Cpin) {
			super(amount);
			this.CcardNumber = CcardNumber;
			this.cCVV = cCVV;
			this.Cpin = Cpin;
		}
		@Override
		public void makePayment() {
			System.out.println("The payment done by Credit Card: "+this.CcardNumber+" ,"+this.cCVV+" ,"+this.Cpin+"\nAmount paid: "+this.amount);
		    }
}
class COD extends paymentModes{
	public COD(double amount) {
		super(amount);
	}
	@Override
	public void makePayment() {
	System.out.println("The payment done by Cash on Delivery: "+"\nAmount paid: "+this.amount);
    }
}
class AmazonPaymentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc  = new Scanner(System.in);
System.out.println("1.Upi"+"\n2.Debit Card"+"\n3.Credit Card"+"\n4.COD");

paymentModes p ;
int choice = sc.nextInt();
switch(choice) {
case 1:
	p= new UPI(10000,357357);
	p.makePayment();
	break;
case 2:
	p= new DebitCard(10000,23456789,544,8907);
	p.makePayment();
	break;
case 3:
	p=new CreditCard(10000,23623264,432,5322);
	p.makePayment();
	break;
case 4:
	p = new COD(80676);
	p.makePayment();
	break;
	default:
		System.out.println("Invalid Choice");
}

	}

}
