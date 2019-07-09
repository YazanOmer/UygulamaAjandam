package com.example.uygulamaajandam;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;


public class FragmentDorduncu extends Fragment {
    private RecyclerView rv;
    private MyAdapter adapter;
    private ArrayList<Filmler> filmlerArrayList;

    public FragmentDorduncu() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View viewroot=inflater.inflate(R.layout.fragment_dorduncu_layout,container,false);

        rv=viewroot.findViewById(R.id.rv);

        rv.setHasFixedSize(true);
        rv.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));

        Filmler f1=new Filmler("Django",15.99,"django");
        Filmler f2=new Filmler("Anadoluda",7.99,"birzamanlaranadoluda");
        Filmler f3=new Filmler("Inception",20.99,"inception");
        Filmler f4=new Filmler("Interstellar",25.99,"interstellar");
        Filmler f5=new Filmler("The hateful Eight",15.99,"thehatefuleight");
        Filmler f6=new Filmler("The Pianist",15.99,"thepianist");


        filmlerArrayList=new ArrayList<>();

        filmlerArrayList.add(f1);
        filmlerArrayList.add(f2);
        filmlerArrayList.add(f3);
        filmlerArrayList.add(f4);
        filmlerArrayList.add(f5);
        filmlerArrayList.add(f6);

        adapter=new MyAdapter(getContext(),filmlerArrayList);

        rv.setAdapter(adapter);




        return viewroot;







    }

}
