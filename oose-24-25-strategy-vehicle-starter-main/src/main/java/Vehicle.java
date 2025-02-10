public abstract class Vehicle {
	
	protected TravelBehaviour travelBehaviour;
	protected MaintenanceBehaviour maintainBehaviour;
	private double maintenanceBill;
	private double distanceSinceLastService;
	protected double maxSpeed;
	
	public Vehicle(TravelBehaviour travel, MaintenanceBehaviour maintain) {
		this.travelBehaviour = travel;
		this.maintainBehaviour = maintain;
		this.maintenanceBill = 0;
		this.distanceSinceLastService = 0;
	}

	public double travel(double timeTravelled) {
		if (travelBehaviour != null) {
			return travelBehaviour.travel(timeTravelled, this);
		}
		return 0;
	}

	public void maintain() {
		if (maintainBehaviour != null) {
			maintainBehaviour.maintainVehicle(this);
		}
	}

	public double getVehicleSpeed() {
		return maxSpeed;
	}

	public void setVehicleSpeed(double speed) {
		this.maxSpeed = speed;
	}

	public TravelBehaviour getTravel() {
		return travelBehaviour;
	}

	public void setTravel(TravelBehaviour travel) {
		this.travelBehaviour = travel;
	}

	public MaintenanceBehaviour getMaintain() {
		return maintainBehaviour;
	}

	public void setMaintain(MaintenanceBehaviour maintain) {
		this.maintainBehaviour = maintain;
	}

	public double getMaintenanceBill() {
		return maintenanceBill;
	}

	public void setMaintenanceBill(double maintenanceBill) {
		this.maintenanceBill = maintenanceBill;
	}

	public double getDistanceSinceLastService() {
		return distanceSinceLastService;
	}

	public void setDistanceSinceLastService(double distanceSinceLastService) {
		this.distanceSinceLastService = distanceSinceLastService;
	}
}
