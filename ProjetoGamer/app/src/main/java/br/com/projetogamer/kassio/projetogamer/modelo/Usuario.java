package br.com.projetogamer.kassio.projetogamer.modelo;

import com.orm.SugarRecord;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kassio on 19/09/2017.
 */

public class Usuario extends SugarRecord {
    private String login;
    private String senha;
    private String nome;
    private String email;
//    private Historia historia;
    private List<Historia> minhasHistorias;

    public Usuario() {

    }

    public Usuario(String login, String senha, String nome, String email) {
        this.login = login;
        this.senha = senha;
        this.nome = nome;
        this.email = email;
        minhasHistorias = new ArrayList<>();
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return this.nome;
    }
}
