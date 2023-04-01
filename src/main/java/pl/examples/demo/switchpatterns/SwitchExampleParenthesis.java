package pl.examples.demo.switchpatterns;

import pl.examples.demo.switchpatterns.utils.StringValidator;

import java.util.function.Function;

public class SwitchExampleParenthesis {

    public int getIntUsingIf(Object o) {
        return switch (o) {
            case String s -> {
                if (s.length() > 0) {
                    if (s.contains("alior") && s.contains("bank")) {
                        yield 0;
                    } else if (s.contains("ing") && s.contains("bank")) {
                        yield 1;
                    } else {
                        yield -1;
                    }
                } else {
                    yield -1;
                }
            }
            case null, default -> -1;
        };
    }

    public int getIntUsingSwitch(Object o) {
        return switch (o) {
            case String s && s.length() > 0 && (s.contains("alior") && s.contains("bank")) -> 0;
            case String s && s.length() > 0 && (s.contains("ing") && s.contains("bank")) -> 1;
            case null, default -> -1;
        };
    }

//    public int getIntUsingSwitchWithFunction(Object o) {
//        return switch (o) {
//            case String s && validator.apply(s) -> s.length();
//            case null, default -> -1;
//        };
//    }
//
//    Function<String, Boolean> validator = s -> s.length() > 0 && (s.contains("alior") && s.contains("bank"));

//    public int getIntUsingSwitchWithEnum(Object o) {
//        return switch (o) {
//            case String s && StringValidator.LENGTH_VALIDATOR.validate(s) -> s.length();
//            case null, default -> -1;
//        };
//    }
}
