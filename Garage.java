import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Garage {

	private ArrayList<Vehicle> S = new ArrayList<Vehicle>();

	public static void main(String[] args) {

		Vehicle a = new Vehicle("Ford", 200, 3);
		Vehicle b = new Car("Car", 500, 4, "red");
		Vehicle c = new bus("Bus", 400, 5, "hybrid");
		Vehicle d = new Motorcycle("Motorcycle", 100, 3, 5);
		Garage g = new Garage();

		g.S.add(b);
		g.S.add(c);
		g.S.add(d);
	

		g.allVehicale();
		// g.calculatebill();
		// g.removeVehicle(c, c.getId(0));
		// g.removeVehicle(c.getType("car"));
		// g.empty(d);

	}

	public void allVehicale() {
		for (Vehicle s : S) {
			System.out.println(s.toString());
		}
	}

	public void calculatebill() {
		int total = 0;
		for (int i = 0; i < S.size(); i++) {
			if (S.get(i) instanceof Vehicle) {

				total = total + pricetype("car");
				System.out.println(total);

			}
			{

			}
		}

	}

	public int pricetype(String type) {

		int price = 0;

		switch (type) {
		case "car":
			price = 200;
			break;

		case "bus":
			price = 300;
			break;
		case "Motorcycle":
			price = 400;
			break;

		}
		return price;
	}

	public void addVehicle(Vehicle v) {
		S.add(v);
		allVehicale();

	}

	public void removeVehicle(Vehicle v, int a) {
		S.remove(v);
		allVehicale();
	}

	public void removeVehicle(String string) {
		S.remove(string);
		allVehicale();
	}

	public void empty(Vehicle v) {
		S.clear();
		allVehicale();
	}

}
