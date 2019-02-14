package com.blogspot.kaisarjepang.databasetoko;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Thalhah on 13/02/2019.
 */

class TokoAdapter extends RecyclerView.Adapter<TokoAdapter.TokoViewHolder> {

    private ArrayList<HashMap<String,String>> listBarang;
    private Context context;
    public TokoAdapter(FragmentActivity activity,
                           ArrayList<HashMap<String, String>> Baranglist){
        this.context = activity;
        this.listBarang = Baranglist;

    }
    @NonNull
    @Override
    public TokoViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(context).inflate(R.layout.item_barang,viewGroup,false);
        return new TokoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TokoViewHolder tokoViewHolder, int i) {

        tokoViewHolder.txtnama.setText(listBarang.get(i).get("nama"));

        tokoViewHolder.txtstock.setText(listBarang.get(i).get("stock"));
    }

    @Override
    public int getItemCount() {
        return listBarang.size();
    }

    public class TokoViewHolder extends RecyclerView.ViewHolder {

        TextView txtnama, txtstock;

        public TokoViewHolder(@NonNull View itemView) {
            super(itemView);

            txtnama = itemView.findViewById(R.id.item_namabarang);
            txtstock= itemView.findViewById(R.id.item_stockbarang);
        }
    }
}
