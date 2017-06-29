package br.com.mhc.validator;

import java.lang.reflect.Field;

public class Future implements Rule {

    @Override
    public boolean check(Object obj, Field field) {
        return false;
    }

}
