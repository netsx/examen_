package com.core.examen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


/**
 *
 *
 *
 *
 * */
public class Vehiculo extends AppCompatActivity {


    private List<Pojo> pojo = new ArrayList<>();
    private Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehiculo);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);


        adapter = new Adapter(pojo);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

        addData();
    }

    private void addData() {

        Pojo datos = new Pojo ("Marca","Volkwagen");
        pojo .add(datos);


         datos = new Pojo ("Modelo","Jetta");
        pojo .add(datos);

        datos = new Pojo ("Estadp","CDMX");
        pojo .add(datos);

        datos = new Pojo ("Año","2019");
        pojo .add(datos);
        datos = new Pojo ("Holograma","00");
        pojo .add(datos);

        datos = new Pojo ("Placa Frontal","CDE-589");
        pojo .add(datos);

        datos = new Pojo ("Numero de clindros","12");
        pojo .add(datos);


    }

}
