package br.com.moge.academico;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

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
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}