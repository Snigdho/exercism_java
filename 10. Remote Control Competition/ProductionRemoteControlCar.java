class ProductionRemoteControlCar
    implements RemoteControlCar, Comparable<ProductionRemoteControlCar>
{

    private int distanceTravelled;
    private int numberOfVictories;
    private static int DISTANCE_PER_SESSION = 10;

    public ProductionRemoteControlCar() {
        this.distanceTravelled = 0;
        this.numberOfVictories = 0;
    }

    public void drive() {
        this.distanceTravelled += DISTANCE_PER_SESSION;
    }

    public int getDistanceTravelled() {
        return this.distanceTravelled;
    }

    public int getNumberOfVictories() {
        return this.numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar a) {
        return Integer.compare(
            a.getNumberOfVictories(),
            this.getNumberOfVictories()
        );
        // also works the following:
        // return Integer.compare(a.numberOfVictories, this.numberOfVictories);
    }
}
