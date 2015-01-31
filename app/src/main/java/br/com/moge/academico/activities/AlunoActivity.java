package br.com.moge.academico.activities;

import android.app.ProgressDialog;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

import br.com.moge.academico.R;
import br.com.moge.academico.adapters.ListAlunoAdapter;
import br.com.moge.academico.domains.Aluno;


public class AlunoActivity extends ActionBarActivity {
    private ListView listaAlunos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aluno);

        ProgressDialog dialog = new ProgressDialog(this);
        dialog.setMessage("Buscando Alunos");
        dialog.setCancelable(false);
        dialog.show();


        listaAlunos = (ListView) findViewById(R.id.listaAluno);

        ArrayList<Aluno> alunos = (ArrayList<Aluno>) getIntent().getSerializableExtra("alunos");
        ListAlunoAdapter adapter = ListAlunoAdapter.getInstance(this, alunos);
        listaAlunos.setAdapter(adapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_aluno, menu);
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
}
