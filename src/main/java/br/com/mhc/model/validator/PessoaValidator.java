package br.com.mhc.model.validator;

import br.com.mhc.validator.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class PessoaValidator extends ValidatorBarrel implements ValidatorRule {

    @Override
    public void setRules() {
        addRule("nome", Arrays.asList(new Required()));
    }

    @Override
    public void setMessages() {

    }

}
