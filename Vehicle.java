
public class Vehicle {

	private String brand;
	private int priceModel;
	private int numberModel;
	private String type;
	private int id;

	public int getId(int id) {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType(String type) {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Vehicle(String b, int price, int number) {
		brand = b;
		priceModel = price;
		numberModel = number;
	}

	public String getBrand() {
		return brand;
	}

	public int getPrice() {
		return priceModel;
	}

	public int getNumber() {
		return numberModel;
	}

	public void setBrand(String carBrand) {
		brand = carBrand;
	}

	public void setPrice(int price) {
		priceModel = price;
	}

	public void setNumber(int number) {
		numberModel = number;
	}

	@Override
	public String toString() {
		return "Vehicle [brand=" + brand + ", priceModel=" + priceModel + ", numberModel=" + numberModel + "]";
	}

}
