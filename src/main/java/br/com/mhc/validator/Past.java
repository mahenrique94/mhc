package br.com.mhc.validator;

import java.lang.reflect.Field;
import java.util.Calendar;

public class Past implements Rule {

    @Override
    public boolean check(Object obj, Field field) {
        Object value = getValueField(obj, field);
        return ((Calendar) value).after(Calendar.getInstance());
    }

}
