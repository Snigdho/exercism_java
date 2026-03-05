public class JedliksToyCar {

    private int meterDriven;
    private static int batteryConsumedPerPercentagebByMeter = 20;

    public void JedliksToyCar(int m) {
        this.meterDriven = 0;
    }

    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return String.format("Driven &d meters", this.meterDriven);
    }

    public String batteryDisplay() {
        int batteryPercentage =
            100 - (this.meterDriven / batteryConsumedPerPercentagebByMeter);
        return batteryPercentage >= 0
            ? String.format("Battery at %d%", batteryPercentage)
            : "Battery empty";
    }

    public void drive() {
        this.meterDriven += 20;
    }
}
