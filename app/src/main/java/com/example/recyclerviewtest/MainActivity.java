package com.example.recyclerviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.ViewUtils;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerViewPrueba;
    EditText editTextNumero1, editTextNumero2;

    String numero1, numero2;
    int resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewPrueba = findViewById(R.id.rv_prueba);
        editTextNumero1 = findViewById(R.id.edt_numero1);
        editTextNumero2 = findViewById(R.id.edt_numero2);



    }

    public void calcular(View btn_calcular) {

        numero1 = editTextNumero1.getText().toString().trim();
        numero2 = editTextNumero2.getText().toString().trim();

        resultado = Integer.valueOf(numero1) + Integer.valueOf(numero2);

        editTextNumero2.setText("" + resultado);

        recyclerViewPrueba.setLayoutManager(new LinearLayoutManager(this));

        //aca le paso el valor de la variable resultado
        AdapterRecyclerViewPrueba adapter = new AdapterRecyclerViewPrueba(resultado);
        recyclerViewPrueba.setAdapter(adapter);


        recyclerViewPrueba.addItemDecoration(
                new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));


    }
}
