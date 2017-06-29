package br.com.mhc.validator;

import java.util.List;
import java.util.Map;

public interface ValidatorRule {

    default public Map<String, ValidatorMessage> messages() {
        return null;
    }

    public Map<String, List<Rule>> rules();

}
