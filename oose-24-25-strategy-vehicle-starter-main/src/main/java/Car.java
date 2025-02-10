public class Car extends Vehicle {

	public Car(TravelBehaviour travel, MaintenanceBehaviour maintain) {
		super(travel, maintain);
		this.maxSpeed = 70;
	}

	public void takeDamage() {
		System.out.println("Car has taken damage! Switching to Hard Maintenance.");
		this.setMaintain(new HardMaintenance()); // Change to Hard Maintenance
	}
}
