public class ExperimentalRemoteControlCar implements RemoteControlCar {

    private int distanceTravelled;
    private static int DISTANCE_PER_SESSION = 20;

    public ExperimentalRemoteControlCar() {
        this.distanceTravelled = 0;
    }

    public void drive() {
        this.distanceTravelled += DISTANCE_PER_SESSION;
    }

    public int getDistanceTravelled() {
        return this.distanceTravelled;
    }
}
