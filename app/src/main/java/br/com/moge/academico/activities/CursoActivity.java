package br.com.moge.academico.activities;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

import br.com.moge.academico.domains.Aluno;
import br.com.moge.academico.domains.Curso;
import br.com.moge.academico.R;


public class CursoActivity extends ActionBarActivity {

    private TextView txtNomeCurso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_curso);

        txtNomeCurso = (TextView) findViewById(R.id.txtNomeCurso);

        Intent intent = getIntent();
        Curso curso = (Curso) intent.getSerializableExtra("curso");

        txtNomeCurso.setText(curso.getNome());

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_curso, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void listarAlunos(View v){
        ArrayList<Aluno> alunos = new ArrayList<>();

        Aluno a1 = new Aluno();
        a1.setId(1);
        a1.setNome("Hermogenes");
        a1.setCpf("154.564.123.56");

        Aluno a2 = new Aluno();
        a2.setId(1);
        a2.setNome("Cesar");
        a2.setCpf("178.564.123.56");

        Aluno a3 = new Aluno();
        a3.setId(1);
        a3.setNome("Helder");
        a3.setCpf("194.564.123.56");

        alunos.add(a1);
        alunos.add(a2);
        alunos.add(a3);

        Intent i = new Intent(this, AlunoActivity.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("alunos", alunos);

        i.putExtras(bundle);

        startActivity(i);
    }
}
