package br.com.mhc.validator;

import br.com.mhc.model.Pessoa;
import br.com.mhc.model.validator.PessoaValidator;

import java.util.GregorianCalendar;

public class TestaValidator {

    public static void main(String[] args) {
        Pessoa p = new Pessoa(1, null, 23, "Masculino", new GregorianCalendar(2017, 10, 25));
        Validator validator = new ValidatorEngine(new PessoaValidator(), p);
        validator.validate();
    }

}
