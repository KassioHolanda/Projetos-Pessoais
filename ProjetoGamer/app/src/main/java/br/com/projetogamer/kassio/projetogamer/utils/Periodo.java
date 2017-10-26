package br.com.projetogamer.kassio.projetogamer.utils;

import java.util.Calendar;

/**
 * Created by Kassio on 18/09/2017.
 */

public class Periodo {
    private Calendar periodo;

    public Periodo(){
        periodo = Calendar.getInstance();
    }

    public Calendar getPeriodo() {
        return periodo;
    }
}
