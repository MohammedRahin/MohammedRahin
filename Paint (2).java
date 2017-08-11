
public class Paint implements Comparable<Paint>{ 

	private String type;
	private double price;
	private int litter;
	private int meter; 
	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	private int total; 
	
	public int getMeter() {
		return meter;
	}

	public void setMeter(int meter) {
		this.meter = meter;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getLitter() {
		return litter;
	}

	public void setLitter(int litter) {
		this.litter = litter;
	}

	public Paint(String type, double p, int l, int m) {
		this.type = type;
		this.litter=l;
		this.meter=m;
		price = p;
		total = l*m;

	}

	@Override
	public String toString() {
		return "Paint [type=" + type + ", price=" + price + ", litter=" + litter + ", meter=" + meter + ", total="
				+ total + "]";
	}
	public int compareTo(Paint compareFruit) {

		int compareQuantity = (int) ((Paint) compareFruit).getPrice();

		//ascending order
		return (int) (this.price - compareQuantity);

		//descending order
		//return compareQuantity - this.quantity;

	}

	


}
