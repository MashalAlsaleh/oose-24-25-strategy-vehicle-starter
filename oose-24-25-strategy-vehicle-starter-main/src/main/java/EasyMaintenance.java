public class EasyMaintenance implements MaintenanceBehaviour {
	public static final double EASY_MAINTENANCE_MULTIPLIER = 0.05;

	@Override
	public void maintainVehicle(Vehicle vehicle) {
		double maintenanceCost = EASY_MAINTENANCE_MULTIPLIER * vehicle.getDistanceSinceLastService();
		vehicle.setMaintenanceBill(maintenanceCost);
		vehicle.setDistanceSinceLastService(0); // Reset distance after maintenance
		System.out.println("Easy maintenance completed. Cost: $" + maintenanceCost);
	}
}
