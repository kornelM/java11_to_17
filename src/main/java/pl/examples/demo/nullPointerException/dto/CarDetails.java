package pl.examples.demo.nullPointerException.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CarDetails {

    private final ManufacturerDetails manufacturerDetails;
}
