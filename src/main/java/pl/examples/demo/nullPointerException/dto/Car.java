package pl.examples.demo.nullPointerException.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Car {

    private final CarDetails details;
}
