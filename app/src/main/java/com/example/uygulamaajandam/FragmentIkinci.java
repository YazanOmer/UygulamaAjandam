package com.example.uygulamaajandam;


import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;



public class FragmentIkinci extends Fragment {
    private ConstraintLayout cv;
    private Button button0,button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,button12,button13,button14,button15,button16,button17,button18;
    private TextView goster;
    private Boolean toplama=false,cıkarma=false,carpma=false,bolme=false,mod=false,onluk=false;
    private double sayi1=0,sayi2=0;
    private Timer timer;
    private TimerTask timerTask;
    private Handler timerHandler = new Handler();
    private int id=0;
    private ArrayList<Button> buttons;
    private String[] buton={"0","1","2","3","4","5","6","7","8","9","Mod",".","/","*","-","+","Sil","="};
    private String s,a;


    public FragmentIkinci() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View viewroot3=inflater.inflate(R.layout.fragment_ikinci_layout,container,false);

        button0=viewroot3.findViewById(R.id.button0);
        button1=viewroot3.findViewById(R.id.button1);
        button2=viewroot3.findViewById(R.id.button2);
        button3=viewroot3.findViewById(R.id.button3);
        button4=viewroot3.findViewById(R.id.button4);
        button5=viewroot3.findViewById(R.id.button5);
        button6=viewroot3.findViewById(R.id.button6);
        button7=viewroot3.findViewById(R.id.button7);
        button8=viewroot3.findViewById(R.id.button8);
        button9=viewroot3.findViewById(R.id.button9);
        button10=viewroot3.findViewById(R.id.button10);
        button11=viewroot3.findViewById(R.id.button11);
        button12=viewroot3.findViewById(R.id.button12);
        button13=viewroot3.findViewById(R.id.button13);
        button14=viewroot3.findViewById(R.id.button14);
        button15=viewroot3.findViewById(R.id.button15);
        button16=viewroot3.findViewById(R.id.button16);
        button17=viewroot3.findViewById(R.id.button17);
        button18=viewroot3.findViewById(R.id.button18);

        goster=viewroot3.findViewById(R.id.goster);
        cv=viewroot3.findViewById(R.id.cv);


        buttons=new ArrayList<>();
        buttons.add(button0);
        buttons.add(button1);
        buttons.add(button2);
        buttons.add(button3);
        buttons.add(button4);
        buttons.add(button5);
        buttons.add(button6);
        buttons.add(button7);
        buttons.add(button8);
        buttons.add(button9);
        buttons.add(button10);
        buttons.add(button11);
        buttons.add(button12);
        buttons.add(button13);
        buttons.add(button14);
        buttons.add(button15);
        buttons.add(button16);
        buttons.add(button17);





        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                timer = new Timer();
                timerTask= new TimerTask() {
                    public void run() {

                        timerHandler.post(new Runnable() {
                            public void run(){

                                buttons.get(id).setText(buton[id]);
                                if(id<10) {
                                    buttons.get(id).setBackgroundColor(Color.rgb(255, 165, 0));
                                }

                                if(9<id && id<16){
                                    buttons.get(id).setBackgroundColor(Color.rgb(0, 204, 0));
                                }

                                if(15<id && id<18){
                                    buttons.get(id).setBackgroundColor(Color.rgb(0, 153, 255));
                                    button18.setBackgroundColor(Color.rgb(0, 153, 255));
                                }

                                id++;
                                if(id==18){


                                    timer.cancel();


                                }

                            }
                        });
                    }
                };

                timer.scheduleAtFixedRate(timerTask, 0, 100);




                button16.setVisibility(View.INVISIBLE);
                button18.setVisibility(View.VISIBLE);

            }
        });

        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goster.setText("");
                sayi1=0.0;
                sayi2=0.0;
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                goster.setText(goster.getText()+"0");


            }
        });


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goster.setText(goster.getText()+"1");

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goster.setText(goster.getText()+"2");

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goster.setText(goster.getText()+"3");

            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goster.setText(goster.getText()+"4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goster.setText(goster.getText()+"5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goster.setText(goster.getText()+"6");

            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goster.setText(goster.getText()+"7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goster.setText(goster.getText()+"8");

            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goster.setText(goster.getText()+"9");

            }
        });

        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(goster.getText().length()!=0){
                    sayi1=Double.parseDouble(goster.getText()+"");
                    toplama=true;
                    onluk=false;
                    goster.setText(null);
                }



            }
        });

        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(goster.getText().length()!=0){
                    sayi1=Double.parseDouble(goster.getText()+"");
                    cıkarma=true;
                    onluk=false;
                    goster.setText(null);
                }

            }
        });

        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(goster.getText().length()!=0){
                    sayi1=Double.parseDouble(goster.getText()+"");
                    carpma=true;
                    onluk=false;
                    goster.setText(null);
                }
            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(goster.getText().length()!=0){
                    sayi1=Double.parseDouble(goster.getText()+"");
                    bolme=true;
                    onluk=false;
                    goster.setText(null);
                }
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(goster.getText().length()!=0){
                    sayi1=Double.parseDouble(goster.getText()+"");
                    mod=true;
                    onluk=false;
                    goster.setText(null);
                }

            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(onluk){

                }else {
                    goster.setText(goster.getText()+".");
                    onluk=true;
                }

            }
        });

        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(toplama || cıkarma || carpma|| bolme || mod){


                    sayi2=Double.parseDouble(goster.getText()+"");
                }


                if(toplama){

                    goster.setText(sayi1+sayi2+"");
                    toplama=false;
                }

                if(cıkarma){
                    goster.setText(sayi1-sayi2+"");
                    cıkarma=false;

                }
                if(carpma){
                    goster.setText(sayi1*sayi2+"");
                    carpma=false;
                }
                if(bolme){
                    goster.setText(sayi1/sayi2+"");
                    bolme=false;
                }
                if(mod){
                    goster.setText(sayi1%sayi2+"");
                    mod=false;
                }




            }
        });








        // Inflate the layout for this fragment
        return viewroot3;
    }

}

