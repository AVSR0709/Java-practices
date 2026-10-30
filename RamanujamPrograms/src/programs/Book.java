package programs;
class Book{
	protected double price;
	protected int pageCount;
	public Book(double price,int pageCount) {
		this.price = price;
		this.pageCount = pageCount;
	}
	@Override
	public String toString() {
		return "Price: "+this.price+"\nPage Count: "+this.pageCount;
	}
	public double caluclatePrice() {
		return this.price;
	}
}
class Notebook extends Book{
	private String nbType;
	private String manufactureName;
	private double discount;
	public Notebook(double price,int pageCount,String nbType,String manufactureName,double discount) {
		super(price,pageCount);
		this.nbType = nbType;
		this.manufactureName = manufactureName;
		this.discount = discount;
	}
	@Override
	public double caluclatePrice() {
		return super.price - (super.price * (this.discount));
	}
	@Override
	public String toString() {
		return "Notebook Type: "+this.nbType+"\nManufacture Name: "+this.manufactureName+
				"  "+super.toString()+"  "+this.caluclatePrice()+"\nDiscount: "+this.discount;
	}
	
}
class TextBook extends Book{
	private String name;
	private String title;
	private double discount;
	public TextBook(double price,int pageCount,String name,String title,double discount) {
		super(price,pageCount);
		this.name = name;
		this.title = title;
		this.discount = discount;
	}

@Override 
public double caluclatePrice() {
return super.caluclatePrice() - (super.caluclatePrice()*this.discount);
   }
@Override
public String toString() {
	return this.name + "  "+this.title+"   "+super.toString()+"  "+this.caluclatePrice();
}
}
class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Notebook obj = new Notebook(200,260,"Ruled","ABC",17);
TextBook ojb = new TextBook(270,500,"Ret","Title",60);

System.out.println(obj);
System.out.println(ojb);
	}

}

