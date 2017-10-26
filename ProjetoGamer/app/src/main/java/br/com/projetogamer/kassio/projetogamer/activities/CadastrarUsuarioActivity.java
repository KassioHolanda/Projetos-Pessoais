package br.com.projetogamer.kassio.projetogamer.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

import br.com.projetogamer.kassio.projetogamer.R;
import br.com.projetogamer.kassio.projetogamer.mb.usuario.AdicionarUsuarioMB;

public class CadastrarUsuarioActivity extends AppCompatActivity {

    private EditText nomeUsuario;
    private EditText emailUsuario;
    private EditText loginAcessoUsuario;
    private EditText senha1;
    private EditText senha2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_usuario);

        nomeUsuario = findViewById(R.id.nome_usuario_id);
        emailUsuario = findViewById(R.id.email_usuario_id);
        loginAcessoUsuario = findViewById(R.id.login_acesso__usuario_id);
        senha1 = findViewById(R.id.senha1_usuario_id);
        senha2 = findViewById(R.id.senha2_usuario_id);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_salvar, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.botao_salvar_menu_id:
                AdicionarUsuarioMB adicionarUsuarioMB = new AdicionarUsuarioMB();
                adicionarUsuarioMB.SalvarUsuario(nomeUsuario.getText().toString(), emailUsuario.getText().toString(), loginAcessoUsuario.getText().toString(), senha1.getText().toString(), senha2.getText().toString());
                Toast.makeText(getApplicationContext(), "Usuario Salvo", Toast.LENGTH_LONG).show();
                finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
