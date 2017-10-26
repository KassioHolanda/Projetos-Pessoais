package br.com.projetogamer.kassio.projetogamer.modelo;

import com.orm.SugarRecord;

/**
 * Created by Kassio on 18/09/2017.
 */

public class Jogo extends SugarRecord {
    private String nome;
    private String categoria;

    public Jogo(){}

    public Jogo(String nome, String categoria) {
        this.nome = nome;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

}
