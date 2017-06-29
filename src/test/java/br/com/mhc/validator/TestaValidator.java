package br.com.mhc.validator;

import br.com.mhc.model.Pessoa;
import br.com.mhc.model.validator.PessoaValidator;

import java.util.GregorianCalendar;

public class TestaValidator {

    public static void main(String[] args) {
        Validator validator = new ValidatorEngine();
        validator.validate(new PessoaValidator(), new Pessoa(1, null, 23, "Masculino", new GregorianCalendar(2017 4 25)));
    }

}
