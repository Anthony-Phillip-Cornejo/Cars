
public class NewCar extends Car {

	private String color;
	private double cost;
	
	public NewCar(double cost, String color) {
		super(cost);
		this.color = color;
		this.cost = cost;
	}
	
	public boolean equals(NewCar car2) {
		boolean endResult = false;
		if(cost == car2.getCost()) {
			if(color == car2.getColor()) {
				endResult = true;
			}
		}
		return endResult;
	}
	
	public String getColor() {
		return color;
	}
	
	public double getCost() {
		return cost;
	}
	
	public void display() {
		System.out.println("price = $" + this.getPrice() + ", color = " + color);
	}
}
