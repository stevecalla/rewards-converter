public class RewardValue {
    final private double conversionRate = 0.0035;
    private double cashValue;
    private int milesValue;
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        milesValue = (int) (cashValue / conversionRate);
    }
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        cashValue = milesValue * conversionRate;
    }
    public double getCashValue() {
        return cashValue;
    }
    public int getMilesValue() {
        return milesValue;
    }
}
