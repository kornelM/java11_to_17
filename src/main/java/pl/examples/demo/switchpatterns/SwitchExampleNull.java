package pl.examples.demo.switchpatterns;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

public class SwitchExampleNull {

    public int oldGetInt(Object obj) {
        int valueToReturn;

        if (obj instanceof String) {
            valueToReturn = Integer.parseInt((String) obj);
        } else if (obj instanceof Integer) {
            valueToReturn = ((Integer) obj);
        } else if (obj instanceof Double) {
            valueToReturn = ((Double) obj).intValue();
        } else if (obj instanceof Float) {
            valueToReturn = ((Float) obj).intValue();
        } else if (obj instanceof Boolean) {
            valueToReturn = ((Boolean) obj) ? 1 : 0;
        } else if (isNull(obj)) {
            valueToReturn = -1;
        } else {
            throw new IllegalArgumentException("Unsupported object type! Given value: " + obj + " Supported are: String, Double, Float or null value.");
        }
        return valueToReturn;
    }

    public int newGetInt(Object obj) {
        return switch (obj) {
            case String s -> Integer.parseInt(s);
            case Integer i -> i;
            case Double d -> d.intValue();
            case Float f -> f.intValue();
            case Boolean b -> b ? 1 : 0;
            case null -> -1;
            case default ->
                    throw new IllegalArgumentException("Unsupported object type! Given: " + obj + " Supported are: String, Double, Float or null value.");
        };
    }
}
