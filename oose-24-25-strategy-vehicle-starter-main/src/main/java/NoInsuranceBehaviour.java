public class NoInsuranceBehaviour implements InsuranceBehaviour {
    @Override
    public double insuranceCost(double cost) {
        return cost;
    }
}
