package br.com.moge.academico.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import br.com.moge.academico.domains.Curso;
import br.com.moge.academico.R;

/**
 * Created by cd-107 on 24/01/2015.
 */
public class ListCursoAdapter extends BaseAdapter{

    private Activity activity;
    private List<Curso> cursos;

    public static ListCursoAdapter getInstance(Activity activity, List<Curso> cursos){
        ListCursoAdapter adapter = new ListCursoAdapter();
        adapter.activity = activity;
        adapter.cursos = cursos;

        return adapter;
    }

    private ListCursoAdapter(){}

    @Override
    public int getCount() {
        return cursos.size();
    }

    @Override
    public Object getItem(int position) {
        return cursos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return cursos.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.lista_de_cursos_item, null);
        }

        Curso curso = (Curso) getItem(position);

        TextView txtNomeCurso = (TextView) convertView.findViewById(R.id.txtNomeCurso);
        TextView txtStatus = (TextView) convertView.findViewById(R.id.txtStatusCurso);

        txtNomeCurso.setText(curso.getNome());
        txtStatus.setText(curso.getStatus());

        return convertView;
    }
}
