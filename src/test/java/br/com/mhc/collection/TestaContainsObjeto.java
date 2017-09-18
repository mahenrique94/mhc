package br.com.mhc.collection;

import br.com.mhc.model.Pessoa;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class TestaContainsObjeto {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(1, "Matheus", 23, "Masculino", Calendar.getInstance());
        Pessoa p2 = new Pessoa(1, "Matheus", 23, "Masculino", Calendar.getInstance());
        List<Pessoa> pessoas = new ArrayList<Pessoa>();
        pessoas.add(p1);
        System.out.println(pessoas.contains(p2));
    }

}
