package br.com.projetogamer.kassio.projetogamer.mb.usuario;

import com.orm.SugarRecord;

import java.util.List;

import br.com.projetogamer.kassio.projetogamer.modelo.Usuario;

/**
 * Created by Kassio on 19/09/2017.
 */

public class AdicionarUsuarioMB {
    private Usuario usuario;
    private String senha1;
    private String senha2;

    public void SalvarUsuario(String nome, String email, String login, String senha1, String senha2) {
        if (validarSenha(senha1, senha2)) {
            usuario = new Usuario(nome, email, login, senha1);
            usuario.save();
        } else {
//            exception
        }
    }

    public boolean validarSenha(String senha1, String senha2) {
        if (senha1 == senha2) {
            return false;
        }
        return true;
    }

    public List<Usuario> cadastroUsuariosCadastros() {
        List<Usuario> usuarios = SugarRecord.findWithQuery(Usuario.class, "SELECT * FROM Usuario WHERE login = ?", this.usuario.getLogin());
        return usuarios;
    }
}
