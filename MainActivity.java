package com.xcheko51x.recyclerviewhorizontal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvCategorias;
    AdaptadorCategorias adaptador;

    List<Categoria> listaCategorias = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCategorias = findViewById(R.id.rvCategorias);
        rvCategorias.setLayoutManager(new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false));

        listaCategorias.add(new Categoria("1", "Hogar"));
        listaCategorias.add(new Categoria("2", "Electronica"));
        listaCategorias.add(new Categoria("3", "Ferreteria"));
        listaCategorias.add(new Categoria("4", "Paaeleria"));
        listaCategorias.add(new Categoria("5", "Dulceria"));

        adaptador = new AdaptadorCategorias(MainActivity.this, listaCategorias);
        rvCategorias.setAdapter(adaptador);
    }
}
