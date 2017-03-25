package com.devproyect.colegio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class clsPrincipal extends AppCompatActivity {
List<Colegio> listacolegio;
    ListView  lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cls_principal);
        listacolegio= new ArrayList<>();
        llenarlista();
        lista=(ListView) findViewById(R.id.milistadecolegios);
        AdaptadorColegio adap= new AdaptadorColegio(listacolegio,this);
        lista.setAdapter(adap);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                GlobalDatos.col=listacolegio.get(position);
                startActivity(new Intent(clsPrincipal.this,clsDetalle.class));
            }
        });


    }

    public void llenarlista() {
        listacolegio.add(new Colegio(R.drawable.logocolprogreso,
                "Col. El Progreso","EL Torno"
                ,"Privado","Manana y tarde",
                "240bs","Primario y Secundaria",
                "Certificado de Nacimiento",
                "-17.988522", "-63.376556"));

    }
}
