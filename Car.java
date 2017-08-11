
public class Car extends Vehicle {

	private String colour;

	public Car(String b, int price, int number, String colour) {
		super(b, price, number);

		this.colour = colour;
	}

	public void setBrand(String carColour) {
		colour = carColour;
	}

	public String getColour() {
		return (colour);
	}

}
