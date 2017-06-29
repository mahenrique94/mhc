package br.com.mhc.validator;

import java.lang.reflect.Field;

public class Required implements Rule {

    @Override
    public boolean check(Object obj, Field field) {
        return getValueField(obj, field) == null;
    }

}
