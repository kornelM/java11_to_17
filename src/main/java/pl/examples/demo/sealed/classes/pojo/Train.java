package pl.examples.demo.sealed.classes.pojo;

public final class Train extends Vehicle implements VehicleService {

    private final int trainCarsNumber;

    public Train(int trainCarsNumber, String manufacturerName) {
        super(manufacturerName);
        this.trainCarsNumber = trainCarsNumber;
    }

    public int trainCarsNumber() {
        return trainCarsNumber;
    }

    @Override
    public int maxDistanceBetweenServicesInKilometers() {
        return 500_000;
    }

    @Override
    public int maxServiceIntervalInMonths() {
        return 12;
    }
}
