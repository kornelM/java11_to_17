package pl.examples.demo.switchpatterns;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SwitchExampleNullTest {

    private SwitchExampleNull switchExampleNull;

    @BeforeEach
    void setup() {
        this.switchExampleNull = new SwitchExampleNull();
    }

    @ParameterizedTest
    @MethodSource("switchTestSupplier")
    void testOldSwitchStatement(Object given, int expected) {
        //given
        //when
        int returned = this.switchExampleNull.oldGetInt(given);

        //then
        assertEquals(expected, returned);
    }

    @ParameterizedTest
    @MethodSource("switchTestSupplier")
    void testNewSwitchStatement(Object given, int expected) {
        //given
        //when
        int returned = this.switchExampleNull.newGetInt(given);

        //then
        assertEquals(expected, returned);
    }

    private static Stream<Arguments> switchTestSupplier() {
        return Stream.of(
                Arguments.of(Integer.valueOf(1), 1),
                Arguments.of(Double.valueOf(2.2d), 2),
                Arguments.of(Float.valueOf(3.3f), 3),
                Arguments.of("3", 3),
                Arguments.of(Boolean.TRUE, 1),
                Arguments.of(Boolean.FALSE, 0),
                Arguments.of(null, -1)
        );
    }
}
