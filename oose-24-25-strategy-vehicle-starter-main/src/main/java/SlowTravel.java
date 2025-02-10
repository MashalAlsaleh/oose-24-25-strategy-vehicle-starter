public class SlowTravel implements TravelBehaviour {
	public double travel(double hoursTravelled, Vehicle vehicle) {
		double distance = 0.5 * vehicle.getVehicleSpeed() * hoursTravelled;
		vehicle.setDistanceSinceLastService(vehicle.getDistanceSinceLastService() + distance);
		return distance;
	}
}
