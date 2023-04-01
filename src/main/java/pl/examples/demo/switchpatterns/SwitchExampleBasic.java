package pl.examples.demo.switchpatterns;

import java.time.DayOfWeek;

public class SwitchExampleBasic {

    public String oldDayOfWeekByNumber(int dayOfWeek) {
        String valueToReturn;

        switch (dayOfWeek) {
            case 0:
                valueToReturn = DayOfWeek.MONDAY.name();
                break;
            case 1:
                valueToReturn = DayOfWeek.TUESDAY.name();
                break;
            case 2:
                valueToReturn = DayOfWeek.WEDNESDAY.name();
                break;
            case 3:
                valueToReturn = DayOfWeek.THURSDAY.name();
                break;
            case 4:
                valueToReturn = DayOfWeek.FRIDAY.name();
                break;
            case 5:
                valueToReturn = DayOfWeek.SATURDAY.name();
                break;
            case 6:
                valueToReturn = DayOfWeek.SUNDAY.name();
                break;
            default:
                throw new IllegalArgumentException("Unsupported day of the week number! Supported are: 1, 2, 3, 4, 5, 6, 7.");
        }
        return valueToReturn;
    }

    public String newDayOfWeekByNumber(int dayOfWeek) {
        return switch (dayOfWeek) {
            case 0 -> DayOfWeek.MONDAY.name();
            case 1 -> DayOfWeek.TUESDAY.name();
            case 2 -> DayOfWeek.WEDNESDAY.name();
            case 3 -> DayOfWeek.THURSDAY.name();
            case 4 -> DayOfWeek.FRIDAY.name();
            case 5 -> DayOfWeek.SATURDAY.name();
            case 6 -> DayOfWeek.SUNDAY.name();
            default ->
                    throw new IllegalArgumentException("Unsupported day of the week number! Supported are: 1, 2, 3, 4, 5, 6, 7.");
        };
    }
}
