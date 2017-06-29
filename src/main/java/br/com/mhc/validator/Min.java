package br.com.mhc.validator;

import java.lang.reflect.Field;

public class Min implements Rule {

    private final int value;

    public Min(int value) {
        this.value = value;
    }

    @Override
    public Integer getValue() {
        return this.value;
    }

    @Override
    public boolean check(Object obj, Field field) {
        Object value = getValueField(obj, field);
        return value != null || Integer.parseInt(value.toString()) > this.getValue();
    }

}
