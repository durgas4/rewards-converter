
public class RewardValue {
    private static final double MILES_TO_CASH_RATE = 0.0035;
    private double cash;
    private double miles;

    // Constructor for cash value
    public RewardValue(double cash) {
        this.cash = cash;
        this.miles = cash / MILES_TO_CASH_RATE;
    }

    // Constructor for miles value
    public RewardValue(double miles, boolean isMiles) {
        if (isMiles) {
            this.miles = miles;
            this.cash = miles * MILES_TO_CASH_RATE;
        }
    }

    // Method to get cash value
    public double getCashValue() {
        return cash;
    }

    // Method to get miles value
    public double getMilesValue() {
        return miles;
    }

    public static void main(String[] args) {
        RewardValue rv1 = new RewardValue(100); // cash constructor
        RewardValue rv2 = new RewardValue(10000, true); // miles constructor

        System.out.println("RV1 Cash: " + rv1.getCashValue() + ", Miles: " + rv1.getMilesValue());
        System.out.println("RV2 Cash: " + rv2.getCashValue() + ", Miles: " + rv2.getMilesValue());
    }
}

