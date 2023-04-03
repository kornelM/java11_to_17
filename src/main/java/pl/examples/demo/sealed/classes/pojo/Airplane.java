package pl.examples.demo.sealed.classes.pojo;

public non-sealed class Airplane extends Vehicle implements VehicleService {

    private final int numberOfSeats;

    public Airplane(int numberOfSeats, String manufacturerName) {
        super(manufacturerName);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    @Override
    public int maxServiceIntervalInMonths() {
        return 48;
    }
}
