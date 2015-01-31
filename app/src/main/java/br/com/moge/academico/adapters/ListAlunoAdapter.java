package br.com.moge.academico.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import br.com.moge.academico.R;
import br.com.moge.academico.domains.Aluno;

/**
 * Created by cd-107 on 31/01/2015.
 */
public class ListAlunoAdapter extends BaseAdapter {

    private Activity activity;
    private List<Aluno> aluno;

    public static ListAlunoAdapter getInstance(Activity activity, List<Aluno> aluno){

        ListAlunoAdapter alunosAdapter = new ListAlunoAdapter();
        alunosAdapter.activity = activity;
        alunosAdapter.aluno = aluno;

        return alunosAdapter;
    }

    @Override
    public int getCount() {
        return aluno.size();
    }

    @Override
    public Object getItem(int position) {
        return aluno.get(position);
    }

    @Override
    public long getItemId(int position) {
        return aluno.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.lista_de_cursos_item, null);
        }

        Aluno aluno = (Aluno) getItem(position);

        TextView nomeAluno = (TextView) convertView.findViewById(R.id.nomeAluno);
        TextView cpf = (TextView) convertView.findViewById(R.id.cpf);

        nomeAluno.setText(aluno.getNome());
        cpf.setText(aluno.getCpf());

        return convertView;
    }
}
