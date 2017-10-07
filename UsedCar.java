public class UsedCar extends Car {

	private int mileage;
	private double cost;
	
	public UsedCar(double cost, int mileage) {
		super(cost);
		this.mileage = mileage;
		this.cost = cost;
	}
	
	public boolean equals(UsedCar car2) {
		boolean endResult = false;
		if(cost == car2.getCost()) {
			if(mileage == car2.getMileage()) {
				endResult = true;
			}
		}
		return endResult;
	}
	
	public int getMileage() {
		return mileage;
	}
	
	public double getCost() {
		return cost;
	}
	
	public void display() {
		System.out.println("price = $" + this.getPrice() + ", mileage = " + mileage);
	}
}

