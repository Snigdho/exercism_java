// https://exercism.org/tracks/java/exercises/cars-assemble

public class CarsAssemble {

    private static double PRODUCTION_RATE_PER_HOUR_PER_SPEED = 221;
    private static double SUCCESS_RATE_AT_SPEED_10 = 0.77;
    private static double SUCCESS_RATE_AT_SPEED_9 = 0.8;
    private static double SUCCESS_RATE_UP_TO_SPEED_8 = 0.9;
    private static double SUCCESS_RATE_UP_TO_SPEED_4 = 1;

    public double productionRatePerHour(int speed) {
        if (speed == 10) {
            return (
                speed *
                PRODUCTION_RATE_PER_HOUR_PER_SPEED *
                SUCCESS_RATE_AT_SPEED_10
            );
        } else if (speed == 9) {
            return (
                speed *
                PRODUCTION_RATE_PER_HOUR_PER_SPEED *
                SUCCESS_RATE_AT_SPEED_9
            );
        } else if (speed >= 5 && speed <= 8) {
            return (
                speed *
                PRODUCTION_RATE_PER_HOUR_PER_SPEED *
                SUCCESS_RATE_UP_TO_SPEED_8
            );
        } else if (speed >= 1 && speed <= 4) {
            return (
                speed *
                PRODUCTION_RATE_PER_HOUR_PER_SPEED *
                SUCCESS_RATE_UP_TO_SPEED_4
            );
        } else {
            return 0;
        }
    }

    public int workingItemsPerMinute(int speed) {
        return (int) this.productionRatePerHour(speed) / 60;
    }
}
