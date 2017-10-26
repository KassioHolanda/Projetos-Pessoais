package br.com.projetogamer.kassio.projetogamer.mb.login;

import com.orm.SugarRecord;

import java.util.List;

import br.com.projetogamer.kassio.projetogamer.modelo.Usuario;

/**
 * Created by Kassio on 19/09/2017.
 */

public class RealizarLoginMB {
    public String login;
    public String senha;

    public RealizarLoginMB(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public void validarLogin() {

    }

    public boolean validarExistenciaUsuario() {
        if (!cadastroUsuariosCadastros().isEmpty()) {
            return true;
        }
        return false;
    }

    public List<Usuario> cadastroUsuariosCadastros() {
        List<Usuario> usuarios = SugarRecord.findWithQuery(Usuario.class, "SELECT * FROM Usuario WHERE login = ?", this.login);
        return usuarios;
    }
}

//SugarRecord.findWithQuery(Pessoa.class, "SELECT * FROM Pessoa WHERE nome = ?", "Rodrigo");
