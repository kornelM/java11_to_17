package pl.examples.demo.sealed.classes.pojo;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public abstract sealed class Vehicle permits Airplane, Train {

    protected final String manufacturerName;
}
