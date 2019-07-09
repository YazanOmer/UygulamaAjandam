package com.example.uygulamaajandam;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;



public class FragmentUcuncu extends Fragment {
    private Button butonBasla;

    public FragmentUcuncu() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View viewroot4=inflater.inflate(R.layout.fragment_ucuncu_layout,container,false);


        butonBasla=viewroot4.findViewById(R.id.buttonBasla);

        butonBasla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getContext(),TahminActivity.class);
                startActivity(i);
            }
        });






        // Inflate the layout for this fragment
        return viewroot4;
    }

}
