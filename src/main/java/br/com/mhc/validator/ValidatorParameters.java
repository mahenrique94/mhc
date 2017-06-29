package br.com.mhc.validator;

public enum ValidatorParameters {

    PROPERTIES_FILE("validator.properties"),
    PROPERTIES_ALIAS("validator.field.");

    private String s;

    ValidatorParameters(String s) {
        this.s = s;
    }

    public String get() {
        return this.s;
    }

}
