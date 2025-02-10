public class FastTravel implements TravelBehaviour {
	public double travel(double hoursTravelled, Vehicle vehicle) {
		double distance = vehicle.getVehicleSpeed() * hoursTravelled;
		vehicle.setDistanceSinceLastService(vehicle.getDistanceSinceLastService() + distance);
		return distance;
	}
}
