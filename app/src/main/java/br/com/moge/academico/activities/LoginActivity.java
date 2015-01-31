package br.com.moge.academico.activities;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import br.com.moge.academico.R;


public class LoginActivity extends ActionBarActivity {
    private EditText edtLogin;
    private EditText edtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtLogin = (EditText) findViewById(R.id.email);
        edtPassword = (EditText) findViewById(R.id.senha);

    }

    public void login(View v){

        if(edtLogin.getText().toString().equals("admin@cd.com.br") && edtPassword.getText().toString().equals("123")){
            Toast.makeText(this, "Login efetuado com sucesso!", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);

        }else{
            edtPassword.setError("Senha e/ou e-mail incorreto(s)!");
        }
    }


}
