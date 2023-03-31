package pl.examples.demo.switchpatterns.utils;

public enum StringValidator {

    LENGTH_VALIDATOR {
        @Override
        public boolean validate(String s) {
            return s.length() > 0 && (s.contains(PLACEHOLDER_ALIOR) && s.contains(PLACEHOLDER_BANK));
        }
    };

    private static final String PLACEHOLDER_ALIOR = "alior";
    private static final String PLACEHOLDER_BANK = "bank";

    public abstract boolean validate(String s);
}
