public class GoldInsuranceBehaviour implements InsuranceBehaviour {
    @Override
    public double insuranceCost(double cost) {
        return (cost > 50) ? 50 : cost;
    }
}