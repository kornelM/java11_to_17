package pl.examples.demo.sealed.classes;

import pl.examples.demo.sealed.classes.pojo.Airplane;
import pl.examples.demo.sealed.classes.pojo.Train;

public class SealedClassesExample {

    public static void main(String[] args) {
        Airplane airplane = new Airplane(150, "Airbus");
        Train train = new Train(10, "Pesa");

        printDetails(airplane);
        printDetails(train);
    }

    private static void printDetails(Train train) {
        System.out.println("_____________");
        System.out.printf("Train manufacturer is %s, has %s train cars, needs to be serviced every %s months (or %s kilometers)\n",
                train.getManufacturerName(),
                train.trainCarsNumber(),
                train.maxServiceIntervalInMonths(),
                train.maxDistanceBetweenServicesInKilometers()
        );
    }

    private static void printDetails(Airplane airplane) {
        System.out.println("_____________");
        System.out.printf("Airplane manufacturer is %s, can take up to %s passengers, needs to be serviced every %s months (or %s kilometers)\n",
                airplane.getManufacturerName(),
                airplane.getNumberOfSeats(),
                airplane.maxServiceIntervalInMonths(),
                airplane.maxDistanceBetweenServicesInKilometers()
        );
    }
}
