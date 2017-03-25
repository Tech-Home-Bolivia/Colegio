package com.devproyect.colegio;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by victor on 3/18/17.
 */

public class AdaptadorColegio extends BaseAdapter {
    public List<Colegio> lista;
    public Context c;
    public LayoutInflater l;

    public AdaptadorColegio(List<Colegio> col,Context cx){
        lista=col;
        c=cx;
        l=(LayoutInflater) cx.getSystemService
           (Context.LAYOUT_INFLATER_SERVICE);

    }



    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public Object getItem(int position) {
        return lista.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
    public class Holder{
        ImageView imagen;
        TextView nombre;
        TextView tipo;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View item=l.inflate(R.layout.item_colegio,null);
        Holder h= new Holder();
        h.imagen=(ImageView) item.findViewById(R.id.imageView);
        h.imagen.setImageResource(lista.get(position).imagen);
        h.nombre=(TextView) item.findViewById(R.id.textView3);
        h.nombre.setText(lista.get(position).nombre);
        h.tipo=(TextView) item.findViewById(R.id.textView2);
        h.tipo.setText(lista.get(position).tipo);
        return item;
    }
}
