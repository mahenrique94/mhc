package br.com.mhc.model.validator;

import br.com.mhc.validator.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class PessoaValidator extends ValidatorTemplate implements ValidatorRule {

    @Override
    public Map<String, List<Rule>> rules() {
        addRule("datacadastro", Arrays.asList(new Past()));
        return super.getRules();
    }

}
