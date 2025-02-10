public class HomeMaintenance implements MaintenanceBehaviour {

    @Override
    public void maintainVehicle(Vehicle vehicle) {
        vehicle.setMaintenanceBill(0); // Free maintenance
        vehicle.setDistanceSinceLastService(0); // Reset distance after maintenance
        System.out.println("Bike has been maintained for free using Home Maintenance!");
    }
}
