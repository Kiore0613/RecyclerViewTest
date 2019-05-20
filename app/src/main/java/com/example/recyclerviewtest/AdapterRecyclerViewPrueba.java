package com.example.recyclerviewtest;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

public class AdapterRecyclerViewPrueba extends RecyclerView.Adapter<AdapterRecyclerViewPrueba.ViewHolderDatos> {
    int resul;

    //constructor para obtener el valor de la variable resultado
    public AdapterRecyclerViewPrueba(int resul) {
        this.resul = resul;
    }

    @NonNull
    public AdapterRecyclerViewPrueba.ViewHolderDatos onCreateViewHolder(@NonNull ViewGroup parent, int i) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_list_prueba, parent, false);
        return new ViewHolderDatos(view);
    }

    public void onBindViewHolder(ViewHolderDatos holder, final int position) {

    }

    //aca determino cuantas veces se va a repetir el EditText
    public int getItemCount() {
        return resul;

    }
    public class ViewHolderDatos extends RecyclerView.ViewHolder {
        EditText editTextPrueba;

        public ViewHolderDatos(View itemView) {
            super(itemView);
            editTextPrueba = itemView.findViewById(R.id.edt_test);
        }

    }
}
