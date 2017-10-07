
public abstract class Car {

	private double cost;
	private double price;
	
	public Car(double cost) {
		this.cost = cost;
		price = cost * 2;
	}
	
	public double getPrice() {
		return price;
	}
	
}
