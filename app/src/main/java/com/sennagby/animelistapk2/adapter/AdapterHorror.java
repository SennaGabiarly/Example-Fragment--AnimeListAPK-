package com.sennagby.animelistapk2.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sennagby.animelistapk2.R;
import com.sennagby.animelistapk2.fragment.Model_Horror;
import com.sennagby.animelistapk2.fragment.Model_action;

import java.util.List;

public class AdapterHorror extends RecyclerView.Adapter<AdapterHorror.ViewHolder> {
    List<Model_Horror> animelisthorror;

    public AdapterHorror(List<Model_Horror> animelist) {
        this.animelisthorror = animelist;
    }

    @NonNull
    @Override
    public AdapterHorror.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.anime_list, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imageHorror.setImageResource(animelisthorror.get(position).getImage());
        holder.nameHorror.setText(animelisthorror.get(position).getName());
    }


    @Override
    public int getItemCount() {
        return animelisthorror.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageHorror;
        TextView nameHorror;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageHorror = itemView.findViewById(R.id.image_listview);
            nameHorror = itemView.findViewById(R.id.text_name);
        }
    }
}
