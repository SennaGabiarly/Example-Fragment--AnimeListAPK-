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

import java.util.List;

public class AdapterAction extends RecyclerView.Adapter<AdapterAction.ViewHolder> {
    List<Model_action> animelistaction;

    public AdapterAction(List<Model_action> animelist) {
        this.animelistaction = animelist;
    }

    @NonNull
    @Override
    public AdapterAction.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.anime_list, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull AdapterAction.ViewHolder holder, int position) {
        holder.imageAction.setImageResource(animelistaction.get(position).getImage());
        holder.nameAction.setText(animelistaction.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return animelistaction.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageAction;
        TextView nameAction;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageAction = itemView.findViewById(R.id.image_listview);
            nameAction = itemView.findViewById(R.id.text_name);
        }
    }
}
