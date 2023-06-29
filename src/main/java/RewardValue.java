public class RewardValue {
    final private double milesToCashConversionRate = 0.0035;
    private double cashValue;
    private int milesValue;
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        milesValue = (int) (cashValue / milesToCashConversionRate);
    }
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        cashValue = milesValue * milesToCashConversionRate;
    }
    public double getCashValue() {
        return cashValue;
    }
    public int getMilesValue() {
        return milesValue;
    }
}
