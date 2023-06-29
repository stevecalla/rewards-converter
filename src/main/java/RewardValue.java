public class RewardValue {
    public static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;
    private double cashValue;
    private int milesValue;
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        convertCashToMiles();
    }
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        convertMilesToCash();
    }
    public void convertCashToMiles() {
        this.milesValue = (int) (cashValue / MILES_TO_CASH_CONVERSION_RATE);
    }
    public void convertMilesToCash() {
        this.cashValue = milesValue * MILES_TO_CASH_CONVERSION_RATE;
    }
    public double getCashValue() {
        return this.cashValue;
    }
    public int getMilesValue() {
        return this.milesValue;
    }
}
