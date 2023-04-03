package pl.examples.demo.sealed.classes.pojo;

public sealed interface VehicleService permits Airplane, Train {

    int maxServiceIntervalInMonths();

    default int maxDistanceBetweenServicesInKilometers() {
        return 100000;
    }
}
