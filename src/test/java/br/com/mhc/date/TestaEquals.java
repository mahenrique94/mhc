package br.com.mhc.date;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestaEquals {

    public static void main(String[] args) {
        Calendar niver = new GregorianCalendar(2017, 4, 25, 10, 00);
        Calendar niver2 = new GregorianCalendar(2017, 4, 25, 10, 01);
        System.out.println(niver2.equals(niver));
        System.out.println(niver2.after(niver));
    }

}
