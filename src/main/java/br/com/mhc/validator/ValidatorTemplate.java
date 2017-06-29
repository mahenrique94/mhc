package br.com.mhc.validator;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class ValidatorTemplate {

    private Map<String, List<Rule>> rules = new HashMap<String, List<Rule>>();
    private Map<String, ValidatorMessage> messages = new HashMap<String, ValidatorMessage>();

    protected Map<String, List<Rule>> getRules() {
        return Collections.unmodifiableMap(this.rules);
    }
    protected Map<String, ValidatorMessage> getMessages() {
        return Collections.unmodifiableMap(this.messages);
    }

    public ValidatorTemplate addRule(String field, List<Rule> rules) {
        this.rules.put(field, rules);
        return this;
    }

    public ValidatorTemplate addMessage(String rule, ValidatorMessage message) {
        this.messages.put(rule, message);
        return this;
    }

}
