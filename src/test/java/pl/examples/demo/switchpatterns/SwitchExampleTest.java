package pl.examples.demo.switchpatterns;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.DayOfWeek;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SwitchExampleTest {

    private SwitchExampleBasic switchExampleBasic;

    @BeforeEach
    void setup() {
        this.switchExampleBasic = new SwitchExampleBasic();
    }

    @ParameterizedTest
    @MethodSource("switchTestSupplier")
    void testOldSwitchStatement(int given, String expected) {
        //given
        //when
        String returned = this.switchExampleBasic.oldDayOfWeekByNumber(given);

        //then
        assertEquals(expected, returned);
    }

    @ParameterizedTest
    @MethodSource("switchTestSupplier")
    void testNewSwitchStatement(int given, String expected) {
        //given
        //when
        String returned = this.switchExampleBasic.newDayOfWeekByNumber(given);

        //then
        assertEquals(expected, returned);
    }

    private static Stream<Arguments> switchTestSupplier() {
        return Stream.of(
                Arguments.of(0, DayOfWeek.MONDAY.name()),
                Arguments.of(1, DayOfWeek.TUESDAY.name()),
                Arguments.of(2, DayOfWeek.WEDNESDAY.name()),
                Arguments.of(3, DayOfWeek.THURSDAY.name()),
                Arguments.of(4, DayOfWeek.FRIDAY.name()),
                Arguments.of(5, DayOfWeek.SATURDAY.name()),
                Arguments.of(6, DayOfWeek.SUNDAY.name())
        );
    }
}
