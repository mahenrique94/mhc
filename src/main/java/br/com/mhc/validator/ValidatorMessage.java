package br.com.mhc.validator;

import br.com.mhc.function.FileFunction;

import java.io.File;
import java.util.Properties;

public class ValidatorMessage implements Message {

    private String message;

    public ValidatorMessage(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        if (isFromProperties())
            return fromProperties();
        return fromString();
    }

    private String fromString() {
        return this.message;
    }

    private String fromProperties() {
        Properties properties = FileFunction.openProperties(new File(ValidatorParameters.PROPERTIES_FILE.get()));
        return properties.getProperty(this.message);
    }

    private boolean isFromProperties() {
        return this.message.startsWith(ValidatorParameters.PROPERTIES_ALIAS.get());
    }

}
