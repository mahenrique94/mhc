package br.com.mhc.validator;

import br.com.mhc.function.FileFunction;

import java.io.File;
import java.util.Properties;

public class ValidatorMessage {

    private String message;

    public ValidatorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        if (isFromProperties())
            return fromProperties();
        return fromString();
    }

    public String fromString() {
        return this.message;
    }

    public String fromProperties() {
        Properties properties = FileFunction.openProperties(new File(ValidatorParameters.PROPERTIES_FILE.get()));
        return properties.getProperty(this.message);
    }

    private boolean isFromProperties() {
        return this.message.startsWith(ValidatorParameters.PROPERTIES_ALIAS.get());
    }

}
