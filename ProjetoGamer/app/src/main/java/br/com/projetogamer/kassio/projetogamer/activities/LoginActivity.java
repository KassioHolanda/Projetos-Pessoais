package br.com.projetogamer.kassio.projetogamer.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import br.com.projetogamer.kassio.projetogamer.R;
import br.com.projetogamer.kassio.projetogamer.mb.login.RealizarLoginMB;

public class LoginActivity extends AppCompatActivity {
    private EditText login;
    private EditText senha;
    private TextView naoTemCadastro;
    private Button entrar;
    private Button teste;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login = findViewById(R.id.login_id);
        senha = findViewById(R.id.senha_id);
        entrar = findViewById(R.id.button_entrar_id);
        naoTemCadastro = findViewById(R.id.nao_possui_cadastro_id);
//        teste = findViewById(R.id.teste);

        entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    RealizarLoginMB realizarLoginMB = new RealizarLoginMB(login.getText().toString(), senha.getText().toString());
//                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    startActivity(new Intent(getApplicationContext(), PaginaIncialActivity.class));
                } catch (Exception e) {
//                    exception
                }
            }
        });

        naoTemCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), CadastrarUsuarioActivity.class));
            }
        });
    }
}
