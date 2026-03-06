// https://exercism.org/tracks/java/exercises/need-for-speed

class NeedForSpeed {

    private int speed;
    private int batteryDrain;
    private int distanceDriven;
    private int batteryRemaining;

    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        this.distanceDriven = 0;
        this.batteryRemaining = 100;
    }

    public boolean batteryDrained() {
        return this.batteryRemaining < this.batteryDrain;
    }

    public int distanceDriven() {
        return this.distanceDriven;
    }

    public void drive() {
        if (this.batteryRemaining >= this.batteryDrain) {
            this.distanceDriven += this.speed;
            this.batteryRemaining -= batteryDrain;
        }
    }

    public int maxDrivingRange() {
        return (100 / this.batteryDrain) * this.speed;
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {

    private int distance;

    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        return car.maxDrivingRange() >= this.distance;
    }
}
