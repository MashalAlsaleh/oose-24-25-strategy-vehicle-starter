public class MotorBike extends Vehicle {

    public MotorBike(TravelBehaviour travel, MaintenanceBehaviour maintain, InsuranceBehaviour insurance) {
        super(travel, maintain);
        this.insuranceBehaviour = insurance;
        this.maxSpeed = 50;
    }

    public void takeDamage() {
        System.out.println("switching to hard maintenance.");
        this.setMaintain(new HardMaintenance());
    }
}
