package br.com.projetogamer.kassio.projetogamer.mb.historia;

import java.util.List;

import br.com.projetogamer.kassio.projetogamer.modelo.Fase;
import br.com.projetogamer.kassio.projetogamer.modelo.Historia;
import br.com.projetogamer.kassio.projetogamer.utils.Periodo;

/**
 * Created by Kassio on 18/09/2017.
 */

public class AdicionarHistoriaMB {
    private Historia historia;


    public AdicionarHistoriaMB(Historia historia) {
        this.historia = historia;
//        this.periodo = new Periodo();
    }

    public void adicionarFaseConcluidaAoRegistro(Fase faseConcluida) {
//        this.fasesConcluidas.add(faseConcluida);
    }

    public void adicionarFase(Fase descricaoFaseAtual) {
//        historia.setDescricaoFaseAtual(descricaoFaseAtual);
        adicionarFaseConcluidaAoRegistro(descricaoFaseAtual);
    }

    public void concluirHistoria() {
        if (historia.isHistoriaAtiva()) {
            historia.setHistoriaAtiva(false);
        } else {
//            return exception
        }
    }

    public Historia getHistoria() {
        return historia;
    }

    public void setHistoria(Historia historia) {
        this.historia = historia;
    }
}
