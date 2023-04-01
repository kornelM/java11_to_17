package pl.examples.demo.nullPointerException;

import pl.examples.demo.nullPointerException.dto.Car;

public class NullPointerExceptionExample {

    public String getManufacturerName(Car car){
        return car.getDetails().getManufacturerDetails().getName();
    }
}
