public class HardMaintenance implements MaintenanceBehaviour {
	public static final double HARD_MAINTENANCE_MULTIPLIER = 10;

	@Override
	public void maintainVehicle(Vehicle vehicle) {
		double maintenanceCost = HARD_MAINTENANCE_MULTIPLIER * vehicle.getDistanceSinceLastService();
		vehicle.setMaintenanceBill(maintenanceCost);
		vehicle.setDistanceSinceLastService(0);
		System.out.println("Hard maintenance completed. Cost: $" + maintenanceCost);
	}
}