package com.example.android.cricketscorer;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import Adapters.BowlerAdapter;
import Entity.Bowler;


public class BowlerFragment extends Fragment {

    RecyclerView mRecyclerView;
    public BowlerFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_bowler, container, false);
        mRecyclerView = view.findViewById(R.id.recycler_view);
        Bowler[] bowlers = (Bowler[]) getArguments().getSerializable("bowlers");
        mRecyclerView.setAdapter(new BowlerAdapter(bowlers));
        return view;
    }
}