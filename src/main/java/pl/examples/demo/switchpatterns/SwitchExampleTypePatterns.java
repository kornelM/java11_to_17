package pl.examples.demo.switchpatterns;

public class SwitchExampleTypePatterns {

    public int oldDoubleUsingIf(Object obj) {
        int valueToReturn;

        if (obj instanceof String) {
            valueToReturn = Integer.parseInt(((String) obj));
        } else if (obj instanceof Integer) {
            valueToReturn = (Integer) obj;
        } else if (obj instanceof Float) {
            valueToReturn = ((Float) obj).intValue();
        } else if (obj instanceof Double) {
            valueToReturn = ((Double) obj).intValue();
        } else {
            valueToReturn = -1;
        }
        return valueToReturn;
    }

    public int newDoubleUsingSwitch(Object obj) {
        return switch (obj) {
            case String s -> Integer.parseInt(s);
            case Integer i -> i;
            case Float f -> f.intValue();
            case Double d -> d.intValue();
            case default -> -1;
        };
    }
}
