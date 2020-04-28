package com.sennagby.animelistapk2.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sennagby.animelistapk2.R;
import com.sennagby.animelistapk2.adapter.AdapterAction;
import com.sennagby.animelistapk2.adapter.AdapterComedy;
import com.sennagby.animelistapk2.adapter.AdapterHorror;

import java.util.ArrayList;
import java.util.List;

public class horror_fragment extends Fragment {
    RecyclerView recyclerView;
    List<Model_Horror> animelisthorror;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_horror, container, false);
        recyclerView= view.findViewById(R.id.list_rcyc);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        DataHorror();

        recyclerView.setAdapter(new AdapterHorror(DataHorror()));

        return view;
    }
    private List<Model_Horror> DataHorror() {
        animelisthorror= new ArrayList<>();
        animelisthorror.add(new Model_Horror(R.mipmap.ic_launcher,"Mirai Niki"));
        animelisthorror.add(new Model_Horror(R.mipmap.ic_launcher,"Another"));
        animelisthorror.add(new Model_Horror(R.mipmap.ic_launcher,"Attack On Titan"));
        animelisthorror.add(new Model_Horror(R.mipmap.ic_launcher,"Corpse Party"));
        return animelisthorror;
    }
}
