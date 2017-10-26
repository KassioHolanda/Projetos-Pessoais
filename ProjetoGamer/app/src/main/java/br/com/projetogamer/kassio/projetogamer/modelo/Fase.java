package br.com.projetogamer.kassio.projetogamer.modelo;

import com.orm.SugarRecord;

import java.util.Calendar;

import br.com.projetogamer.kassio.projetogamer.utils.Periodo;

/**
 * Created by Kassio on 18/09/2017.
 */

public class Fase extends SugarRecord {
    private String descricao;
    private Periodo horaInicio;
    private Periodo horaFim;

    public Fase(){}

    public Fase(String descricao) {
        this.descricao = descricao;
        this.horaInicio = new Periodo();
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Periodo getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Periodo horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Periodo getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(Periodo horaFim) {
        this.horaFim = horaFim;
    }
}


