package com.devproyect.colegio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class clsDetalle extends AppCompatActivity {
    ImageView imagen;
    TextView nombre;
    TextView tipo;
    TextView detalle;
    Button vermapa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cls_detalle);
        imagen=(ImageView) findViewById(R.id.imageView2);
        nombre=(TextView) findViewById(R.id.textView7);
        tipo=(TextView) findViewById(R.id.textView6);
        detalle=(TextView) findViewById(R.id.textView4);
        vermapa=(Button) findViewById(R.id.button);
        nombre.setText(GlobalDatos.col.nombre);
        imagen.setImageResource(GlobalDatos.col.imagen);
        tipo.setText(GlobalDatos.col.tipo);
        detalle.setText("Detalles:\n"+
                "Direccion: "+ GlobalDatos.col.direccion+"\n"+
                "Turno: "+ GlobalDatos.col.turno+"\n"+
                "Precio: "+ GlobalDatos.col.precio+"\n"+
                "Requisitos: "+ GlobalDatos.col.requisitos+"\n"+
                "Niveles: "+ GlobalDatos.col.niveles+"\n"
        );
        vermapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
            }
        });

    }
}
