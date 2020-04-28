package com.sennagby.animelistapk2.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sennagby.animelistapk2.R;
import com.sennagby.animelistapk2.fragment.Model_action;
import com.sennagby.animelistapk2.fragment.Model_comedy;

import java.util.List;

public class AdapterComedy extends RecyclerView.Adapter<AdapterComedy.ViewHolder> {
    List<Model_comedy> animelistcomedy;

    public AdapterComedy(List<Model_comedy> animelistcomedy) {
        this.animelistcomedy = animelistcomedy;
    }

    @NonNull
    @Override
    public AdapterComedy.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.anime_grid, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imageComedy.setImageResource(animelistcomedy.get(position).getImage());
        holder.nameComedy.setText(animelistcomedy.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return animelistcomedy.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageComedy;
        TextView nameComedy;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageComedy = itemView.findViewById(R.id.image_grid_view);
            nameComedy = itemView.findViewById(R.id.text_name_grid);
        }
    }
}
