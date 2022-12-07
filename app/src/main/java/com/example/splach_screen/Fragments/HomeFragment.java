package com.example.splach_screen.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.splach_screen.Adapter.HomeAdapter;
import com.example.splach_screen.Models.HomeModel;
import com.example.splach_screen.R;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
    RecyclerView recyclerView;
    ArrayList<HomeModel> homeModels = new ArrayList<>();
    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_home, container, false);
        setUpRecycler(view);
        return view;
    }

    private void setUpRecycler(View view) {
        homeModels.add(new HomeModel("Esraa Amr","11:20",R.drawable.model1,"Hello World",R.drawable.pyramids));
        homeModels.add(new HomeModel("Esraa Amr","11:20",R.drawable.model1,"Hello World",R.drawable.pyramids));
        homeModels.add(new HomeModel("Asmaa Muhammad","1:00",R.drawable.model3,"My New Car",R.drawable.car));
        HomeAdapter adapter = new HomeAdapter(homeModels);
        recyclerView = view.findViewById(R.id.home_recycler);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
    }
}