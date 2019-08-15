package com.xcheko51x.recyclerviewhorizontal;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class AdaptadorCategorias extends RecyclerView.Adapter<AdaptadorCategorias.CategoriaViewHolder> {

    Context context;
    List<Categoria> listaCategorias;

    public AdaptadorCategorias(Context context, List<Categoria> listaCategorias) {
        this.context = context;
        this.listaCategorias = listaCategorias;
    }

    @NonNull
    @Override
    public AdaptadorCategorias.CategoriaViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_rv_categoria, null, false);
        return new AdaptadorCategorias.CategoriaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorCategorias.CategoriaViewHolder categoriaViewHolder, int i) {
        categoriaViewHolder.tvNomCategoria.setText(listaCategorias.get(i).getNomCategoria());
    }

    @Override
    public int getItemCount() {
        return listaCategorias.size();
    }

    public class CategoriaViewHolder extends RecyclerView.ViewHolder {

        TextView tvNomCategoria;

        public CategoriaViewHolder(@NonNull View itemView) {
            super(itemView);

            tvNomCategoria = itemView.findViewById(R.id.tvNomCategoria);
        }
    }
}
