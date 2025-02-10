public class HardMaintenance implements MaintenanceBehaviour {
    public static final double HARD_MAINTENANCE_MULTIPLIER = 10;

    @Override
    public void maintainVehicle(Vehicle vehicle) {
        double rawCost = HARD_MAINTENANCE_MULTIPLIER * vehicle.getDistanceSinceLastService();
        double finalCost = vehicle.getInsurance().insuranceCost(rawCost);
        vehicle.setMaintenanceBill(finalCost);
        vehicle.setDistanceSinceLastService(0);
        System.out.println("Hard maintenance completed. Cost after insurance: $" + finalCost);
    }
}