package br.com.projetogamer.kassio.projetogamer.modelo;

import com.orm.SugarRecord;

import java.util.ArrayList;
import java.util.List;

import br.com.projetogamer.kassio.projetogamer.utils.Periodo;

/**
 * Created by Kassio on 18/09/2017.
 */

public class Historia extends SugarRecord {
    private Jogo jogo;
    private boolean historiaAtiva;
    private String plataformaJogada;
    private Fase faseAtual;
    private Periodo periodo;
    private List<Fase> fasesConcluidas;

    public Historia() {
    }

    public Historia(Jogo jogo) {
        this.jogo = jogo;
        this.historiaAtiva = true;
        periodo = new Periodo();
        fasesConcluidas = new ArrayList<>();
    }

    public Jogo getJogo() {
        return jogo;
    }

    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }

    public boolean isHistoriaAtiva() {
        return historiaAtiva;
    }

    public void setHistoriaAtiva(boolean historiaAtiva) {
        this.historiaAtiva = historiaAtiva;
    }

    public String getPlataformaJogada() {
        return plataformaJogada;
    }

    public void setPlataformaJogada(String plataformaJogada) {
        this.plataformaJogada = plataformaJogada;
    }

    public Fase getFaseAtual() {
        return faseAtual;
    }

    public void setFaseAtual(Fase faseAtual) {
        this.faseAtual = faseAtual;
    }

    public Periodo getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }

    public List<Fase> getFasesConcluidas() {
        return fasesConcluidas;
    }

    public void setFasesConcluidas(List<Fase> fasesConcluidas) {
        this.fasesConcluidas = fasesConcluidas;
    }
}
