package com.sennagby.animelistapk2.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sennagby.animelistapk2.R;
import com.sennagby.animelistapk2.adapter.AdapterAction;
import com.sennagby.animelistapk2.adapter.AdapterComedy;

import java.util.ArrayList;
import java.util.List;

public class comedy_fragment extends Fragment {
    RecyclerView recyclerView;
    List<Model_comedy> animelistcomedy;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_comedy, container, false);
        recyclerView= view.findViewById(R.id.list_rcych);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(container.getContext(), 2));
        //DataComedy();

        recyclerView.setAdapter(new AdapterComedy(DataComedy()));

        return view;
    }
    private List<Model_comedy> DataComedy() {
        animelistcomedy= new ArrayList<>();
        animelistcomedy.add(new Model_comedy(R.mipmap.ic_launcher,"Konosuba"));
        animelistcomedy.add(new Model_comedy(R.mipmap.ic_launcher,"Beelzebub"));
        animelistcomedy.add(new Model_comedy(R.mipmap.ic_launcher,"GTO"));
        animelistcomedy.add(new Model_comedy(R.mipmap.ic_launcher,"Gintama"));
        return animelistcomedy;
    }
}
