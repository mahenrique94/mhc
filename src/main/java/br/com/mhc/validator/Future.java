package br.com.mhc.validator;

import br.com.mhc.function.DateFunction;

import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Future implements Rule {

    @Override
    public boolean check(Object obj, Field field) {
        Object value = getValueField(obj, field);
        return ((Calendar) value).before(Calendar.getInstance());
    }

}
