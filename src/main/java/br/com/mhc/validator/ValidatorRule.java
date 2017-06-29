package br.com.mhc.validator;

import java.util.List;
import java.util.Map;

public interface ValidatorRule {

    public void setRules();
    public void setMessages();
    Map<String, List<Rule>> getRules();
    Map<String, ValidatorMessage> getMessages();

}
