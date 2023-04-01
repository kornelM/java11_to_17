package pl.examples.demo.nullPointerException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.examples.demo.nullPointerException.dto.Car;
import pl.examples.demo.nullPointerException.dto.CarDetails;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class NullPointerExceptionExampleTest {

    private NullPointerExceptionExample nullPointerExceptionExample;

    @BeforeEach
    void setup() {
        this.nullPointerExceptionExample = new NullPointerExceptionExample();
    }

    @Test
    // jvm property: -XX:+ShowCodeDetailsInExceptionMessages
    void test() {
        //given
        String expectedMessage = "Cannot invoke \"pl.examples.demo.nullPointerException.dto.ManufacturerDetails.getName()\" because the return value of \"pl.examples.demo.nullPointerException.dto.CarDetails.getManufacturerDetails()\" is null";
        Car givenCar = Car.builder()
                .details(CarDetails.builder()
                        .manufacturerDetails(null) //intentionally, to highlight manufacturerDetails has a null value
                        .build())
                .build();

        //when
        NullPointerException thrownException = assertThrows(NullPointerException.class, () -> nullPointerExceptionExample.getManufacturerName(givenCar));

        //then
        assertEquals(expectedMessage, thrownException.getMessage());
    }
}
