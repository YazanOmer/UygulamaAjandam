package com.example.uygulamaajandam;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.fragment.app.Fragment;


public class FragmentBirinci extends Fragment {
    private EditText editTextBoy;
    private SeekBar seekBarKilo;
    private TextView textViewKilo,textViewİdeal,textViewDurum;
    private RadioButton bay,bayan;
    private Button buttonGoster;

    private double boy=0.0;
    private int kilo=0;

    public FragmentBirinci() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View viewroot2=inflater.inflate(R.layout.fragment_birinci_layout,container,false);

        editTextBoy=viewroot2.findViewById(R.id.editTextBoy);
        seekBarKilo=viewroot2.findViewById(R.id.seekBarKilo);
        textViewDurum=viewroot2.findViewById(R.id.textViewDurum);
        textViewİdeal=viewroot2.findViewById(R.id.textViewİdeal);
        textViewKilo=viewroot2.findViewById(R.id.textViewKilo);
        bay=viewroot2.findViewById(R.id.bay);
        bayan=viewroot2.findViewById(R.id.bayan);
        buttonGoster=viewroot2.findViewById(R.id.buttonGoster);

        seekBarKilo.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                kilo=i;
                textViewKilo.setText("Kilo: "+i);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        buttonGoster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boy=Double.parseDouble(editTextBoy.getText().toString())/100.0;


                int idealKilobay= (int) (50+2.3*(boy*100*0.4-60));
                int idealKilobayan= (int) (45.5+2.3*(boy*100*0.4-60));


                double vki=kilo/(boy*boy);


                if(bay.isChecked()) {

                    textViewİdeal.setText(String.valueOf(idealKilobay));

                    if(vki<=20.7){
                        textViewDurum.setText("Zayifsiniz");

                    }else if (20.7<vki&&vki<=26.4){
                        textViewDurum.setText("Kilonuz İdeal");
                    }else if(26.4<vki && vki<=27.8){
                        textViewDurum.setText("Kilonuz Normalden fazla");
                    }else if(27.8<vki&&vki<=31.1){
                        textViewDurum.setText("Fazla Kilolu");
                    }else if(31.1<vki&&vki<=34.9){
                        textViewDurum.setText("Obez");
                    }else {
                        textViewDurum.setText("Doktora başvurunuz.");
                    }


                }

                if(bayan.isChecked()){

                    textViewİdeal.setText(String.valueOf(idealKilobayan));


                    if(vki<=19.1){
                        textViewDurum.setText("Zayifsiniz");

                    }else if (19.1<vki&&vki<=25.8){
                        textViewDurum.setText("Kilonuz İdeal");
                    }else if(25.8<vki&&vki<=27.3){
                        textViewDurum.setText("Kilonuz Normalden fazla");
                    }else if(27.3<vki&&vki<=32.3){
                        textViewDurum.setText("Fazla Kilolu");
                    }else if(32.3<vki&&vki<=34.9){
                        textViewDurum.setText("Obez");
                    }else {
                        textViewDurum.setText("Doktora başvurunuz.");
                    }



                }





            }
        });





        // Inflate the layout for this fragment
        return viewroot2;
    }

}
