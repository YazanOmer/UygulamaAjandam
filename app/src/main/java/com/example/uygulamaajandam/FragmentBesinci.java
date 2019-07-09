package com.example.uygulamaajandam;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;

public class FragmentBesinci extends Fragment {
    private RecyclerView rv2;
    private ArrayList<Oyunlar> oyunList;
    private OyunAdapter oyunAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        View viewroot6=inflater.inflate(R.layout.fragment_besinci_layout,container,false);


        rv2=viewroot6.findViewById(R.id.rv2);


        rv2.setHasFixedSize(true);
        rv2.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));


        Oyunlar o1=new Oyunlar("PES2019",55.44,"pes2019",4);
        Oyunlar o2=new Oyunlar("FİFA2019",60.44,"fifa",3);
        Oyunlar o3=new Oyunlar("CSG0",27.44,"csgo",4.5);
        Oyunlar o4=new Oyunlar("PUPG",70.44,"pupg",4);
        Oyunlar o5=new Oyunlar("NFS",55.44,"need",4);
        Oyunlar o6=new Oyunlar("CALLOFD.",100,"call",4);


        oyunList=new ArrayList<>();

        oyunList.add(o1);
        oyunList.add(o2);
        oyunList.add(o5);
        oyunList.add(o4);
        oyunList.add(o3);
        oyunList.add(o6);


        oyunAdapter=new OyunAdapter(getContext(),oyunList);

        rv2.setAdapter(oyunAdapter);





        return viewroot6;

    }



}
