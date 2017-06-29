package br.com.mhc.validator;

import java.lang.reflect.Field;

public abstract class ValidatorLog {

    public static void print(Message message, Field field, Rule rule) {
        log(message.getMessage(), field.getName().toLowerCase(), rule.getValue());
    }

    private static void log(String message, String field, Integer value) {
        System.out.println(String.format("[Validator Log] -> %s", replaceField(replaceValue(message, value), field)));
    }

    private static String replaceField(String message, String field) {
        return message.replace("${field}", field);
    }

    private static String replaceValue(String message, Integer value) {
        if (value != null)
            return message.replace("${value}", Integer.toString(value));
        return message;
    }

}
