package com.example.uygulamaajandam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class TahminActivity extends AppCompatActivity {
    private TextView kalanHak,yardim;
    private EditText sayiAl;
    private Button tahminEt;
    private int sayac=5;
    private int rastgeleSayi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tahmin);



        kalanHak=findViewById(R.id.textViewKalan);
        yardim=findViewById(R.id.textViewYardim);
        sayiAl=findViewById(R.id.editTextGirdi);
        tahminEt=findViewById(R.id.buttonBasla);

        Random r=new Random();

        rastgeleSayi=r.nextInt(101);//0 ile 100

        Log.e("Rasgele Sayı",String.valueOf(rastgeleSayi));

        tahminEt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sayac=sayac-1;

                int tahmin=Integer.parseInt(sayiAl.getText().toString());

                if(sayac!=0||tahmin==rastgeleSayi){

                    if(tahmin==rastgeleSayi){
                        Intent i=new Intent(TahminActivity.this,SonucActivity.class);
                        i.putExtra("sonuc",true);
                        startActivity(i);
                        finish();
                    }

                    if(tahmin>rastgeleSayi) {
                        yardim.setText("Azalt");

                    }

                    if(tahmin<rastgeleSayi) {
                        yardim.setText("Arttır");

                    }

                    kalanHak.setText("Kalan Hak: "+sayac);

                }

                else{
                    //Sayac=0 Kaybettik
                    Intent i=new Intent(TahminActivity.this,SonucActivity.class);
                    i.putExtra("sonuc",false);
                    startActivity(i);
                    finish();

                }

                sayiAl.setText("");


            }
        });


















    }
}
