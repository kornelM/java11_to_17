package pl.examples.demo.switchpatterns;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SwitchExampleParenthesisTest {

    private SwitchExampleParenthesis switchExampleParenthesis;

    @BeforeEach
    void setup() {
        this.switchExampleParenthesis = new SwitchExampleParenthesis();
    }

    @ParameterizedTest
    @MethodSource("switchTestSupplier")
    void testOldSwitchStatement(Object given, int expected) {
        //given
        //when
        int returned = this.switchExampleParenthesis.getIntUsingIf(given);

        //then
        assertEquals(expected, returned);
    }

    @ParameterizedTest
    @MethodSource("switchTestSupplier")
    void testNewSwitchStatement(Object given, int expected) {
        //given
        //when
        int returned = this.switchExampleParenthesis.getIntUsingSwitch(given);

        //then
        assertEquals(expected, returned);
    }

    private static Stream<Arguments> switchTestSupplier() {
        return Stream.of(
                Arguments.of("alior bank", 10),
                Arguments.of("Alior Lody", -1),
                Arguments.of("ING Bank", -1),
                Arguments.of(Boolean.FALSE, -1),
                Arguments.of(null, -1)
        );
    }
}
