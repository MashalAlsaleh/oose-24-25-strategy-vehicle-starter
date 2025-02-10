public class Bike extends Vehicle {

    public Bike(TravelBehaviour travel, MaintenanceBehaviour maintain) {
        super(travel, maintain);
        this.maxSpeed = 15;
    }

    public void learnHomeMaintenance() {
        System.out.println("switching to home maintenance.");
        this.setMaintain(new HomeMaintenance()); 
    }
}