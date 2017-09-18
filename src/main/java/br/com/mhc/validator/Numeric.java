package br.com.mhc.validator;

import java.lang.reflect.Field;
import java.util.regex.Pattern;

public class Numeric implements Rule {

    @Override
    public boolean check(Object obj, Field field) {
//        Pattern pattern = new Pattern("([A-Z])");
        return false;
    }

}
