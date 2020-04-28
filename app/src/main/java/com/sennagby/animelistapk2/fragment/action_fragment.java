package com.sennagby.animelistapk2.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sennagby.animelistapk2.R;
import com.sennagby.animelistapk2.adapter.AdapterAction;

import java.util.ArrayList;
import java.util.List;

public class action_fragment extends Fragment {
    RecyclerView recyclerView;
    List<Model_action> animelist;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_action, container, false);
        recyclerView= view.findViewById(R.id.list_item_action);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        DataAction();

        recyclerView.setAdapter(new AdapterAction(DataAction()));

        return view;
    }
    private List<Model_action> DataAction() {
        animelist= new ArrayList<>();
        animelist.add(new Model_action(R.mipmap.ic_launcher,"Naruto"));
        animelist.add(new Model_action(R.mipmap.ic_launcher,"Bleach"));
        animelist.add(new Model_action(R.mipmap.ic_launcher,"One Piece"));
        animelist.add(new Model_action(R.mipmap.ic_launcher,"Dragon Ball"));
        return animelist;
    }
}
