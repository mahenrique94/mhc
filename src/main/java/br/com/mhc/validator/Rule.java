package br.com.mhc.validator;

import java.lang.reflect.Field;

public interface Rule {

    default Object getValueField(Object obj, Field field) {
        field.setAccessible(true);
        try {
            return field.get(obj);
        } catch (IllegalAccessException e) {
            throw new ValidatorException(String.format("[Validator Exception] -> Não foi possível pegar o valor do campo: %s", field.getName().toLowerCase()));
        }
    }

    default ValidatorMessage getMessage() {
        return new ValidatorMessage(String.format("%s.%s", ValidatorParameters.PROPERTIES_ALIAS.get(), getClass().getSimpleName().toLowerCase()));
    }

    default Integer getValue() {
        return null;
    }

    public boolean check(Object obj, Field field);

}
