package com.example.uygulamaajandam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class SifreActivity extends AppCompatActivity {
    private EditText sifre1,sifre2;
    private TextView sifreSorun,sifreDurum;
    private SeekBar seekBar;
    private Button  sifreDegistir;
    private String s1,s2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sifre);


        sifre1=findViewById(R.id.editText5);
        sifre2=findViewById(R.id.editText6);
        sifreSorun=findViewById(R.id.sifreSorun2);
        sifreDurum=findViewById(R.id.sifreDurum2);
        sifreDegistir=findViewById(R.id.sifreDegistir2);
        seekBar=findViewById(R.id.seekBar2);




        sifre1.addTextChangedListener(new TextWatcher() {
            @Override

            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                s1=sifre1.getText().toString();

                seekBar.setProgress(s1.length());

                if(s1.length()<6){
                    sifreDurum.setText("Sifre zayif");
                    sifreDurum.setTextColor(Color.RED);
                }
                else if(6<=s1.length()&&s1.length()<8){
                    sifreDurum.setText("Sifre normal");
                    sifreDurum.setTextColor(Color.BLUE);
                }
                else {
                    sifreDurum.setText("Sifre Güclü");
                    sifreDurum.setTextColor(Color.GREEN);
                }


            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });


        sifre2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {


                s2=sifre2.getText().toString();
                if(s2.equals(s1)){
                    sifreSorun.setText("Sifreler aynı");
                }
                else{
                    sifreSorun.setText("Sifreler uyusmuyor");
                }




            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });


           sifreDegistir.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Toast.makeText(getApplicationContext(),"Şifre başarıyla değiştirildi",Toast.LENGTH_SHORT).show();
                   Intent i3=new Intent(SifreActivity.this,MainActivity.class);
                   i3.putExtra("bool3",true);
                   i3.putExtra("sifre",s2);
                   startActivity(i3);
               }
           });





    }
}
