package com.example.soposicionament;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter_concerts extends RecyclerView.Adapter<Adapter_concerts.ViewHolder> {

    Concert[] concert;

    Context context;
    Intent intent;
    String url;
    public Adapter_concerts(Concert[] concert, Context context) {
        this.concert = concert;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.from(parent.getContext()).inflate(R.layout.adapter_layout_concerts, parent
        ,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Concert concertList = concert[position];
        holder.data.setText(concertList.getData());
        holder.ubicacio.setText(concertList.getUbicacio());
        holder.imatge.setImageResource(concertList.getImatge());


    }

    @Override
    public int getItemCount() {
        return concert.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView data;
        TextView ubicacio;
        ImageView imatge;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            data = itemView.findViewById(R.id.data);
            ubicacio = itemView.findViewById(R.id.ubi);
            imatge = itemView.findViewById(R.id.imllista);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Uri uri = Uri.parse("https://mikinunez.com/");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    v.getContext().startActivity(intent);
                }
            });
        }


    }
}
