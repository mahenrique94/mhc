package br.com.mhc.validator;

import java.lang.reflect.Field;
import java.util.List;

public class ValidatorEngine implements Validator {

    private ValidatorRule validatorRules;
    private Object obj;

    public ValidatorEngine(ValidatorRule validatorRules, Object obj) {
        this.validatorRules = validatorRules;
        this.obj = obj;
    }

    private Object getObj() {
        return obj;
    }
    private ValidatorRule getValidatorRules() {
        return validatorRules;
    }

    @Override
    public void validate() {
        Field[] fields = getObj().getClass().getDeclaredFields();
        for (Field field : fields) {
            if (hasValidation(field)) {
                List<Rule> rules = takeRules(field);
                rules.forEach(rule -> {
                    if (rule.check(getObj(), field))
                        ValidatorLog.print(getMessage(rule), field, rule);
                });
            }
        }
    }

    private ValidatorMessage getMessage(Rule rule) {
        if (hasMessage(rule))
            return getValidatorRules().messages().get(rule.getClass().getSimpleName().toLowerCase());
        return rule.getMessage();
    }

    private boolean hasMessage(Rule rule) {
        return getValidatorRules().messages() != null && getValidatorRules().messages().containsKey(rule.getClass().getSimpleName().toLowerCase());
    }

    private boolean hasValidation(Field field) {
        return getValidatorRules().rules().containsKey(field.getName().toLowerCase());
    }

    private List<Rule> takeRules(Field field) {
        return getValidatorRules().rules().get(field.getName().toLowerCase());
    }

}
